import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);

        if (n > 1) {
            fib.add(1);
        }

        for (int i = 2; i < n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));  // Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }
}
