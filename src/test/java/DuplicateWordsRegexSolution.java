import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRegexSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        List<String> result_list = new ArrayList<>();
        for (int i = 1; i <= testCases; i++) {
            var text = scan.nextLine();
            String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
            Pattern p
                    = Pattern.compile(
                    regex,
                    Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(text);
            while (m.find()) {
                text
                        = text.replaceAll(
                        m.group(),
                        m.group(1));
            }

            result_list.add(text);
        }
        result_list.forEach(System.out::println);
    }

}
