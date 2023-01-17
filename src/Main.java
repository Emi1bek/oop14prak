import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ulukbek","Teacher");
        Student student = new Student("Emilbek","student");


        student.Do();
        teacher.Do();

    }
}