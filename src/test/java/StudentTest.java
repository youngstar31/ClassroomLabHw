import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        Student student = new Student(1879, "Nate",0.0);
        Assert.assertTrue(student instanceof ILearner);
    }


    @Test
    public void testInheritance(){

        Student student = new Student(1879, "Nate",0.0);
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn(){
        Student student = new Student(1879, "Nate",0.0);
        student.learn(7.0);

         double expected = student.getTotalStudyTime();
         double actual = 7.0;
         double delta = 0.0;

         Assert.assertEquals(expected, actual, delta);

    }
}
