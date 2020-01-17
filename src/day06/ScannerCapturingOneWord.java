package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = blabla.next(); // sadece bunu yazarsak king arthur girildiginde sadece king i yani ilk kelimeyi alip digerini ekranda dondurmez

        //String anotherWord = blabla.next();
        int age = blabla.nextInt(); //gives MismatchException error because if we enter king arthur it return king and arthur u age olarak degerlendirir ama arthur int olmadigi icin error aliriz

        System.out.println("You have entered " + name );
        System.out.println("Another words is " + age);
    }
}
