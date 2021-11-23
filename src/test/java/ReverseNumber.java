import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumber {


    public int reverseNumber(int number) {
        String stringValueOfNumber = String.valueOf(number);
        StringBuilder builder = new StringBuilder(stringValueOfNumber);
        builder.reverse();
        stringValueOfNumber = new String(builder);
        return Integer.parseInt(stringValueOfNumber);
    }

    public int reverseNumberBuffer(int number) {
        String stringValueOfNumber = String.valueOf(number);
        StringBuffer builder = new StringBuffer(stringValueOfNumber);
        builder.reverse();
        stringValueOfNumber = new String(builder);
        return Integer.parseInt(stringValueOfNumber);
    }

    public static int reverseNo(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    @Test
    public void testReversNumberWithSuccessfulCase() {
        int number = 12345681;
        assertEquals(18654321, reverseNumber(number));
        assertEquals(18654321, reverseNo(number));
        assertEquals(18654321, reverseNumberBuffer(number));

    }


}
