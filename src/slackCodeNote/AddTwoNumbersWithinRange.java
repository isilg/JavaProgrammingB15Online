package slackCodeNote;

import java.util.Scanner;

public class AddTwoNumbersWithinRange {
    public static void main(String[] args) {

       // KULLANICIDAN 2 SAYI AL O SAYILARIN ARASINDAKI SAYILARI
        // TOPLA DONDUR, O SAYILAR DAHIL DEGIL

        Scanner scan = new Scanner(System.in);
        System.out.print("pls enter first number");
        int num1 = scan.nextInt();
        System.out.print("pls enter second number");
        int num2 = scan.nextInt();

        int i = num1;
        int sum=0;
        for ( i =num1+1; i<num2; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
