package TaskSolution;

import java.util.Scanner;

public class StringTask12 {
    public static void main(String[] args) {
        /*
        Given a String with at least two characters
        swap first character with last character
        for example: Java --> aavJ, Kawap --> pawaK
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word with at least 2 characters: ");

        String word = sc.next();

        if( word.length() == 2 ){
            System.out.println( word.charAt(1) + " "+word.charAt(0));
        }//Son karakteri al, ortalari oldugu gibi birak sonrada ilk karakteri ekle
        else if( word.length() > 2 ){
            System.out.println( word.charAt(word.length()-1) + word.substring( 1, word.length()-1 ) + word.charAt(0) );
        }else
            System.out.println( "Invalid Input" );


    }
}
