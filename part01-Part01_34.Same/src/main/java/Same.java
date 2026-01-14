
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string:");
        String first;
        first = scan.nextLine();
        
        System.out.print("Enter the second string:");
        String second;
        second = scan.nextLine();
        
        if (second.equals(first)) {
            System.out.print("Same");
        } else {
            System.out.print("Different");
        }
    }
}
