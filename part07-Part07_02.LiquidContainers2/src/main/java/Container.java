public class Container {

    private int liquidInContainer;
    private final int CAPACITY = 100;

    public Container() {
        this.liquidInContainer = 0;
    }

    public int contains() {
        return this.liquidInContainer;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.liquidInContainer += amount;
        }
        if (this.liquidInContainer > CAPACITY) {
            this.liquidInContainer = CAPACITY;
        }
    }

    public void remove (int amount) {
        if (amount > 0) {
            this.liquidInContainer -= amount;
        }
        if (this.liquidInContainer < 0) {
            this.liquidInContainer = 0;
        }
    }

    public String toString() {
        return this.liquidInContainer + "/100";
    }
    
}
