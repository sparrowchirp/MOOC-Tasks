import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
       
        RecipeBook recipebook = readAndMakeRecipeBook(filename);

        System.out.println("\nCommands:\n" + 
                            "list - lists the recipes\n" + 
                            "stop - stops the program\n" +
                            "find name - searches recipes by name\n" +
                            "find cooking time - searches recipes by cooking time\n" +
                            "find ingredient - searches recipes by ingredient");

        while(true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipebook.list();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchrequest = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipebook.findByName(searchrequest);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                recipebook.findByTime(maxTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipebook.findByIngredient(ingredient);
            }
        }
        
    }

    public static RecipeBook readAndMakeRecipeBook(String filename){
        RecipeBook recipeBook = new RecipeBook();

        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {

            String input;
            while ((input = file.readLine()) != null) {

                String name = input;
                String time = file.readLine();
                int cookingTime = Integer.valueOf(time);

                ArrayList<String> ingredients = new ArrayList<>();
                String ingredient;
                
                while (true) {
                    if ((ingredient = file.readLine()) == null || ingredient.isEmpty()) {
                        break; 
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipeBook.add(recipe);
             }

        }
        catch (IOException e){
        System.out.println(e);
        }
        return recipeBook;
    }

    

}
