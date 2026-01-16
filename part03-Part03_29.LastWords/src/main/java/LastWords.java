
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.length() == 0) {
                return;
            }

            String[] parts = line.split(" ");
            int last = parts.length - 1;
            System.out.println(parts[last]);


    }
}
}
