package TaskSolution;

import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        //Ask user to enter full name, assuming full name is 2 words
        //Write a program to print users initials for example: Jon Snow -->JS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        //MY WAY
        int space = name.indexOf(" ");
        System.out.println( name.substring(0,1)+""+name.substring(space+1,space+2) );


        //AKBAR'S WAY
        int lastNameInitialIndex = name.indexOf(" ")+1; //name.indexOf(" ") -> Space , name.indexOf(" ")+1 -> Last name's initial
        String initials = name.charAt(0) +""+ name.charAt(lastNameInitialIndex) ;
        System.out.println(initials);
    }
}
