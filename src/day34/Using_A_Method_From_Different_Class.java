package day34;
import day31.Calculator_2;
import day32.Print_1_To_X;
import day33.Calculate_Age;
import org.w3c.dom.ls.LSOutput;

public class Using_A_Method_From_Different_Class {
    // CALLING A STATIC METHOD FROM ANOTHER CLASS

    public static void main(String[] args) {
        // CALLING  build_3Digit_Numbers  METHOD
        // ******CLASS_NAME.METHOD_NAME*******

        // *** COME OVER threeDigitNumber METHOD. HIGHLIGHT IT
        // CLICK option+space. threeDigitNumber METHOD WILL POP UP
        int result = Build_3Digit_Numbers.threeDigitNumber(6, 4, 0);
        System.out.println("result: " + result);

        //*** CLICK ON THE METHOD AND HIGHLIGHT THE METHOD NAME
        // (CALCULATE WILL BE IN BLUE) AND CLICK option+space
        // CALCULATE METHOD WILL POP UP
        Calculator_2.calculate(20, 10, '-');
    }

}
