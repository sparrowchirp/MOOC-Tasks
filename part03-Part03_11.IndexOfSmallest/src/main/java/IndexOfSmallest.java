
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int number = scanner.nextInt();
            list.add(number);

            if (number == 9999) {
                break;
            }
        } 
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        for (Integer temp : list) {
            if (smallest > temp){
                smallest = temp;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Smallest number: " + list.get(i));
                System.out.println("Found at index: " + i);
            }
        }
    }
}
