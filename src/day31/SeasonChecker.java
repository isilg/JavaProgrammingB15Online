package day31;

import java.util.Scanner;

public class SeasonChecker {

    /**
     * Write a static method called decideSeasonAction
     * It has one String parameter called season
     * Inside method:
     * according to what user passed it should print correct action
     */

    public static void main(String[] args) {

        //I.WAY TO CALL decideSeasonAction() METHOD
        decideSeasonAction("Summer");

        //II.WAY TO CALL THE METHOD
        String mySeason = "Spring";
        decideSeasonAction(mySeason);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a season");
        String season = sc.next();
        decideSeasonAction(season);

    }


    public static void decideSeasonAction(String season) {

        switch (season) {

            case "Spring":
                System.out.println("Hiking");
                break;

            case "Summer":
                System.out.println("Swimming");
                break;

            case "Fall":
                System.out.println("Pumpkin picking");
                break;

            case "Winter":
                System.out.println("Go snowboarding");
                break;

            default:
                System.out.println("Invalid Season");


        }
    }
}
