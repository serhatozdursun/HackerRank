import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreakingBestAndWorstRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Initialize counters and records
        int maxRecord = scores.get(0);
        int minRecord = scores.get(0);
        int maxCount = 0;
        int minCount = 0;

        // Iterate through the scores starting from the second game
        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            // Check if current score breaks the maximum record
            if (score > maxRecord) {
                maxRecord = score;
                maxCount++;
            }

            // Check if current score breaks the minimum record
            if (score < minRecord) {
                minRecord = score;
                minCount++;
            }
        }

        // Return the result as a list of integers
        return Arrays.asList(maxCount, minCount);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            throw new NullPointerException("The environment variable OUTPUT_PATH is not set.");
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
