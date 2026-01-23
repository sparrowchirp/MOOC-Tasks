import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> items;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase temp : items) {
            weight += temp.totalWeight();
        }
        return weight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }
        this.items.add(suitcase);
    }
    
    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).totalWeight()+ " kg)";
        } 
        return items.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contains the following items:\n");
        for(Suitcase temp : items) {
            temp.printItems();
        }
    }
}
