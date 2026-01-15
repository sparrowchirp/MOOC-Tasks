
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int firstNumber = scanner.nextInt();
        System.out.println("Last number? ");
        int lastNumber = scanner.nextInt();

        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum = sum + i;
        }
        System.out.println("the sum is: " + sum);

    }
}
