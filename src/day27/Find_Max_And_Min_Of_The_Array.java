package day27;
import java.util.Arrays;
import java.util.Scanner;
public class Find_Max_And_Min_Of_The_Array {
    public static void main(String[] args) {

        //CREATE AN INT ARRAY THAT HAS SIZE 5 AND GET THE ELEMENTS FROM USER
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));


        //TASK 01: Find the largest number
        int max = nums[0];
//        for (int eachNum : nums) {
//            if (max < eachNum) {
//                max = eachNum;
//            }
//        }

        for (int i = 0; i <nums.length ; i++) {
            if (max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("Maximum number is: " + max);



        //TASK: Return the Second max number of the array
        int secMax = nums[0];
        for (int i= 0; i < nums.length; i++){
            if (secMax < nums[i] && nums[i]!= max){
                secMax = nums[i];
            }
        }
        System.out.println("Second max: " + max);



        // TASK: Return the min number of the array
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Minimum number is: " + min);


        //TASK 03: Return second min number
        int secMin = nums[0];
        for (int i = 0; i < nums.length; i++){
        if (nums[i] == min) {
            continue;
        }
        if (secMin > nums[i]) {  //you can use if else or instead of if else you could do 2 if
            secMin = nums[i];
        }
       }
             System.out.println("Second min number is: " + secMin);


//        int secMin2=nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if ( secMin2 != min  && secMin2 > nums[i] ){
//                secMin2 = nums[i];
//            }
//        }
//        System.out.println("Second min number is: " + secMin);




        // TASK 04: Return second max number
//            int secMax = nums[0];
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == max) {
//                    continue;
//                }
//                if (secMax < nums[i]) {
//                    secMax = nums[i];
//                }
//            }
//            System.out.println("Second maximum number is: " + secMax);




            //FIND THE THIRD MIN
           int thirdMin = nums[0];
           for (int i = 0; i < nums.length; i++){
               if (nums[i] ==min && nums[i]==secMin){
                   continue;
               }
               if (thirdMin > nums[i]) {
                   thirdMin = nums[i];
               }
           }
        System.out.println("Third min: " + thirdMin);




// You can find the min and max by this way but not preferable at the interviews
//      Arrays.sort(nums);
//      int minNumber = nums[0];
//      System.out.println(minNumber);

//Arrays.sort(Array_Name): sorts the array in ascending order
// Arrays.sort(nums);
// int largestNum = nums[nums.length-1];  // AFTER SORTING, LAST ITEM WILL BE THE LARGEST
 // System.out.println(largestNum);

    }
}