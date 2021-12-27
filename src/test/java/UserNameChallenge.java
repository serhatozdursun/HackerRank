import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserNameChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        var pattern = "^[aA-zZ]\\w{7,29}$";
        var patternFirstChar = "^(?!_.*$).*";
        for (int i = 1; i <= testCases; i++) {
            var text = scan.nextLine();
            if (text.matches(pattern) && text.substring(0,1).matches(patternFirstChar)) {
                System.out.println("Valid");
            } else
                System.out.println("Invalid");
        }
    }
}
