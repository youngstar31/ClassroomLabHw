import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {


        @Test
        public void hostLectureTest() {
            //ZipCodeObject
            ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

            //Student object
            Student student = Students.getInstance().findById(671L);

           // System.out.println(Students.getInstance().toArray());

            zipCodeWilmington.hostLecture(Educator.ALYSSA.getInstructor(), 15.0);

            double actual = student.getTotalStudyTime();
            Assert.assertEquals(actual, 8.5, 0.0);



        }
}
