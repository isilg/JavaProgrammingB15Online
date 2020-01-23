package day34;
import com.sun.jdi.event.StepEvent;
public class MethodOverloadPractice {
    /**
     * METHOD OVERLOAD: METHODS HAVE SAME NAME
     * BUT HAVE DIFFERENT PARAMETERS.
     * METHOD SIGNATURE: METHOD NAME + PARAMETER LIST
     * PARAMETER: VALUES METHODS EXCEPT
     * FOR EXAMPLE: public static void sayHello(String name)
     * String name ->> is a parameter
     * ARGUMENT: ACTUAL DATA(INSIDE THE MAIN) WE PASS TO METHODS
     * FOR EXAMPLE sayHello("isil");
     * isil ->> is argument
     */

    public static void main(String[] args) {
        sayHello();
        sayHello("isil");
        sayHello(37);
        System.out.println( sayHello("isil", "avunduk") );
    }

    public static void sayHello(){
        System.out.println("Hello world");
    }

    public static void sayHello(String name){
        System.out.println("Hello "+ name);
    }
    public static void sayHello(int num){
        System.out.println("Hello "+num);
    }
    public static String sayHello(String firstName, String lastName){
        return "Hello " +firstName+ " "+lastName;

    }

}
