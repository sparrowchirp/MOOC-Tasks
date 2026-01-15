
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }

        System.out.println("Where to? ");
        int upperLimit = scanner.nextInt();
        System.out.println("Where from? ");
        int lowerLimit = scanner.nextInt();
        
        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }
}
