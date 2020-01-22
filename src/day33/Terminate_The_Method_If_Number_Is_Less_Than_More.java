package day33;

import java.util.Scanner;

public class Terminate_The_Method_If_Number_Is_Less_Than_More {
    /**
     * If user enter a number that is less than 10
     * Terminate the method
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number more than 10");

        int num = sc.nextInt();
        if (num<10){
            //You can use return keyword to get out of the method
            //in void methods. As long as you don't actually return a value
            //type just return , without a value like below
            return ;
        }
        System.out.println("HAPPY HOLIDAYS");
        System.out.println("2 DAYS OFF!!");

    }



}
