import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = scanner.nextInt();

            System.out.print("Publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, pages, year);
            books.add(book);

        }

        System.out.println("What information will be printed? ");
        String printRequest = scanner.nextLine();
        
        if (printRequest.equals("name")) {
            for (Book temp : books) {
                System.out.println(temp.getTitle()); 
            }
        } else if (printRequest.equals("everything")) {
            for (Book temp : books) {
                System.out.println(temp);
            }
        }

    }
}
