import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            var x = scan.nextLine();
            var y = scan.nextLine();

            var number1 = Integer.parseInt(x);
            var number2 = Integer.parseInt(y);

            System.out.println(number1 / number2);
        } catch (NumberFormatException ne) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
