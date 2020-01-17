package day24;

import taskChannel.Array;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22,45,6,37,3,6,9};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {6,5,6,7,3,2,34};     //it has same numbers as 3 but different order

        //Check score1 array and score 2 arrays are same content, means are they equal or not
        System.out.println(Arrays.equals(scores1, scores2));

        System.out.println();

        //boolean isS1S3Equals diye bir degiskene kullanarakta sonucu bulabiliriz
        boolean isS1S3Equals =  Arrays.equals(scores1, scores3);
        System.out.println("Is score 1 array has same content as score 3 array? = " +isS1S3Equals);

        //Are s3 and s4 equals? Same elements but different order
        System.out.println( "Is score 3 array has same content as score 4 array? = " +Arrays.equals(scores3,scores4) );

        //If we sort score 3 and score 4 then will they be equal?
        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println( "Is score 3 array has same content as score 4 array after using sort method? = " +Arrays.equals(scores3,scores4) );


    }
}
