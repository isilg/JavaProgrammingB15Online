package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        //If user is 18 year old print ou are ready to vote !!!. Otherwise print Wait until you are 18

//        int age = 37;
//
//        if (age>=18) {
//            System.out.println("You are ready to vote !!!");
//        }
//        else
//            System.out.println("Wait until you are 18");




        //Ask a number from customer if they know the number is 300
        //print bingo otherwise you are not my best friend, try again

        Scanner sc = new Scanner(System.in);

        System.out.print("Guess my number: ");
        int myFavoriteNumber = sc.nextInt();

        if (myFavoriteNumber ==300){
            System.out.println("BInGO!!!");
        }
        else
            System.out.println("YOU SUCK! YOU F...G COULD NOT KNOW! U R NOT MY FRIEND !");

    }
}