package day28;
import java.util.Arrays;
public class ExcelVisualizer_2 {
    public static void main(String[] args) {

        int[][] myExcel = { {10,27} ,
                            {87,99,100},
                            {90,45} };

        //PRINT OUT EACH 1D ARRAY'S LENGTH BY USING LOOP
        for (int i=0; i<myExcel.length; i++){
            System.out.println("item "+(i+1)+"'s length is: "+ myExcel[i].length );
        }

        System.out.println("\t");
        //PRINT OUT EACH ITEM (2D ARRAY AS IT IS)
        System.out.print(Arrays.deepToString(myExcel));


        System.out.println("\t");

        //II.WAY
        for( int[] eachRow : myExcel){
            for ( int eachCell : eachRow){
                System.out.print(eachCell+ " ");
            }
        }
    }
}
