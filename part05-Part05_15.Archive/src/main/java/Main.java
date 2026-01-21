
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        while (true) {
            System.out.print("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.print("Name? (empty will stop) ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(name, identifier);
            if(archive.contains(item)) {
                break;
            } else {
                archive.add(item);
            }
        }
        
        for (Item temp : archive) {
            System.out.println(temp);
        }

    }
}
