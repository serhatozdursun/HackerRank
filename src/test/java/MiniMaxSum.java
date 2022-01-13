import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        var sortedList = arr.stream().sorted().collect(Collectors.toList());
        var maxValueList = sortedList.subList(1,sortedList.size())
                .stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger::add);
        var minValueList = sortedList.subList(0, sortedList.size()-1)
                .stream()
                .map(BigInteger::valueOf)
                .reduce( BigInteger::add);
        System.out.printf("%d %d%n", minValueList.get(), maxValueList.get());
    }

    @Test
    public void test() {
        var arr = new Integer[]{256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(List.of(arr));
    }
}
