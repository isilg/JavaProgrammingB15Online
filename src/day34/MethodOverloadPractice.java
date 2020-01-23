package day34;
import com.sun.jdi.event.StepEvent;
public class MethodOverloadPractice {
    /**
     * METHOD OVERLOAD: METHODS HAVE SAME NAME
     * BUT HAVE DIFFERENT PARAMETERS IN SAME CLASS.
     * IT THEY ARE IN DIFFERENT CLASS IT DOESNT BE METHOD OVERLOAD.
     * IT COULD BE DIFFERENT PARAMETER COUNT OR DIFFERENT PARAMETER TYPE OR BOTH
     * METHOD OVERLOADING ONLY CARE ABOUT METHOD SIGNATURE
     * IT DOES NOT CARE ABOUT ACCESS MODIFIER, RETURN TYPE, STATIC
     *
     * METHOD SIGNATURE: METHOD NAME + PARAMETER LIST
     *
     * PARAMETER: VALUES METHODS EXCEPT
     * FOR EXAMPLE: public static void sayHello(String name)
     * String name ->> is a parameter
     *
     * ARGUMENT: ACTUAL DATA(INSIDE THE MAIN) WE PASS TO METHODS
     * FOR EXAMPLE sayHello("isil");
     * isil ->> is argument
     *
     * class Plane{
     *     public static void fly(int mile){
     *         //some code
     *     }
     *     public static long(int mileX){
     *
     *     }
     * }
     * This methods give error mile or mileX does not matter different names.
     * intellJ think both of them has 1 int paramater. It doesnt care about return types
     * Since method names, types of parameters and number of the parameters are same it gives error
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
