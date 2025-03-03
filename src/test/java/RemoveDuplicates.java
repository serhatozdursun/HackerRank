import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println(removeDuplicates(arr));  // Output: [1, 2, 3, 4, 5]
    }

    public static List<Integer>  removeDuplicates(List<Integer> arr) {
        return  new ArrayList<>(new HashSet<>(arr));
    }
}
