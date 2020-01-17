package TaskSolution;

import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        /*
        Ask user to enter a word with at least 3 characters
        Print the first, last, and middle character
        For example : Uighur
            first character: U
            last character: r
            middle character: g
            If the length is even number get the one on the left
         for ex: Statement
            first character: S
            last character: t
            middle character: e

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.next();

        if (word.length() < 3) {
            System.out.println("Please enter another word that has at least 3 characters");
        }
        if (word.length() >= 3) {
            System.out.println("First character: " + word.substring(0, 1));  //word.charAt(0);
            System.out.println("Last caharcter: " + word.charAt(word.length() - 1));
            if (word.length() % 2 != 0) {
                System.out.println("Middle character: " + word.charAt(word.length() / 2));
            } else if (word.length() % 2 == 0) {
                System.out.println("Middle character: " + word.substring(word.length() / 2 - 1, word.length() / 2));
            }
    }


        //II.WAY
        //012345678   //012345
        //Statement     Uighur

        //int middleIndex = (word.length()-1)/2;
       // System.out.println(word.charAt(middleIndex));

    }

    }

