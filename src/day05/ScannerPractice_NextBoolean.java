package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {

        //Creating a Scanner object
        Scanner input= new Scanner(System.in);

        //asking user a question
        System.out.println("are you recording? ");
        boolean isRecording = input.nextBoolean();

        //The result of concatenating a string to any data type -->> VIDEODAN BA
        //Answer has to be true or false after nyou run otherwise you'll get an error
        System.out.println("We are recording "+ isRecording);
    }
}
