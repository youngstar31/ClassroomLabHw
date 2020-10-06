public class Student extends Person implements ILearner {

    double totalStudyTime;



    public Student(long id, String name,double totalStudyTime ) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }


    public double learn(double numberOfHours) {
        return totalStudyTime = totalStudyTime + numberOfHours;


    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
