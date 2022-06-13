public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(123123));
        System.out.println(isPalindrome2(123123));
    }


    public static boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        String reversString = String.valueOf(new StringBuilder(string).reverse());
        return string.equals(reversString);
    }

    public static boolean isPalindrome2(int x) {
        int reversed = 0;
        int beforeRevers = x;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return beforeRevers == reversed && !(beforeRevers < 0);

    }
}
