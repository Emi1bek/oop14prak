public class Student extends Person{
    public Student(String name, String job) {
        super(name, job);
    }

    public Student() {
    }

    public String Do (){
        return "study";
    }

    @Override
    public String toString() {
        return "Student name's " + getName()+" job "+ getJob();
    }
}
