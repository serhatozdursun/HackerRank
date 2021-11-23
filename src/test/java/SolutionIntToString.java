import java.util.Scanner;

public class SolutionIntToString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        try {
            var s = String.valueOf(n);
            System.out.println("Good job");
        }catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
