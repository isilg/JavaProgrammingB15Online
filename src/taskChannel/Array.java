package taskChannel;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of elements in array");
        int n = scan.nextInt();
        int[] nums = new int[n]; // n elemanlik bi yer ayirdi

        for (int i=0; i<n; i++){
            System.out.println("Please enter value of element"+i);
            nums[i]=scan.nextInt();
        }


        //TASK ON DECEMBER 9, MONDAY
//        create an int array of 6 elements and find out
//        average of the array ,  sum of all elements
//        sum of even numbers in the array ,  sum of odd numbers in the array
//        max number in the array,  min number in the array

//        //MAX NUMBER WITHOUT SCAN
//        int[] nums = {1,34,45,6,7,43};
//        int max = nums[0]; //ilk number in max oldugunu farz et
//        for (int i=0; i<nums.length; i++){
//            if (nums[i]>max){
//               max = nums[i];
//            }
//        }
//        System.out.println(max);
//
//
//        //MIN NUMBER WITHOUT SCAN
//        int min = nums[0]; //ilk number in max oldugunu farz et
//        for (int i=0; i<nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        System.out.println(min);

    }
}
