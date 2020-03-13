package day47;
public class Student {

    int StudentID;

    //***public static final together creates a CONSTANT field****
    //public-> access modifier, since it is public you can reach anywhere
    //static->it is a specifier. No need an object to call it. You can use class name to directly access it
    //final-> its value cannot be changed, String->data type, school->variable name
    public static final String school = "Cybertek";

    public Student(int studentID){
        this.StudentID = studentID;
    }

    /**
     * INTERVIEW: HOW TO CREATE CONSTANT?
     * I WILL CREATE PUBLIC STATIC FINAL FIELD
     * PUBLIC STATIC FINAL -> WHEN YOU SEE THESE TREE AMIGO TOGETHER IT IS CONSTANT
     */
}
