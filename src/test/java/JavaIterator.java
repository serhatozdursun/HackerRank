import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIterator {
    private static final String LIST_SEPARATOR = "###";

    public static void main(String[] args) {
        var myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }
        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }
        sc.close();
        printListAfterSeparator(myList);
    }

    public static void printListAfterSeparator(List<Object> list) {
        int separatorIndex = list.indexOf(LIST_SEPARATOR) + 1;
        List<Object> subList = list.subList(separatorIndex, list.size());
        subList.forEach(System.out::println);
    }
}
