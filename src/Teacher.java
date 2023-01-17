public class Teacher extends Person{

    public Teacher(String name, String job) {
        super(name, job);
    }

    public Teacher() {
    }

    public String Do (){
        return "teacher";
    }


    @Override
    public String toString() {
        return "Teacher name's " + getName()+" job "+ getJob();
    }
}
