package day31;
public class Calculator {
    /**
     * Create a static method that accept
     * 2 numbers add them and print the result
     */

    public static void main (String[] args){
        //these values we pass called argument
        // 6 is an argument, 23 is another argument
        add(6,23);
        add(16,3);
        add(1,6);
        add3Numbers(1,5,99);
        add3Numbers(10,5,25);
    }

    public static void add(int n1, int n2){
        int sum = n1 + n2 ;
        System.out.println(" Result of : " +n1+"+"+n2+"is " +sum);
    }

    public static void add3Numbers(int num1,int num2,int num3){
        System.out.println("Result of adding 3 numbers is: "+ (num1+num2+num3) );
    }
}
