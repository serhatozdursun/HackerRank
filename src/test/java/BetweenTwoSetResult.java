import java.util.List;


class BetweenTwoSetResult {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmValue = lcmOfArray(a);

        // Calculate GCD of array b
        int gcdValue = gcdOfArray(b);

        // Count multiples of lcmValue that are also divisors of gcdValue
        int count = 0;
        for (int i = lcmValue, j = 2; i <= gcdValue; i = lcmValue * j, j++) {
            if (gcdValue % i == 0) {
                count++;
            }
        }

        return count;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Function to calculate LCM of an array of numbers
    private static int lcmOfArray(List<Integer> arr) {
        int lcm = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            lcm = lcm(lcm, arr.get(i));
        }
        return lcm;
    }

    // Function to calculate GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate GCD of an array of numbers
    private static int gcdOfArray(List<Integer> arr) {
        int gcd = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            gcd = gcd(gcd, arr.get(i));
        }
        return gcd;
    }
}



