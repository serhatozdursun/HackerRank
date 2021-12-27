import java.util.Arrays;
import java.util.Scanner;

public class SplitProblemSolution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        var chars = str.strip().split("[ !,?._'@]+");
        if (chars.length == 1 && chars[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.printf("%d%n", chars.length);
            Arrays.stream(chars).forEach(System.out::println);
        }
    }
}
