public class Instructors extends People<Instructor> {

    //1. Static instance
    final static Instructors INSTANCE = new Instructors();


    private Instructors(){
        this.add(Educator.ALYSSA.getInstructor());
        this.add(Educator.LISA.getInstructor());

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


}
