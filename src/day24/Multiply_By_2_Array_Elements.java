package day24;
import java.util.Scanner;
public class Multiply_By_2_Array_Elements {
    public static void main(String[] args) {

        // long type bir array tanimla
        long[] nums = {10,40,20};

        //Array in item larini ekranda dondur
        //System.out.println(nums);   JUST TYPING ARRAY'S NAME RETURNS ASCII CHARACTERS
        //I.WAY FOR EACH LOOP
        for(Long eachNum : nums){
            System.out.print(eachNum+" ");
        }
        System.out.println();
        //II.WAY FOR LOOP
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        //Multiply each elements and return them
        for (int i=0; i<nums.length; i++){
            nums[i]=nums[i]*2;
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        //DOES MULTIPLYING CHANGE THE ORIGINAL ARRAY?
        //PRINT THE ARRAY AND SEE
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        //CHANGING ARRAY'S VALUES BY FOR AND FOR EACH LOOP!!


        for (int i = 0; i <3 ; i++) {
            long eachItem = nums[i];
            eachItem = 100;
            System.out.print(eachItem);
  //**** the change is actually made in the local variable not in the actual location where nums[i] is referencing
  //**** If you want to directly change the array then manipulate the array by using for loop not for each loop
        }

        System.out.println();

        for(long eachItem : nums){
            eachItem =100;
            System.out.print(eachItem);
        }

    }

    }







