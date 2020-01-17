package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {

        int[] myNums = new int[]{5,1,21,2,3};

        //JUST WANNA SEE WHAT IS INSIDE THE ARRAY
        System.out.println(Arrays.toString(myNums));


        int[] myNumbers = new int[]{5, 3, 21, 2, 1, 13, 8};
        //SWAPPING - there are 7 items. index 0,1,2,3,4,5,6
        //0<->6 first one is gonna swap with last one
        //1<->5
        //2<->4
        //middle always stay same, no need to do anything to it

        //                            0  1   2  3   4   5  6
        //int[] myNumbers = new int[]{5, 3, 21, 2, 1, 13, 8};

        int size = myNumbers.length;
        int lastIndex = size - 1;
        int middleIndex = size / 2; // 3

        // just to see whats inside , we are not doing anything with String
        System.out.println(Arrays.toString(myNumbers));

        // first and last
        System.out.println(myNumbers[0] + " --- " + myNumbers[lastIndex - 0]);
        // second and one before last
        System.out.println(myNumbers[1] + " --- " + myNumbers[lastIndex - 1]);
        // third and two before last
        System.out.println(myNumbers[2] + " --- " + myNumbers[lastIndex - 2]);

        System.out.println("------ loop here ---------");
        // loop this
        for (int x = 0; x < middleIndex; x++) {
            // first number to swap    second number to swamp
            System.out.println(myNumbers[x] + " --- " + myNumbers[lastIndex - x]);
            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[lastIndex - x];
            myNumbers[lastIndex - x] = temp;


        }
        System.out.println("After swap complete " + Arrays.toString(myNumbers));



    }
}
