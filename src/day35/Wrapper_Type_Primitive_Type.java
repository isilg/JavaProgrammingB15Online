package day35;
public class Wrapper_Type_Primitive_Type {
    public static void main(String[] args) {

        Integer num1 = 100;   // auto-boxing 100-->> new Integer(100)

        // Integer.valueOf() is a method that return Integer Object
        // It has 2 overloaded version one that accept number,
        // another accept String. BUT BOTH OF THEM RETURN INTEGER OBJECT
        int num2 = Integer.valueOf("200");   //auto-unboxing into 200

        // ERROR. INT CANNOT RETURN STRING LIKE THAT
        // USE Integer.parseInt().
        // Integer.parseInt() method returns an int value converted from String
        // int num3 = "200";
        int num3 = Integer.parseInt("200");

        /**
         * Integer.parseInt() =>  String -> int
         * Integer.valueOf() => 1-accepts number: int->Integer Object
         * 2-accepts String: String->Integer Object
         */


        String one = "1";
        String two = "2";
        int result = Integer.valueOf(one)+Integer.valueOf(two);
        System.out.println("Integer.valueOf() result is: " +result);


        String one1 = "1";
        String two2 = "2";
        int result2 = Integer.parseInt(one)+Integer.parseInt(two);
        System.out.println("Integer.parseInt() result is: " + result2);
    }
}
