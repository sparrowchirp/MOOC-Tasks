import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task) {
        this.tasks.add(task);
    }
   
    public void print() {
        if (this.tasks.isEmpty()) {
            return;
        }

        for (String temp : tasks) {
            int index = this.tasks.indexOf(temp) + 1;
            System.out.println(index + ": " + temp);
        }
    }
    
    public void remove(int number) {
         if (this.tasks.isEmpty() || number > this.tasks.size()) {
            return;
        }
        int index = number - 1;
        this.tasks.remove(index);
    }
}
