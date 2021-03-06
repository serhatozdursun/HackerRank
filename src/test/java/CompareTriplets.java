import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        var result = new ArrayList<Integer>();
        if (a.size() == b.size()) {
            var pointsAlice = IntStream.range(0, a.size())
                    .map(i -> a.get(i) > b.get(i) ? 1 : 0)
                    .reduce(0, Integer::sum);
            var pointsBob = IntStream.range(0, a.size())
                    .map(i -> b.get(i) > a.get(i) ? 1 : 0)
                    .reduce(0, Integer::sum);
            result.add(pointsAlice);
            result.add(pointsBob);
        }
        return result;
    }
}

class CompareTripletsSolutions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = CompareTriplets.compareTriplets(a, b);

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
