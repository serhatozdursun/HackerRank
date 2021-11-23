import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedParentheses {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type text to check is balanced parentheses");
        var text = scan.nextLine();
        var isBalanced = isBalancedParentheses(text);

        if (isBalanced)
            System.out.printf("Given text is balanced, text: %s%n", text);
        else
            System.out.printf("Given text is not balanced, text: %s%n", text);

    }

    public static boolean isBalancedParentheses(String input_string) {
        Stack<Character> stack = new Stack<>();

        for (Character c : input_string.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty() || !stack.pop().equals('(')) {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || !stack.pop().equals('{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || !stack.pop().equals('[')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.empty();
    }

    @Test
    public void balancedCase() {
        assertTrue(isBalancedParentheses("[()]{}{[()()]()}"));
    }

    @Test
    public void notBalancedCase() {
        assertFalse(isBalancedParentheses("{()}{[]"));
    }
}
