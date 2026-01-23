import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList () {
        ArrayList<String> listOfStrings = new ArrayList<>();
        for (Exercise temp : exercises) {
            listOfStrings.add(temp.getName());
        }
        return listOfStrings;
    }

    public void add(String string) {
        Exercise exercise = new Exercise(string);
        this.exercises.add(exercise);
    }

    public void markAsCompleted(String string) {
        for (Exercise temp : exercises) {
            if (temp.getName().equals(string)) {
                temp.setCompleted();
            }
        }
    }

    public boolean isCompleted(String string) {
        for (Exercise temp : exercises) {
            if (temp.getName().equals(string)) {
                return temp.isCompleted();
            }
        }
        return false;
    }

    

}
