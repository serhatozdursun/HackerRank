import org.junit.jupiter.api.Test;



public class Staircase {

    public void staircase(int n) {
        for (int i = n, j = 1; j <= n; i--, j++) {
            var symbol = "#".repeat(j);
            if (i > 0)
                System.out.printf("%" + i++ + "s%n", symbol);
            else
                System.out.printf("%s%n", symbol);
        }
    }

    @Test
    public void test() {
        staircase(6);
    }
}
