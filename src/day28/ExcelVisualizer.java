package day28;

import java.util.Arrays;
public class ExcelVisualizer {
    public static void main(String[] args) {

        int[] row1 = new int[]{78,54,100,84};
        int[] row2 = new int[]{33,44,77,123};
        int[] row3 = new int[]{12, 88,52,76};
        int[] row4 = new int[]{67, 33,98,67};
        int[] row5 = new int[]{12, 88,52,45};
        int[] row6 = new int[]{67, 3, 98,34};

        //to store these in another array object
        int[][] sheet = new int[][]{ row1, row2, row3, row4, row5, row6};
        int[][] myExcel = { {10,27} ,{87,99,100}, {90,45} };

        //PRINT 100 AND 90
        System.out.println(myExcel[1][2]);
        System.out.println(myExcel[2][0]);


        //Print array's length = print how many item 2d array has
        System.out.println(myExcel.length);

        //how many item do I have in the first item of myExcel array
        //its length gives how many item it has inside
        System.out.println(myExcel[0].length);

        System.out.println("\t");

        //ADD FIRST AND SECOND ELEMENT OF THE FIRST ARRAY
        System.out.println(myExcel[0][0]+myExcel[0][1]);


    }
}
