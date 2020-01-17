package day27;

import taskChannel.Array;

import java.util.Arrays;

public class Multi_Dimensional_Array_3 {
    public static void main(String[] args) {
        //String[][] names = {"Max"};  ERROR. 2 DIMENSIONAL
        //ARRAY HAS TO CONTAIN N-1 ARRAY.
        //SO IT MUST CONTAIN: 2-1=1 DIMENSIONAL ARRAY
        String[][] names = {{"Max", "Ghoya"}, {"Elly", "Vicky"}};

        //print Elly
        System.out.println(names[1][0]);

        //Change Vicky to Scarlet
        names[1][1] = "Scarlet";
        System.out.println(names[1][1]);

        //Return Elly and Scarlet
        System.out.println(Arrays.toString(names[1]));   // names1 return an array so
                                                         // I need to use Arrays.toString method to return it
        System.out.println( Arrays.deepToString(names) );

    }
}