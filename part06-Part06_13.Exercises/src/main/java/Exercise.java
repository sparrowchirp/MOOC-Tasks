public class Exercise {
    private String name;
    private boolean isCompleted;
    
    public Exercise(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted() {
        this.isCompleted = true;
    }

}
