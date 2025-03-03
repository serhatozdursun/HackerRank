import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class Encode {

    public static void main(String[] args) {
        String deepLink = "lookbook_id=910&title=LB WithoutHotspot";

        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("lookbook_id", "910");
        requestParams.put("title", "LB WithoutHotspot");
        String encodedURL = requestParams.keySet().stream()
                .map(key -> key + "=" + encodeValue(requestParams.get(key)))
                .collect(joining("&", "com.sosandar.sosandar://lookbook?", ""));

        System.out.printf(encodedURL);
    }

    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
