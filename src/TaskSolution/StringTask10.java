package TaskSolution;

import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {

        /*
            FIRST: Ask user to enter sentence with 3 words
            For example: I love Java
            Print second word
            SECOND: Assume there is more than 3 words
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();

        //if there are 3 words 2.word is between first and last space
        int indexOfFirstSpace = sentence.indexOf(" ");
        System.out.println("Index of first Space: "+indexOfFirstSpace);

        int lastIndexOfSpace = sentence.lastIndexOf(" ");
        System.out.println("Last Index Of Space: "+lastIndexOfSpace);

        System.out.println( sentence.substring(indexOfFirstSpace+1, lastIndexOfSpace) );

        //IF WE HAVE MORE THAN 3 WORDS
        //.indexOf( "WHAT U R LOOKING FOR", "WHERE U R GONNA START" );
        //Space ariyorum, ilk space in hemen yanindaki karakterden baslayarak
        int secondSpaceOfIndex = sentence.indexOf(" ", indexOfFirstSpace+1);
        System.out.println("Second Space Index: "+ secondSpaceOfIndex);

        System.out.println(sentence.substring(indexOfFirstSpace+1, secondSpaceOfIndex));

    }
}
