import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BreakingRecords {

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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
