import java.util.List;

public class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        var sum = ar.stream()
                .reduce(Long::sum)
                .get();
        System.out.println(sum);
        return sum;
    }
}
