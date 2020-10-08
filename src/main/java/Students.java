public class Students extends People<Student>{
    final static Students INSTANCE = new Students();
    private Students(){

        this.add(new Student(342L, "Dean",5.0));
        this.add(new Student(743L,"Corey",5.0));
        this.add(new Student(671L,"Darren",3.5));


    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] toArray(){
        Student[] studentArray = new Student[getPersonList().size()];
        for (int index = 0; index < getPersonList().size(); index++){
            studentArray[index] = getPersonList().get(index);
        }

        return studentArray;
    }

    @Override
    public String toString() {
        return "Students{" +
                "personList=" + personList +
                "} " + super.toString();
    }
}
