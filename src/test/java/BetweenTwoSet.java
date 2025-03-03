import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class BetweenTwoSet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

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

