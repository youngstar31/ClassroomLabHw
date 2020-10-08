import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void testStudents(){
    Students students = Students.getInstance();

    String actual = Students.getInstance().findById(342L).getName();
    String expected = "Dean";

    Assert.assertEquals(expected,actual);


    }
}
