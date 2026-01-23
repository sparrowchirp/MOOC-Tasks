
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListIsEmptyAtTheBeginning() {
        assertEquals(0, management.exerciseList().size());

    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Test message");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseInList() {
        management.add("Test message");
        assertTrue(management.exerciseList().contains("Test message"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("new line");
        management.markAsCompleted("new line");
        assertTrue(management.isCompleted("new line"));
    }

    @Test
    public void ifNotmarkedAsCompletedIsNotCompleted() {
        management.add("test");
        management.markAsCompleted("test");
        assertFalse(management.isCompleted("new test"));
    }

}
