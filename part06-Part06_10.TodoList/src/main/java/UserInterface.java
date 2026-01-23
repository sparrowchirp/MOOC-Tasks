import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else {
                processCommand(command);
            }
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            todoList.print();
        } else if (command.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.todoList.add(task);
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int index = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(index);
    }
    
}
