import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ulukbek","Teacher");
        Student student = new Student("Emilbek","student");

        System.out.println(teacher);
        System.out.println(student);
        System.out.println(student.Do());
        System.out.println(teacher.Do());

    }
}