
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        
        System.out.println("What a joke!");
        UserInterface userInterface = new UserInterface(jokeManager, scanner);
        userInterface.start();
    }
}
