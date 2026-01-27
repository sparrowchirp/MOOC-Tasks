
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Grades grades = new Grades();
            
            while (true) {
                System.out.println("Enter point totals, -1 stops:");
                String input = scanner.nextLine();

                if (input.equals("-1")) {
                    break;
                } else {
                    grades.add(input);
                }
            }

            System.out.println(grades.toString());
            grades.printGradeDistribution();
        }
        
    }
}
