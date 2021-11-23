import java.util.Scanner;

public class SwapTwoNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a first number to be swap");
        int x = scanner.nextInt();
        System.out.println("Please type a second number to be swap");
        int y = scanner.nextInt();
        var result = swapNumbers(x, y);
        System.out.printf("Given numbers x:%d y:%d, result of swap x:%d and y:%d%n",
                x, y, result[0], result[1]);
    }

    public static int[] swapNumbers(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        return new int[]{x, y};
    }
}
