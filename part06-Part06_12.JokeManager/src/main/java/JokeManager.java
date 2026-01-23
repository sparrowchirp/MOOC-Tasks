import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random random = new Random();
        int index = random.nextInt(this.jokes.size());
        return this.jokes.get(index);

    }

    public void printJokes() {
        if (this.jokes.isEmpty()) {
            System.out.println("No jokes");
            return;
        }
        for(String temp : this.jokes) {
            System.out.println(temp);
        }
    }

    public int getJokesCount() {
        return this.jokes.size();
    }

}
