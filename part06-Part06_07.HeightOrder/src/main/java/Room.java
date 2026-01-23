import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortest = this.persons.get(0);
        for (Person temp : this.persons) {
            if (temp.getHeight() < shortest.getHeight()) {
                shortest = temp;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        int index = this.persons.indexOf(shortest());
        return this.persons.remove(index);
    }
}
