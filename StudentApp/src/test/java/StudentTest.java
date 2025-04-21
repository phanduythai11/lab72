import com.mycompany.studentapp.Student;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StudentTest {

    @Test
    public void testGetName() {
        Student s = new Student("S001", "Alice", 20);
        assertEquals(s.getName(), "Alice");
    }

    @Test
    public void testSetAge() {
        Student s = new Student("S002", "Bob", 21);
        s.setAge(25);
        assertEquals(s.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student s = new Student("S003", "Charlie", 23);
        s.updateName("Chuck");
        assertEquals(s.getName(), "Chuck");
    }
}
