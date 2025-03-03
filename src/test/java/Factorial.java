import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Factorial {

    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException(STR."Negative numbers couldn't have factorial, given number; \{n}");
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public long factorial2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(STR."Negative numbers couldn't have factorial, given number is \{n}");
        } else if (n < 2) {
            return n;
        } else {
            return n * factorial2(n - 1);
        }
    }

    public long factorialLoop(int n) {
        if (n < 0)
            throw new IllegalArgumentException(STR."Negative numbers couldn't have factorial, given number; \{n}");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    @Test
    public void factorialWithSuccessfulResultTest() {
        int n = 5;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        assertEquals(fact, factorial(n));
        assertEquals(fact, factorialLoop(n));
        assertEquals(fact, factorial2(n));
    }

    @Test
    public void factorialWithNegativeCAse() {
        assertThrows(IllegalArgumentException.class, () -> factorial(-4));
    }
}
