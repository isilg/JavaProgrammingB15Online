package slackCodeNote;

import day06.ScannerCapturingMultipleWord;

import java.util.Scanner;

public class DoWhile_Shazam {
    public static void main(String[] args) {
        /*
        * Write a program to
        * repeatedly ask user for keyword to turn into super hero
        * unless user say SHAZAM! in case insensitive manner
        * program will keep asking
        * and when you user enter Shazam! it will print you are now Super Hero!
        *
        hint : use do while loop
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keyword: ");
        String keyword = sc.nextLine();

        //do while a gelene kadar once Enter the keyword sorar sonra keywordu girince,
        //while daki kosula gore ya do ya girer yada gormez ve while in altindaki kosulu yapar
        //eger keyword is NOT shazam jump into the do once ekranda wrong keyword der
        //sonra tekrar keyword girmesi icin keyword alir =>
        do{
            System.out.println("Wrong keyword");
            keyword = sc.nextLine();
        }while (! keyword.equalsIgnoreCase("Shazam"));
            System.out.println("You are now Super Hero!");



    }
}
