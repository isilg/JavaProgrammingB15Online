package day35;
import taskChannel.Array;
import java.util.Arrays;
public class Integer_parseInt_Method_Return_String_To_Number {
    public static void main(String[] args) {
        /**
         ************INTERVIEW QUESTION: RETURN A STRING TO AN INT ***************
         * Integer.parseInt() method will turn a String to int result, primitive result.
         * If we have any non-numerical character -->> It will throw NumberFormatException
         * Integer class ->> is class coming from java.lang package
         * It's primarily used for wrapping up primitive value and treat it as an object.
         * parseInt    ->> is a static method of Integer class
         * Integer.valueOf() -->> take int and return an Integer object
         * EX/ int count = Integer.valueOf() -->> return an object then unbox it
         * into count,  saving it into an int variable
         */

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num= "+num);
//        String str = "100";
//        System.out.println( Integer.parseInt(str) );  -->>100

        //RETURN 487 AS AN INT
        String empID = "FB-487";
        //System.out.println( Integer.parseInt(empID) ); -->ERROR. THERE IS OTHER CHARACTERS THAN NUMBERS
        System.out.println( Integer.parseInt( empID.split("-")[1]) );


        // YOU HAVE 2 STRINGS 100 and 600. ADD 100 AND 600 AND GIVE THE RESULT
        // IN ORDER TO PERFORM ARITHMETIC OPERATION WE MUST HAVE NUMBERS STORED IN int
        // SO FIRST WE NEED TO TURN STRING INTO int. JDK Already provide such methods
        // and it comes from Integer class from java.lang package

        String num1Str = "100";
        String num2Str = "600";

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);


        //ADD 100 AND 600 AND RETURN THEM
        String twoNumbers = "100,600";
        String[] arr = twoNumbers.split(",");
        int part1= Integer.parseInt( arr[0] );
        int part2 = Integer.parseInt( arr[1] );
        System.out.println(  part1+part2 );



    }
}
