package day36;
import org.w3c.dom.ls.LSOutput;
public class method_With_Wrapper_Types {
    public static void main(String[] args) {

        // It is expecting 2 Integer object and
        // we used Integer.valueOf to provide 2 Integer Objects
        sumAndPrint( Integer.valueOf(23), Integer.valueOf(10) );

        // It's expecting 2 Integer Object
        // and we used new keyword to provide 2 Integer Object
        sumAndPrint( new Integer(23), new Integer(10) );

        // i1 is a variable with data type Integer and
        // it can store Integer Object
        // What is the deal here with 12??  -->> autoboxing
        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1, i2);

        // We directly passed int. Knowing that autoboxing can take care of
        // converting to Object. This is recommended way
        sumAndPrint(23,10);

        System.out.println("-----------  method with int parameter ------");
        printTheDoubleValue(10);

    }

    /** This method add 2 Integer numbers and print
     * @param num1 type Integer , first number to add
     * @param num2 type Integer , second number to add
     * We cannot add 2 Objects
     * WWhat is happening  here is
     * the  moment the + operator appeared compiler will turn
     * num1 and num2 into int so it can add them numerically
     * Integer to int conversion  -->> auto-unboxing
     */


    public static void sumAndPrint(Integer num1, Integer num2){
        System.out.println(num1+num2);
    }

    public static void printTheDoubleValue(int x){
        System.out.println("after doubling x = " +(x*2) );
    }
}
