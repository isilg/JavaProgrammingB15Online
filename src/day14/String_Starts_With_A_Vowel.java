package day14;
import java.util.Scanner;
public class String_Starts_With_A_Vowel {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if( str.charAt(0)=='a'|| str.charAt(0)=='e'|| str.charAt(0)=='i'|| str.charAt(0)=='o'||str.charAt(0)=='u') {
        System.out.println("it starts w a vowel");
    }else
            System.out.println("no vowel at the beginning");

 }
}
