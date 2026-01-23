import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items = new ArrayList<>();

    public boolean isEmpty(){
        if (this.items.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.items.add(value);
    }

    public ArrayList<String> values() {
        return this.items;
    }

    public String take(){
        int index = this.items.size() - 1;
        return this.items.remove(index);
    }
}
