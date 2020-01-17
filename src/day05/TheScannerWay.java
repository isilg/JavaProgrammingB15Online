package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = scan.next();
        System.out.println("You have entered: "+name);

        System.out.print("Please enter your birth year:");
        int birthYear = scan.nextInt();
        int age= 2019-birthYear;
        System.out.println("your age is: "+ age);

        System.out.print("Enter your height: ");
        double height = scan.nextDouble();
        System.out.println("You have entered: "+height);

    }
}
