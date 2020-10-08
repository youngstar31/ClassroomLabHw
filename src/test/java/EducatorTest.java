import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation(){

    }

   /// @Test
   // public void testInheritance(){
     //   //Given
     //   Educator educator = Educator.ALYSSA;


       // Assert.assertTrue(educator instanceof ITeacher);


    //}

    @Test
    public void testTeach(){

        Student student = new Student(345L, "Justin",5.0);

        Educator.ALYSSA.teach(student,5.0);

        Assert.assertTrue(student.getTotalStudyTime() == 10.0);
    }

    @Test
    public void testLecture(){

        Student student1 = new Student(8321, "Cody",5.0);
        Student student2 = new Student(8581, "Joe",5.0);
        Student[] students = {student1,student2};
        Educator.ALYSSA.lecture(students, 10.0);


        double expected = 10.0;
        double actual = (student1.getTotalStudyTime() + student2.getTotalStudyTime()) / students.length;
        double delta = 0.0;

        Assert.assertEquals(expected,actual,delta);
    }
}
