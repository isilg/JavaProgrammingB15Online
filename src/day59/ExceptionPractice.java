package day59;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionPractice {
    public static void main(String[] args) {

        System.out.println("The Start");
        String name = "Katie";

        Scanner sc = new Scanner(System.in);
        System.out.println("What index you like to get?: ");

//We can type more than 1 catch for different type of exceptions
        try {
            int targetIndex = sc.nextInt();
            System.out.println(name.charAt(targetIndex));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("You are out of bound ");
        }catch (InputMismatchException e1){
            System.out.println("Input mismatch, please enter a number ");
        }


        System.out.println("The End");
    }
}
