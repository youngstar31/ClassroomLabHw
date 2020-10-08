import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    //1. Static instance
    static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) Instructors.getInstance().findById(id);
        Instructors.getInstance().findById(id).lecture(students.toArray(),numberOfHours);
        instructor.lecture(students.toArray(),numberOfHours);
    }
    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> halfBody = new HashMap<Student, Double>();
        for (Student student : students.toArray()) {
            halfBody.put(student, student.learn(10));
        }
        return halfBody;


    }
}
