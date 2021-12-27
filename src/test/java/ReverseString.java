import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseString {


    public String reversString(String reversableString) {
        if (reversableString == null || reversableString.equals("")) {
            return reversableString;
        }

        Stack<Character> stack = new Stack<>();

        char[] charOfString = reversableString.toCharArray();
        for (Character c : charOfString) {
            stack.push(c);
        }
        int j = 0;
        while (!stack.empty()) {
            charOfString[j++] = stack.pop();
        }
        return String.valueOf(charOfString);
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
