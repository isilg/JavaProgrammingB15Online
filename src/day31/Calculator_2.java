package day31;

import org.w3c.dom.ls.LSOutput;

public class Calculator_2 {

    /**
     * Give the operator and 2 nums and do the counting
     */
    public static void main(String[] args) {

        calculate(10,30,'-');
        calculate(20,10,'+');
        calculate(40,3,'*');
        calculate(40,4,'/');
        calculate(40,4,'A');
    }

    public static void calculate(int n1, int n2, char operator){
        switch (operator){

            case '+':
                System.out.println( "Addition result is: "+(n1+n2) );
                break;

            case '-':
                System.out.println("Substraction result is: "+(n1-n2));
                break;

            case '*':
                System.out.println("Multiplication is: "+(n1*n2));
                break;

            case '/':
                System.out.println("Division result is: "+(n1/n2));
                break;
            default:
                System.out.println("Invalid parameter");
        }
    }
}
