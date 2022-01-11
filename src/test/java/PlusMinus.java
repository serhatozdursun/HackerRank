import org.junit.jupiter.api.Test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        var countOfPositive = (int) arr.stream().filter(i -> i > 0).count();
        var countOfNegative = (int) arr.stream().filter(i -> i < 0).count();
        var countOfZero = (int) arr.stream().filter(i -> i == 0).count();
        var n = arr.size();
        System.out.printf("%6f%n", (double) countOfPositive / (double) n);
        System.out.printf("%6f%n", (double) countOfNegative / (double) n);
        System.out.printf("%6f%n", (double) countOfZero / (double) n);
    }

    @Test
    public void test() {
        var arr = new Integer[]{-4, 3, -9, 0, 4, 1};
        plusMinus(List.of(arr));

    }

}


