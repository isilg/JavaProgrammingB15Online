package day32;
public class Number_Comparision {
/**
 * method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 */

public static void main(String[] args) {
        numberComparision(10,5);
        numberComparision(5,10);
        numberComparision(5,5);
    }

    public static void numberComparision(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 is more than num2");
        } else if (num2 > num1) {
            System.out.println("num2 is more than num1");
        } else
            System.out.println("they are equal");

    }
}
