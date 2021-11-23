import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var line1 = br.readLine();
        var line2 = br.readLine();
        var line3 = br.readLine();
        var lineArray = new ArrayList<String>() {{
            add(line1);
            add(line2);
            add(line3);
        }};

        System.out.println("==============================");
        for (String line : lineArray) {
            var textPart = line.split(" ")[0];
            var numberPart = Integer.parseInt(line.split(" ")[1]);
            System.out.printf("%-14s%03d", textPart, numberPart);
            System.out.println();
        }

        System.out.println("==============================");
    }


}
