package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current speed, dear driver: ");
        int currentSpeed = sc.nextInt();

        System.out.print("What is speed limit: ");
        int speedLimit = sc.nextInt();

        if (currentSpeed >= speedLimit){
            System.out.println("get pulled over by police");
            System.out.println("given ticket by the police");

        } //THERE IS NI ELSE, PROGRAM JUST MOVE ON

        System.out.println("The end of the story! Move on!");


    }
}
