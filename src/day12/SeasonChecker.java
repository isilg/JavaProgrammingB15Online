package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your season");
        String season = sc.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Navruz, Alergy Season, Cool weather");
        }else  if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool, Swimming, Beach, Vacation");
        }else  if (season.equalsIgnoreCase("fall")) {
            System.out.println("Barbecue, riding bike, Hallowen, JUST CODE!!!");
        }else  if (season.equalsIgnoreCase("winter")) {
            System.out.println("CODE!!!, Ski, Sleeding, Snowman");
        }else
            System.out.println("NOT VALID");

    }
}
