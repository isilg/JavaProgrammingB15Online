package day29;
import taskChannel.Array;
import java.util.Arrays;
public class FillingUpArrayValue {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        // IF I PRINT THIS ARRAY BY USING ARRAYS.TOSTRING()
        // BEFORE ASSIGNING ANY VALUE, IT WILL PRINT OUT 100 0s
        System.out.print("Before filling up \n"+ Arrays.toString(numbers));
        //                                  \n will move it to next line

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        .........
//        numbers[99] = 100;
        for (int x=0; x<numbers.length; x++){
            numbers[x]= x+1;
        }
        System.out.println( "\n After filling up \n" + Arrays.toString(numbers) );
    }
}
