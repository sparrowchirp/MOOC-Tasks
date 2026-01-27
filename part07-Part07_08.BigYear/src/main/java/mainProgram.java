
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin = scanner.nextLine();

                Bird bird = new Bird(name, nameLatin);
                birds.add(bird);
                
            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                addObservation(name, birds );

            } else if (command.equals("All")) {
                list(birds);
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                printOneBird(birds, name);
            } 
        }

    }

    public static void addObservation (String name, ArrayList<Bird> birds) {
        int counter = 0;
        for (Bird temp : birds) {
            if (temp.getName().equals(name)) {
                temp.addObservation(name);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Not a bird!");
        }
    }

    public static void list(ArrayList<Bird> birds) {
        for (Bird temp : birds) {
            System.out.println(temp.toString());
        }
    }

    public static void printOneBird(ArrayList<Bird> birds, String name) {
        for (Bird temp : birds) {
            if (temp.getName().equals(name)) {
                System.out.println(temp.toString());
            }
        }
    }

}
