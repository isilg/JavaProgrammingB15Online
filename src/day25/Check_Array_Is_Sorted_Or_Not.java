package day25;
import java.awt.font.FontRenderContext;
import java.util.Arrays;
public class Check_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {

        //TASK : CHECK IF THE ARRAY IS SORTED OR NOT

        //LOGIC:
        //FIRST, COPY THE ORIGINAL ARRAY
        //IF YOU SORT OR DO ANYTHING ORIGINAL ARRAY WILL GONE
        //SO BEFORE DOING ANYTHING WE ARE COPYING IT
        //FIRST WAY: MANUALLY, SECOND WAY: USING A LOOP
        //AFTER COPYING THE ORIGINAL ARRAY SORT IT OUT AND
        //COMPARE IF THE ORIGINAL ARRAY IS EQUAL TO SORTED ARRAY
        //IF YES THEN THE ORIGINAL ARRAY IS SORTED ALREADY_NOT_2 CODE UNA BAK

        int[] nums = {13,31,8,5,21,2};

        int numsItemCouunt = nums.length;

        //CREATING AN ARRAY WITH SAME SIZE AS ORIGINAL ARRAY
        int[] numsCopy = new int[nums.length];

//        numsCopy[0] = nums[0];
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        for (int x=0; x<nums.length; x++){
            numsCopy[x] = nums[x];
        }

        System.out.println("Before sort nums= "+ Arrays.toString(nums));
        System.out.println("Before sort numsCopy= "+ Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy= "+ Arrays.toString(numsCopy));


        if (Arrays.equals(nums, numsCopy)) {
            System.out.println("This array is already sorted");
        }else
            System.out.println("This array is not sorted");

    }
}
