package day47;
public class FinalVariablesPractice {


    public static void main(String[] args) {

        int x = 10;  // declaring and initializing a variable(giving/assigning an initial value)
        x = 100;     //re-assigning new value

        final int a = 20;

        // a = 20;  ERROR. re-assigning new value to the final variable

      //Student s1 not FinalVariablesPractice s1. So I can reach the attributes of Student unless they are static
        final Student s1 = new Student(101);
        System.out.println(s1.StudentID);

        //s1 = new Student(102); ERROR. Cannot assign a value to final variable
        s1.StudentID = 200; //you can still change interval data attached to
                            //the object. As long as it's the same object s1 pointing to.
                            //As long as the address doesn't change.
        //S1 is address and it isn't changing just the object it is pointing changing
        //so it is ok no error. But if it was  final int StudentID then this means
        //don't change the data in the same class in  the subclass, wherever. So
        //it gives error if I try  s1.StudentID = 200;


       // System.out.println(s1);  -> prints hash code(hashcode is address) because s1 is an address!
        System.out.println(s1.StudentID);

        //Print school name - > How to reach a static value ->
        //Not by using object! -> Class_name.variable_name
        System.out.println(Student.school);

        //Student.school = "MIT"; ERROR. YOU CANNOT CHANGE FINAL ATTRIBUTES VALUE

    }
}
