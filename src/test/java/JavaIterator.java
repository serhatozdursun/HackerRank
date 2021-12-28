import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIterator {


    public static void main(String[] args) {
        var mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }
        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }
        function(mylist);
    }

    public static void function(ArrayList<Object> list) {
        var index = list.indexOf("###")+1;
        var newList = list.subList(index,list.size());
        newList.forEach(System.out::println);
    }
}
