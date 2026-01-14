
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Password:");
        String first;
        first = scan.nextLine();
        
        
        
        if (first.equals("Caput Draconis")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("Off with you!");
        }
    }
}
