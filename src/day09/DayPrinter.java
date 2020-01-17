package day09;

import java.util.Scanner;

public class DayPrinter {
    public static void main(String[] args) {


        int dayCode =5;
        String  dayName = "";

        if(dayCode ==1 ){
            dayName = "Monday";
        }else if (dayCode ==2){
            dayName = "Tuesday";
        }else if (dayCode ==3){
            dayName = "Wednesday";
        }else if (dayCode ==4){
            dayName = "Thursday";
        }else if (dayCode ==5){
            dayName = "Friday";
        }else if (dayCode ==6){
            dayName = "Saturday";
        }else if (dayCode ==7){
            dayName = "Sunday";
        }else{
            dayName = "Unknown";
        }
        System.out.println(dayName);



        //II.WAY

//        Scanner sc = new Scanner(System.in);
//        int daycCode = sc.nextInt();
//
//        if (daycCode ==1 ){
//            System.out.println("Monday");
//        }else if(daycCode == 2){
//            System.out.println("Tuesday");
//        }else if(daycCode == 3){
//            System.out.println("Wednesday");
//        }else if(daycCode == 4){
//            System.out.println("Thursday");
//        }else if(daycCode == 5){
//            System.out.println("Friday");
//        }else if(daycCode == 6){
//            System.out.println("Saturday");
//        }else if(daycCode == 7){
//            System.out.println("Sunday");
//        }else
//            System.out.println("Day is unknown");

    }
}
