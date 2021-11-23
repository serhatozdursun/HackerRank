import java.util.Scanner;

public class SolutionEOF {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int i=0;
        while (scanner.hasNext()){
            i++;
            System.out.printf("%d %s",i,scanner.nextLine());
        }
    }
}
