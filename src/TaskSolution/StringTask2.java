package TaskSolution;

import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {

        //When you search from google it will always show your search
        //keyword in tab name for example if you search Java, your tab
        //title is : Java - Google Search
        //Create a program to ask user to enter a String with any number of word
        //Create a called searchKewyword to save user input.
        //Create another String variable called tatTitle assign tabTitle
        //value to searchKeyword + "-Google Search". Check if tabTitle start
        //with your searchKeyword and end with - Google Search. If so
        //print the test has passed, if not print test has failed

        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter the search keyword" );
        String searchKeyword = sc.nextLine();

        String tabTitle = searchKeyword + "-Google Search" ;
        System.out.println("tabTitle=" + tabTitle);

        if (tabTitle.startsWith( searchKeyword ) && tabTitle.endsWith( "Google Search") ){
            System.out.println("TEST PASSED!");
        }else {
            System.out.println("TEST FAILED");
        }
    }
}
