package day21;

import java.util.Scanner;

public class SearchingSomethingInString {
    public static void main(String[] args) {

        //Find out index of all the a in case insensitive manner

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        //EXTRA INFO ABOUT HOW MANY CHAR INSIDE THE NAME AND THE LAST CHAR'S INDEX
        int charCount = name.length();
        int lastCharIndex = name.length()-1;
        System.out.println("How many char(character) you have in your name include space: "+charCount+ ", Last Char's index: "+lastCharIndex);


        //i index of the 'a' or 'A'
        for(int i=0; i<name.length(); i++){
            String currentChar = name.substring(i, i+1);

            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("The index of a or A is: " + i);
            }
        }


    }
}
