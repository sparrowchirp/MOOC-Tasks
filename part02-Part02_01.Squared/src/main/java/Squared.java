
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = scanner.nextInt();
        System.out.println("Square of " + number + " is " + number * number);

    }
}
