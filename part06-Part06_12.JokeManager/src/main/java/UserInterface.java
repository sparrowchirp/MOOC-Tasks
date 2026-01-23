import java.util.Scanner;

public class UserInterface {

    private JokeManager jokemanager;
    private Scanner scanner;

    public UserInterface(JokeManager jokemanager, Scanner scanner) {
        this.jokemanager = jokemanager;
        this.scanner = scanner;
    }

    public void start() {
        
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine().trim();

            if (command.equals("X")) {
                break;
            } else {
                processCommand(command);
            }
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            jokemanager.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println("Drawing a joke.");
            System.out.println(jokemanager.drawJoke());
        } else if (command.equals("3")) {
            jokemanager.printJokes();
        } else {
            System.out.println("Unknown command");
        }
    }
    
}
