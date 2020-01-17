package day27;

public class Find_Max_And_Min_Number_Of_A_2D_Array {
    public static void main(String[] args) {

        //FIND THE MAX ELEMENT
        int[][] nums = { {12,11,10,19}, {19,20,15} };

        int max =nums [0][0];  // assume that first element is the max

        for (int i = 0; i<nums.length; i++){
            for (int j=0; j< nums[i].length; j++){
                if(max < nums[i][j]){
                    max = nums[i][j];
                }
            }
        }
        System.out.println(max);

        System.out.println("\n");

        int min = nums[0][0];
        for (int i = 0; i<nums.length; i++){
            for (int j=0; j< nums[i].length; j++){
                if(min > nums[i][j]){
                    min = nums[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
