
import java.util.Scanner;

public class TryCatch2 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int p = in.nextInt();
            System.out.println(MyCalculator.power(n, p));
        }
    }
}

class MyCalculator {

    public static long power(int n, int p) {
        if ((n < -10 && n > 10) && (p < -10 && p > 10)) {
            System.out.println("n or p should not be lever then -10 or bigger then 10");
            return -999999;
        }
        if (n == 0 && p == 0)
           System.out.println("n and p should not be zero");
        if (n < 0 && p < 0)
            System.out.println("n or p should not be negative");
        if (p == 0) {
            return 0;
        }
        if (p == 1) {
            return n;
        }

        return n * power(n, p - 1);
    }
}
