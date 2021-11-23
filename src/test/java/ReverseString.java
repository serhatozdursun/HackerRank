import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseString {


    public String reversString(String reversableString) {
        if (reversableString == null || reversableString.isBlank()) {
            return reversableString;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = reversableString.toCharArray();
        for (Character _char : chars) {
            stack.push(_char);
        }

        int j = 0;
        while (!stack.empty()){
            chars[j++] = stack.pop();
        }

        return String.valueOf(chars);
    }


    @Test
    public void emptStringRevers(){
        assertEquals("",reversString(""));
    }

    @Test
    public void nullStringRevers(){
        assertEquals(null,reversString(null));
    }

    @Test
    public void reversString(){
        String string = "srever";
        assertEquals("revers",reversString(string));
    }

}
