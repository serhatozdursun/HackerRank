import java.util.HashMap;
import java.util.Map;

public class NoneRepeatChar {

    public static void main(String[] args) {
        System.out.println(noneRepeatChar("swiss"));
    }

    public static String noneRepeatChar(String charSet) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : charSet.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c: charSet.toCharArray()) {
            if ( counts.get(c) == 1) {
                return String.valueOf(c);
            }
        }

        return "None";
    }
}
