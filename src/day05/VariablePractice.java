package day05;

public class VariablePractice {
    public static void main(String[] args) {

        //More than 1 line comment:

        /*
           line1
           line2
           line3
         */


        /*
        whole numbers      : byte, short, i nt, double
        fractional numbers : float, double
        logical            : boolean(true,false)
        character          : char (single character in single quote)

        usually by default for whole numbers: just use int
        usually by default for fractional numbers: just use double

        Is String part of primitive types?  : NO
        String is sequence of character

         */

//        int birthYear = 2001;
//        int currentYear = 2019;
//        int age = currentYear - birthYear;
//
//        //I was born in year 2001 , and I am 18 year old
//        System.out.println("I was born in year "+ birthYear+ " and I am "+age+ " year old");



        //Task 2:
        int speedLimit= 90;
        int yourCurrentSpeed =100;

        System.out.println("You are driving "+(yourCurrentSpeed-speedLimit)+" mph more than speed limit");
    }

}
