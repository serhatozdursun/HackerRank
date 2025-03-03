import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SolutionAnagramCase {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type text a:");
        String a = scanner.nextLine();
        System.out.println("Please type text ab:");
        String b = scanner.nextLine();

        if (1 > a.length()
                || 50 < a.length()
                || 1 > b.length()
                || 50 < b.length())
            throw new IllegalArgumentException("Its out of bound");

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        var listOfA = a.toLowerCase(Locale.ENGLISH).toCharArray();
        var listOfB = b.toLowerCase(Locale.ENGLISH).toCharArray();

        Arrays.sort(listOfA);
        Arrays.sort(listOfB);

        var status = Arrays.equals(listOfA, listOfB);

        if (status)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

}
