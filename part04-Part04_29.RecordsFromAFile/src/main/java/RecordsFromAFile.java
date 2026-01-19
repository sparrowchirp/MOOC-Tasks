
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        try{
            Scanner fileReader = new Scanner(Paths.get(file));
            while(fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");
                if (parts[1].equals("1")) {
                    System.out.println(parts[0] + ", age: " + parts[1] + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
