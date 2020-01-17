package day27;
import java.util.Arrays;
import java.util.Scanner;
public class Muti_Dimensional_Array {
    public static void main(String[] args) {
        //Task 01: Write a program that ask usEr to enter 5 number and store those numbers into array
        //BU SEKILDE HATA VERIR. WHY? ARRAY SIZE IS FIXED AND SIZE OF THE ARRAY MUST BE INITIALIZED BEFORE WE USE IT
        //int[] numbers;
        //numbers[0] = 5;

        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        //II.WAY
        for(int i= 0; i<5; i++){
            System.out.println("Enter a number:");
            nums[i]=sc.nextInt();
        }
        System.out.println( Arrays.toString(nums) );

    }
}
