
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            sum++; 
        } while (number != 0);

        sum--;
        System.out.println("Number of numbers: " + sum);

    }
}
