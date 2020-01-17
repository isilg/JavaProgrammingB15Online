package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //Creating scanner object
        Scanner scan = new Scanner(System.in);


        //Sadece string ve char icin .next() kullan(gerekirse nextLine).
        //float icin nextFloat(), double icin nextDouble(), int icin nextInt(), boolean icin next.Boolean()
        System.out.print("Enter your first name please: ");
        String firstName = scan.next();
        System.out.println("You have entered: "+firstName);


        System.out.print("Please enter your age:");
        int age = scan.nextInt();
        System.out.println("your age is: "+ age);


    }
}
