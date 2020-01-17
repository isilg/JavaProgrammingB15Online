package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

//        int myFavoriteNumber = 300 ;
//        int yourFavoriteNumber = myFavoriteNumber ;
//
//        System.out.println("My favorite Number "+myFavoriteNumber);
//        System.out.println("Your favorite Number "+yourFavoriteNumber);
//
//        yourFavoriteNumber = 100;
//        System.out.println("My favorite number " +myFavoriteNumber);
//        System.out.println("Your favorite number " +yourFavoriteNumber);
//
        Scanner scan = new Scanner(System.in) ;
        System.out.println("What is your order?: ");
        String yourOrder = scan.nextLine();
        String myOrder = yourOrder;

        System.out.println("Your order is: "+yourOrder+"\n"+ "My order is the same as "+yourOrder);



//        String yourOrder = "fish";
//        String myOrder = yourOrder;
//        System.out.println("Your order is "+yourOrder+ "\n"+",and my order is: "+myOrder);

    }


}
