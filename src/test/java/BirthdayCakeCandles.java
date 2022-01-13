import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {


    public static int birthdayCakeCandles(List<Integer> candles) {
        var tallestCandle =candles.stream().sorted().collect(Collectors.toList()).get(candles.size()-1);
        var countOfTallest = candles.stream().filter(i-> i.equals(tallestCandle)).count();
        return (int) countOfTallest;
    }

    @Test
    public void test(){
        var candles = new Integer[]{3,2,1,3};
        System.out.println(birthdayCakeCandles(List.of(candles)));
    }
}
