package day55.Polymorphism4;

import java.util.List;

public class CourseForStudents {

    String topic;
    List<Student> studentList;


    public CourseForStudents(String topic, List<Student> studentList){
        this.topic = topic;
        this.studentList = studentList;
    }

    public void addStudent(String name, int studentID){
        Student s1 =  new Student(name, studentID);
        studentList.add(s1);
    }

    public void addStudent(Student s){
        studentList.add(s);
    }


    @Override
    public String toString() {
        return "CourseForStudents= " +
                "topic:'" + topic + '\'' +
                ", studentList: " + studentList +
                '}';
    }
}
