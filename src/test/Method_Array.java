package test;

import java.util.Arrays;

public class Method_Array {
    /**
     * Create a method called printArrayItems
     * It has one int array as a parameter
     * print out each item in this format
     * arrays has items : -->> all the items here
     */

    public static void main(String[] args) {
        //this is passing the array object directly into the method
        printArrayItems( new int[]{1,6,5,3,12,3} );

        //this is assigning the array object into a variable
        //and then pass it into the method
        int[] scores = {2,5,8,23,4,5,6};
        printArrayItems(scores);
    }

    public static void printArrayItems(int[] nums){
        System.out.println("arrays has items : -->>" + Arrays.toString(nums));
    }

}
