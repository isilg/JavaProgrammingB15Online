package day44;

// FIELDS ARE ALWAYS WRITTEN UNDER THE CLASS EITHER STATIC OR INSTANCE
// NAME, TYPE, COUNTER ARE OUR FIELDS
public class Course {

    // I wanna see as new courses created

    String name;
    String type;

    //static field
    static int counter;

    //Create constructor
    public Course(String name, String type){
        this.name = name;
        this.type = type;
        ++counter;   // I wanna see as new courses created by using counter
    }


}
