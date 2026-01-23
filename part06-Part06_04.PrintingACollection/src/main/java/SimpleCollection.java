
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String output = "The collection " + this.name;
        if (this.elements.size() == 0) {
            output += " is empty.";
        } else if (this.elements.size() == 1) {
            output += " has 1 element:\n" + this.elements.get(0);
        } else {
            output += " has " + this.elements.size() + " elements:\n";
            for (String temp : this.elements) {
            output = output + temp + "\n";
            }
        } 
        return output;
    }
}
