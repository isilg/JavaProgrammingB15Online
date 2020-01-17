package TaskSolution;

import java.util.Scanner;

public class StringTask9 {
    public static void main(String[] args) {

        /*
        Ask user to enter a valid URL in below format
        www.blackfriday.com
        Write a program to print first Index of .(dot)
        and last index of .(dot) and eventually print the domain
        for example: www.blackfriday.com -->>blackfriday
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = sc.next();
        System.out.println( url.substring(url.indexOf(".")+1, url.lastIndexOf(".")) );
    }
}
