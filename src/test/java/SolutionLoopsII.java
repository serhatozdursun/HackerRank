import java.util.ArrayList;
import java.util.Scanner;

public class SolutionLoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        var t = in.nextInt();
        var k = new ArrayList<String>();
        for (int i = 0; i <= t; i++) {
            k.add(in.nextLine());
        }
        k.remove("");
        k.stream().forEach(SolutionLoopsII::print);
    }

    private static void print(String o) {

        boolean isByte = false;
        boolean isShort = false;
        boolean isInt = false;
        boolean isLong = false;
        ArrayList<String> info = new ArrayList<>();
        try {
            Byte.parseByte(o);
            isByte = true;
            info.add("* byte");
        } catch (Exception e) {

        }
        try {
            Short.parseShort(o);
            isShort = true;
            info.add("* short");
        } catch (Exception e) {

        }
        try {
            Integer.parseInt(o);
            isInt = true;
            info.add("* int");
        } catch (Exception e) {

        }
        try {
            Long.parseLong(o);
            isLong = true;
            info.add("* long");
        } catch (Exception e) {

        }
        if (isByte || isShort || isInt || isLong) {
            System.out.printf("%s can be fitted in:%n", o);
            info.stream().map(i -> i.replaceAll("[\\[\\]]|,", ""))
                    .map(i -> i += "%n")
                    .forEach(System.out::printf);
        } else{
            System.out.printf("%s can't be fitted anywhere.%n", o);
        }
    }
}
