package TaskSolution;

import java.util.Scanner;

public class StringTask8 {
    public static void main(String[] args) {
        /*
        Ask user enter a sentence. Assuming the sentence has at least 2 words
        also assuming there is single space between words.
        First trim empty spaces in 2 sides.
        Then check if the first index of space is equal to last index of the space
        If so print you have entered 2 words
        else print you have more than 2 words
        for example:
        Jon Snow ->
        first index of the space is 3, last index of the space is also 3
        this means there is only 2 words
        Kong in the North ->
        first index of the space is 4,  last index of the space is 11
        this means there is more than 2 words
         */


       Scanner sc =  new Scanner(System.in);
       System.out.println("Please enter a sentence:");
       String sentence = sc.nextLine();

       String trimmedSentence = sentence.trim();

       int firstIndexSpace = trimmedSentence.indexOf(" ");
       int lastIndexSpace = trimmedSentence.lastIndexOf(" ");
       if(firstIndexSpace == lastIndexSpace){
           System.out.println("you have entered 2 words");
       }else
           System.out.println("you have entered more than 2 words");


    }
}
