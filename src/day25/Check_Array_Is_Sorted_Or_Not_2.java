package day25;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class Check_Array_Is_Sorted_Or_Not_2 {
    public static void main(String[] args) {

        //CHECK IF AN ARRAY SORTED OR NOT
        int[] nums = { 13,31,8,5,21,2 };
        System.out.println("nums= " + Arrays.toString(nums) ) ;

        //SAYILARI IKISERLI ALIP KARSILASTIRCAM
        //GERCEK HAYATTADA SAYI KUMESINI NASIL KARSILASTIRIRSIN
        //ILK IKISINE BAKARSIN 1. 2.'DEN KUCUKSE DEVAM, SONRA 2. ILE 3. KARSILASTIRILIR
        //2. 3.DEN KUSUKSE

        System.out.println();

        boolean isSortedAlready = true;
        for( int i=0; i<nums.length-1; i++ ){

            //System.out.println( nums[i]+ " "+nums[i+1] );
            //Pick first item and compare with second item
            //keep repeating until there is no more item
            System.out.println( "Is "+nums[i]+ " less than "+nums[i+1] + " ? "+ (nums[i] < nums[i+1]) );

            //HERHANGI BIR YERDE KARSILASTIGIN IKI YANYANA SAYI SORTED DEGILSE
            //GERISI SORTED OLSADA LIST SORTED OLMAZ O YUZDEN SORTED OLMAYAN IKI YANYANA OLAN SAYI
            //BULDUKTAN SONRA DEVM ETMEYE GEREK YOK
            if (!(nums[i] < nums[i+1])){
                //System.out.println("Array is not sorted, no point checking the rest");
                isSortedAlready = false;  //if nums[] < nums[i+1] array is not sorted so set isSortedAlready to false
                break;
            }

        }
    }
}
