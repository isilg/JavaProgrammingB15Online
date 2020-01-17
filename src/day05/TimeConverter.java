package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        /*
        Task 3:
        * Create an interactive program to ask user for day
        * and generate minute that day have
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("How many days?: ");
        double day =  scan.nextDouble();
        double minute = day*1440;
        System.out.println(day+ " day is " + minute + " minute");





        /*
        Task 4:
        * Create an interactive program to ask user for hourly wage
        * and generate yearly salary
           assume that he works 2080 hour for a year
        */

        System.out.print("What is your hourly wage?: ");
        double wage = scan.nextDouble();
        double yearlySalary = wage * 2080;
        System.out.print("Your yearly salary is: "+ yearlySalary);

        /*
        Task 5: Grocery Shopping
        * ask user whats the price of tomato and store it
          ask user how many tomato you want to buy and store it
        * ask user whats the price of potato and store it
          ask user how many tomato you want to buy and store it
        * ask user whats the price of banana and store it
          ask user how many tomato you want to buy and store it

              generate this example output
              You got 3 tomato price is 2.99 and total -->>
              You got 3 tomato price is 2.99 and total -->>
              You got 3 tomato price is 2.99 and total -->>

              Your grand total for this shopping is ????
         */
        System.out.println("\t");
        System.out.print("What is the price for tomato?: ");
        double tomPrice = scan.nextDouble();
        System.out.print("How many tomato you like to buy?: ");
        int tomNumber = scan.nextInt();
        double tomTotal = tomNumber * tomPrice;

        System.out.print("What is the price for potato?: ");
        double potPrice = scan.nextDouble();
        System.out.print("How many potato you like to buy?: ");
        int potNumber = scan.nextInt();
        double potTotal = potNumber * potPrice;

        System.out.print("What is the price for banana?: ");
        double banPrice  = scan.nextDouble();
        System.out.print("How many banana you like to buy?: ");
        int banNumber = scan.nextInt();
        double banTotal = banNumber * banPrice;


        System.out.println("You got "+tomNumber+ " tomato. Price is " + tomPrice+ " and total "+tomTotal);
        System.out.println("You got "+potNumber+ " potato. Price is " + potPrice+ " and total "+potTotal);
        System.out.println("You got "+banNumber+ " banana. Price is " + banPrice+ " and total "+banTotal);


    }
}