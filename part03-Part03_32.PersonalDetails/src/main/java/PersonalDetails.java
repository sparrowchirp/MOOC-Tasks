
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumAge = 0;
        int count = 0;
        double averageAge;
        while (true) {
            String line = scanner.nextLine();
            if (line.length() == 0) {
                break;
            }

            String[] parts = line.split(",");
            if (longestName.length() < parts[0].length()) {
                longestName = parts[0];
            }
            sumAge += Integer.valueOf(parts[1]);
            count++;

            
        }
        System.out.println("Longest name: " + longestName);

        averageAge = (double) sumAge / count;
        System.out.println("Average of the birth years: " + averageAge);




    }
}
