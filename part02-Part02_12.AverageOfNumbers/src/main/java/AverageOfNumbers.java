
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        double average;
        while (true) {
            System.out.println("Give a number: ");
            number = scanner.nextInt();

            if (number == 0){
                
                break;
            } else {
                sum = sum + number;
                count++;
            }
        }
        average = (double)sum / count;
        System.out.println("Average of the numbers: " + average);

    }
}
