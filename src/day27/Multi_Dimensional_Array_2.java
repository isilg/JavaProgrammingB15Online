package day27;

import org.w3c.dom.ls.LSOutput;
import taskChannel.Array;

import java.util.Arrays;

public class Multi_Dimensional_Array_2 {

    /*
    * Multi Dimensional array: an Array that can contains arrays.
    * N dimensional(dimenşınıl) array contains N-1 dimensional arrays
    *int[] arr ={1,2,3}; -->> 1 Dimensional array. [] represents index of element
    * int[][] arr2D = { {1,2,3} , {4,5,6} };-->>2 Dimensional array.
    * First [] represents index of 1D arrays.
    * Second [] represents index num of elements
    * arr2D[0][2]  -> Returns 3.  O is firat array: {1,2,3}.
    * 2 is index 2 of the array. index 0: 1, index 1: 2, index 2: 3
    * */
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2D.length);

        //System.out.println( arr2D[0] );  ERROR
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[0][2]);
        //System.out.println(Arrays.toString(arr2D[0][2]));  ERROR
        System.out.println(Arrays.deepToString(arr2D));

    }
}

