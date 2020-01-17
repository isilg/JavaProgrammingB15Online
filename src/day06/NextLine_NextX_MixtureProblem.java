package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = blabla.nextLine();
        System.out.println("Your name is "+ name);

        System.out.print("What is your age?: ");
        int age = blabla.nextInt();  //String age = blabla.nextLine();  //it is not recommended but it works. It return it to age
        blabla.nextLine();  //we just want below line to capture ENTER keyboard input so that it does not accidentally get captured by the nextLine we use to capture address
        System.out.println("Your age is " + age);

        System.out.print("What is the address?:  ");
        String address = blabla.nextLine();
        System.out.println("Your address is: "+address);

        //Eger bi question a cevap girmeni engelliyorsa yani text yazamiyorsan sadece boyle bi line yaz
        //blabla.nextLine();

    }
}
