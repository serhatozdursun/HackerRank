import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseString {


    public String reversString(String reversableString) {
        if (reversableString == null || reversableString.equals("")) {
            return reversableString;
        }

        Stack<Character> characterStack = new Stack<>();
        char[] chars = reversableString.toCharArray();
        for (char c : chars) {
            characterStack.push(c);
        }
        int j = 0;
        while (!characterStack.isEmpty()) {
            chars[j++] = characterStack.pop();
        }

        return new String(chars);
    }


    @Test
    public void emptStringRevers() {
        assertEquals("", reversString(""));
    }

    @Test
    public void nullStringRevers() {
        Assertions.assertNull(reversString(null));
    }

    @Test
    public void reversString() {
        String string = "srever";
        assertEquals("revers", reversString(string));
    }

}
