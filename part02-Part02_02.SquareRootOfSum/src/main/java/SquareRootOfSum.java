
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first = scanner.nextInt();
        System.out.print("Second number: ");
        int second = scanner.nextInt();
        double squareRoot = Math.sqrt(first+second);
        System.out.println("Square root of the sum is" + squareRoot);     

    }
}
