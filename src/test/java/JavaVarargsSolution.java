import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaVarargsSolution {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int i = 0;
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
            i++;
            if (i == 6)
                break;
        }
        List<List<Integer>> totalList = new ArrayList<>() {{
            add(List.copyOf(numbers.subList(0, 2)));
            add(List.copyOf(numbers.subList(0, 3)));
            add(List.copyOf(numbers.subList(0, 5)));
            add(List.copyOf(numbers.subList(0, 6)));
        }};
        var calculate = new Calculate();
        totalList.forEach(calculate::add);
    }
}

class Calculate {
    void add(List<Integer> number) {
        int sum = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
            if (i != number.size() - 1)
                result.append(number.get(i)).append("+");
            else
                result.append(number.get(i));
        }
        result.append("=").append(sum);
        System.out.println(result);
    }
}
