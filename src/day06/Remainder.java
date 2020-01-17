package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        // + - * /
//
//        System.out.println( 5 / 2);
//        System.out.println( 5.0 / 2 );
//        System.out.println( 5.0 / 2f );
//        System.out.println( 5 % 2 );  //remainder yani kalani verir
//        System.out.println( 99 % 10);
//        System.out.println( 100 % 10);

        Scanner scan = new Scanner(System.in);
        System.out.print("How many minute?: ");
        int minute = scan.nextInt();
        int resultHour = minute/60;
        int resultMinute = minute%60; //int resultMinute= minute - (resultHour*60);
        System.out.println(minute+" minute is "+ resultHour+ " hour and "+ resultMinute+ " minute");

    }
}
