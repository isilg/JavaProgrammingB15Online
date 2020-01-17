package TaskSolution;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask11 {
    public static void main(String[] args) {
        /*
        Ask user to enter sentence with more than 1 word
        Print first word and last word
         */

        Scanner sc = new Scanner(System.in);
        System.out.println( "Please enter a sentence that more than 1 word: " );
        String sentence = sc.nextLine();

        String firstWord = sentence.substring( 0, sentence.indexOf(" ") );
        System.out.println(firstWord);

        //Last word starts from last space till last character of the sentence
        String lastWord = sentence.substring( sentence.lastIndexOf(" "), sentence.length() );
        System.out.println(lastWord);

        //IF ACCIDENTALLY USER PUT SPACE AT THE END,
        //SPACE WILL COME OUT AS A LAST CHARACTER SO
        //TRIM THE SENTENCE IF IT HAPPENS


    }
}
