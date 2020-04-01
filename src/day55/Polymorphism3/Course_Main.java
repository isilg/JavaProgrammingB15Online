package day55.Polymorphism3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course_Main {

    public static void main(String[] args) {

        //We can add or remove item by creating like that. If we just type  Arrays.asList() we cannot do any change
        List<String> list = new ArrayList<>(Arrays.asList("Kate","Katie","Max","Felishia","Francesca","Patricia") );

        //Creating Course object
        Course java =  new Course("Java", list);
        System.out.println("java= "+java);


        //add 2 new students to java class
        java.studentNames.add("John");
        java.studentNames.add("Jonathan");

        //add 2 new students to java class at the same time(in the same line)
        java.studentNames.addAll(Arrays.asList("Robert","Richard","William"));


        //There are 2 references ->list and java, there is 1 Arraylist object->list


        //Print student names who takes java
        System.out.println("java course = \n" + java.studentNames);

    }


}
