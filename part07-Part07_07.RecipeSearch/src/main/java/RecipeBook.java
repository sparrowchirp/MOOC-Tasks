import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void list() {
        System.out.println("\nRecipes: ");

        for(Recipe temp : recipes) {
            System.out.println(temp.toString());
        }
    }

    public void findByName(String searchrequest) {
        for( Recipe temp : recipes) {
            if (temp.getName().contains(searchrequest)) {
                System.out.println(temp.toString());
            }
        }
    }

    public void findByTime(int maxTime) {
        for (Recipe temp : recipes) {
            if (temp.getCookingTime() <= maxTime) {
                System.out.println(temp.toString());
            }
        }
    }

    public void findByIngredient(String ingredient) {
        for (Recipe temp : recipes) {
            if (temp.getIngredients().contains(ingredient)) {
                System.out.println(temp.toString());
            }
        }
    }

}
