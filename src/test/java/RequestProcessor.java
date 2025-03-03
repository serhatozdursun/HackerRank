import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class RequestProcessor {

    private static final int ITERATIONS = 1000;
    private static final int OUTPUT_KEY_LENGTH = 32; // 256 bits / 8 = 32 bytes

    public byte[] getSecretKey(
            String key,
            byte[] salt,
            int iterations,
            int derivedKeyLength
    ) throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeySpec spec = new PBEKeySpec(
                key.toCharArray(),
                salt,
                iterations,
                derivedKeyLength
        );

        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        return secretKeyFactory.generateSecret(spec).getEncoded();
    }


    public byte twoHexDigitsToByte(String input) {
        //  java treats bytes as signed values so go via integer to eliminate range exceptions
        return (byte) Integer.parseInt(input, 16);
    }

    String salt = "PFVxTn4LBvytA3m!saRtC9W9";
    //System.out.println(salt);
    byte[] saltBytes = salt.getBytes();
    String key = "keaDKxVY-K2vErNGLfNAvotw";
    byte[] theSecretKeyAsArray = secretKeyAsArray(key, saltBytes);

    public byte[] secretKeyAsArray(String key, byte[] saltBytes) {
        try {
            return getSecretKey(key, saltBytes, ITERATIONS, OUTPUT_KEY_LENGTH);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    String theSecretKey = theSecretKeyAsArray.toString();

    public String processRequest(String requestBodyNoWhitespace, String userId){
        String hashInput = requestBodyNoWhitespace + userId;

        byte[] hashInputBytes = new byte[0];
        try {
            hashInputBytes = hashInput.getBytes("UTF-8");
            //System.out.println(hashInputBytes);
        } catch (Exception e) {
            System.out.println("Error caused by unrecognised encoding");
            throw new RuntimeException(e.getMessage());
        }

        byte[] hashOutputBytes = new byte[0];
        try {
            hashOutputBytes = getHash(theSecretKeyAsArray, hashInputBytes);
        } catch (Exception e) {
            System.out.println("Error caused by unsuccessful hash");
            throw new RuntimeException(e.getMessage());
        }

        String hashOutputHexString = Hex.encodeHexString(hashOutputBytes);
        return Base64.getEncoder().encodeToString(hashOutputBytes);
    }

    public byte[] getHash(byte[] key, byte[] data) throws Exception {
        String algorithm = "HmacSHA256";
        Mac hmac = Mac.getInstance(algorithm);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
        hmac.init(secretKeySpec);
        return hmac.doFinal(data);
    }

    @Test
    public void test() {
        String registerBody1 = "{\"profile\":{\"email\":\"babshsh@hahs.com\",\"isNewsletterEnabled\":false,\"firstName\":\"Hshshs\",\"lastName\":\"Babsns\",\"customData\":{\"birthday\":\"2024-09-13\"},\"phone\":\"\"},\"credentials\":{\"password\":\"gsgshshbAhsh!1\",\"username\":\"babshsh@hahs.com\"}}\n";

        String poqUserId = "646466B4-AD1F-4C8F-B51B-238F74DA8B81";


        String encodedKey = processRequest(registerBody1, poqUserId);
        System.out.println("Encoded key (base64): " + encodedKey);
    }
}
