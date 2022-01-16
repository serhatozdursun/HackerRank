import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(g -> {
            var multipleFive = ((g + 4) / 5) * 5;
            var differance = multipleFive - g;
            return differance < 3 && g >= 38 ? multipleFive : g;
        }).collect(Collectors.toList());
    }

    @Test
    public void test() {
        Integer[] grades = {73, 67, 38, 33};
        gradingStudents(List.of(grades)).forEach(System.out::println);
    }
}
