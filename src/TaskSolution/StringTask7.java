package TaskSolution;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {

        /*
        Ask user to enter valid email address
        for example: JSnow@NightWatch.com or
        Arya@KingsLanding.edu

        print 3 part of the email separetaly
        for example:
        Part 1->JSnow  Part 2->NightWatch  part 3->com
        Part 1->Arya  Part 2->KingsLanding  part 3->edu
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email: ");

        String email = sc.next();


        System.out.println("Part 1: "+ email.substring(0, email.indexOf("@")) +
                           ", Part 2: "+ email.substring(email.indexOf("@")+1, email.indexOf("."))+
                           ", Part 3: "+ email.substring(email.indexOf(".")+1));


    }
}
