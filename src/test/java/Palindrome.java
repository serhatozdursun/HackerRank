import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }


    static boolean isPalindrome(String str)
    {
        int i=0, j = str.length()-1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static boolean isPalindrome2(String str)
    {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}