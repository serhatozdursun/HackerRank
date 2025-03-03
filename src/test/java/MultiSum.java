import java.io.*;
import java.util.*;
import java.util.stream.*;

public class MultiSum {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();


        boolean isNumeric = input.replaceAll(" ", "").matches("\\d+");

        if (isNumeric) {
            // Parse the input line into an Integer array
            Integer[] intArray = Arrays.stream(input.split("\\s+"))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);

            // Process the Integer array and print the sum
            Arithmetic arithmetic = new Arithmetic();
            System.out.println(arithmetic.sum(intArray));
        } else if(!isNumeric){
            // Parse the input line into a String array
            String[] strArray = input.split("\\s+");

            // Process the String array and print the concatenated result
            Arithmetic arithmetic = new Arithmetic();
            System.out.println(arithmetic.sum(strArray));
        } else {
            System.out.println("Invalid array type");
        }

        scanner.close();
    }
}

class Arithmetic {
    // Method to sum an array of Integers using Streams
    public Integer sum(Integer[] ints) {
        return Arrays.stream(ints).reduce(0, Integer::sum);
    }

    // Overloaded method to concatenate an array of Strings using Streams
    public String sum(String[] strings) {
        return Arrays.stream(strings).collect(Collectors.joining());
    }
}
