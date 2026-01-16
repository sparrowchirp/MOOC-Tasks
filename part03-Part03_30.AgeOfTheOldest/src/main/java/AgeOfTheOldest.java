
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.length() == 0) {
                break;
            }

            String[] parts = line.split(",");
            if (oldestAge < Integer.valueOf(parts[1])) {
                oldestAge = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);

    }
}
