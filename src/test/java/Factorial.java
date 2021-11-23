import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Factorial {

    public long factorial(int n) {

        if (n < 0)
            throw new IllegalArgumentException("Negative numbers couldn't have factorial, given number; " + n);
        else if (n <= 2)
            return n;
        else
            return n * factorial(n - 1);
    }

    public long factorialLoop(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    @Test
    public void factorialWithSuccessfulResultTest() {
        int n = 21;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        assertEquals(fact, factorial(n));
        assertEquals(fact, factorialLoop(n));
    }

    @Test
    public void factorialWithNegativeCAse() {
        assertThrows(IllegalArgumentException.class, () -> factorial(-4));
    }
}
