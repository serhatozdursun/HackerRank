import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int[] myIntArray = IntStream.range(1, 11).toArray();
        Arrays.stream(myIntArray)
                .forEach(i -> System.out.printf("%d x %d = %d\n", N, i, N * i));
        bufferedReader.close();
    }
}
