package day56;
/**
 * Singleton: class that only generates single object throughout the entire application.
 * We can use Singleton as making field data type and return type for our method.
 * Singleton restrict the class to only have one object
 * How do you create it, what is the pattern:
 *    -add private static field with same type same as class name
 *    -add private constructor
 *    -add public method with return type same as class name
 */

public class Singleton {
    //I don't want anyone reach it other than getInstance to get the object
    private static Singleton instance; // it stores the object.



    //Private Constructor. Private because we don't want anyone call new kywrd
    private Singleton(){
        System.out.println("NO ARG CONSTRUCTOR BEING CALLED!!");
    }



    //static method returns Singleton(same type with the class).
    //Every time we call it gives new object
    public static Singleton getInstance(){
      //What is the default value for instance? --> Null
      //If it is null create an object obj, if not null return the object
        if (instance==null) {
            instance = new Singleton(); //creating an object
        }else {
            System.out.println("We already have this object");
        }
        return instance;
    }
}
