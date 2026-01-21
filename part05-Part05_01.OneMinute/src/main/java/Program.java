
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();
        while(!timer.toString().equals("03 : 00")) {
            System.out.println(timer);
            timer.advance();
        }
    }

}

