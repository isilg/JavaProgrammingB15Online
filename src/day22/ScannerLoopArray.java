package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter your number "+ (i+1));
            numbers[i] = scan.nextInt();   //GETTING NUMBER FROM SCANNER
        }
        //opening 2.nd for to print the numbers
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i] +" ");
        }
    }
}
