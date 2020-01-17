package day27;

import java.sql.SQLOutput;

public class Print_Out_Each_Element_Of_A_2D_Array {
    public static void main(String[] args) {
        int[][] nums = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13} };
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
        }

        System.out.println("\n");

        //II.WAY USING FOR EACH LOOP

        for( int[] each1Darray :  nums){
            for( int eachElement: each1Darray){
                System.out.print(eachElement+" ");
            }

        }
    }
}
