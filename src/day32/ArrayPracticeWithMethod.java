package day32;
import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;
public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        //this is passing the array object directly into the method
        printArrayItems( new int[]{1,6,5,3,12,3});

        //this is assigning the array object into a variable
        //and then pass it into the method
        int[] scores = {2,5,8,23,4,5,6};
        printArrayItems(scores);


        System.out.println();
        printMaxOfIntArray(scores);


        System.out.println();
        printMinOfIntArray(scores);


        System.out.println();
        printSumOfIntArray(scores);


        System.out.println();
        checkScoresAllMoreThan60(scores);


        System.out.println();
        compare2arraySize( new String[]{"Sezgin", "Senay","Astrit"}, new String[]{"Araz"} );

        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};
        compare2arraySize(names1, names2);

    }

    //printArrayItems
    //create a method that has one int array as a parameter
    //print out each item in this format
    //arrays has items: -->>> all the items here
    public static void printArrayItems(int[] nums){
        System.out.println("arrays has items :"+ Arrays.toString(nums));
    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums){
        int max = nums[0];
        for (int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Max item in the array is: "+ max);
    }

    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array
    public static void printMinOfIntArray(int[] nums){
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if (nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println("Min item of the array is: "+min);
    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //for(int each:nums){
            //sum+=each
       // }
        System.out.println("Sum of the items of the array is: "+sum);
    }


    //compare2arraySize
    //create a method that accept 2 String array object
    //and compare the item counts inside these 2 arrays
    //if arr1 has more than arr2, print array 1 has more item
    //if arr2 has more than arr1, print array 2 has more item
    //else print they have same item count
    public static void compare2arraySize(String[] arr1, String[] arr2){

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }
    }


    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether each and every numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed
    public static void checkScoresAllMoreThan60(int[] nums){
        for(int eachNum : nums){
            if(eachNum >60){
                System.out.println("everyone passed");
            }else
                System.out.println("someone has failed");
        }
    }

}