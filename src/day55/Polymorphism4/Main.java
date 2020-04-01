package day55.Polymorphism4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        List<Student> myList = new ArrayList<>();
        myList.add(new Student("Katie",101));
        myList.add(new Student("Kate", 102));
        myList.add(new Student("Felicia",103));


        CourseForStudents java = new CourseForStudents("Java", myList );
        java.addStudent("Max", 123);  //First addStudent method expect (String name, int studentID)
        java.addStudent(new Student("William", 888));              //Second addStudent method expect a variable that is Student type (Student s)
        System.out.println(java);



        CourseForStudents Selenium = new CourseForStudents("Selenium", myList);
        System.out.println(Selenium);

    }
}
