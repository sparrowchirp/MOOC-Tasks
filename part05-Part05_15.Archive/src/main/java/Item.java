public class Item {
    private String name;
    private String identifier;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }


    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if(!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (this.identifier.equals(comparedItem.identifier)) {
                return true;
        }
        return false;
    }



    
}
