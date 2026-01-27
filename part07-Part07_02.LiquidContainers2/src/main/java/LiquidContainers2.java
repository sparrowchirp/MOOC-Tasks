
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("\nFirst: " + first.toString());
            System.out.println("Second: " + second.toString());
        
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;

            } 
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(liquid);
            } else if (command.equals("move")) {
                if (liquid > first.contains()) {
                    liquid = first.contains();
                }
                first.remove(liquid);
                second.add(liquid);
            } else if (command.equals("remove")) {
                second.remove(liquid);
            }
        
        }
    }

}
