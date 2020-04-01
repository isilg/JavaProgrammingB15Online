package day55.Polymorphism3;
import java.util.List;
public class Course {

    String subject;
    List<String> studentNames;


    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }


    //Write a method to add a new name -> add, u r adding just 1 name
    public void addName(String name){
        studentNames.add(name);
    }


    //Write a method to add new names ->addAll , you r adding a collection(list ekledigimiz icin addAll kullandik)
    public void addNames(List<String> names){
        studentNames.addAll(names);
    }


    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }


}
