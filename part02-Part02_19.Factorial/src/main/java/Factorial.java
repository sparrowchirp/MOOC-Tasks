
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number? ");
        int number = scanner.nextInt();
        int result = 1;

        if (number < 0) {
            System.out.println("wrong input");
        } else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
                System.out.println("Factorial: " + result);
            }
        }
        

    }
}
