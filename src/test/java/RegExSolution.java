import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegExSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        List<String> result_list = new ArrayList<>();
        for (int i = 1; i <= testCases; i++) {
            String pattern = scan.nextLine();
            try {
                Pattern.compile(pattern);
                result_list.add("Valid");
            } catch (PatternSyntaxException exception) {
                result_list.add("Invalid");
            }
        }
        result_list.forEach(System.out::println);
    }
}
