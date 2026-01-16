
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (line.length() != 0) {
            String[] parts = line.split(" ");
            for (String temp : parts) {
                System.out.println(temp);
            }
        }
    }
}
