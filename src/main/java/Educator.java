public enum Educator implements ITeacher{

    ALYSSA(new Instructor(83L,"Alyssa")),
    LISA(new Instructor(33L,"Lisa"));

    private final Instructor instructor;
    private double timesWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timesWorked += numberOfHours;


    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timesWorked = timesWorked + numberOfHours;

    }
}
