import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstanceTest(){

        Instructors.getInstance();

        String actual = Instructors.getInstance().findById(83L).getName();
        String expected = "Alyssa";

        Assert.assertEquals(expected, actual);
    }


}
