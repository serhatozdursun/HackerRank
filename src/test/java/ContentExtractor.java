import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentExtractor {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many test case will run");
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            System.out.println("pleas type the text to check");
            String line = scan.nextLine();

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }
}
