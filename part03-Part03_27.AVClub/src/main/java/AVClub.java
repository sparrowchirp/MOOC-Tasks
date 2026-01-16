
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            String line = scanner.nextLine();

            if (line.length() == 0) {
                return;
            }

            String[] parts = line.split(" ");
            for (String temp : parts) {
                if (temp.contains("av")) {
                    System.out.println(temp);
                }
            }
        }
    }
}
