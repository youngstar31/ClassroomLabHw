import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(4867, "Miles");
        Assert.assertTrue(instructor instanceof ITeacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(4867, "Miles");
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(4867, "Miles");
        Student student = new Student(8321, "Cody",8.0);
        instructor.teach(student,4.0);

        double expected = student.getTotalStudyTime();
        double actual = 12.0;
        double delta = 8.0;

        Assert.assertEquals(expected,actual,delta);

    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(4867, "Miles");
        Student student1 = new Student(8321, "Cody",5.0);
        Student student2 = new Student(8581, "Joe",5.0);
        Student[] students = {student1,student2};

        instructor.lecture(students,5.0);

        double expected = 7.5;
        double actual = (student1.getTotalStudyTime() + student2.getTotalStudyTime()) / students.length;
        double delta = 0.0;

        Assert.assertEquals(expected,actual,delta);

    }
}
