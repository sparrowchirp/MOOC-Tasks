import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() > this.maximumWeight) {
            return;
        }
        this.items.add(item);
    }

    public int totalWeight() {
        int suitcaseWeight = 0;
        for (Item temp : items) {
            suitcaseWeight +=temp.getWeight();
        }
        return suitcaseWeight;
    }

    public void printItems() {
        String output = "The suitcase contains the following items:\n";
        for(Item temp : items) {
            output += temp.getName() + " (" + temp.getWeight() + " kg)\n";
        }
        System.out.println(output);
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(Item temp : items) {
            if (temp.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = temp;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } 
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
