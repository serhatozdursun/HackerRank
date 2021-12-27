import java.util.Scanner;

public class MyRegexSoultion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String ip0to255 = "([0-9]|[0-9][0-9]|([01])[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = ip0to255 + "." + ip0to255 + "." + ip0to255 + "." + ip0to255;
}
