package day36;
import taskChannel.Array;
import java.util.Arrays;
public class Method_Practice_2 {
    public static void main(String[] args) {

        long[] myLongs = {6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swamp myLongs = " + Arrays.toString(myLongs));

        swapFirstAndLastValue(myLongs);
        System.out.println("After swamp myLongs = " + Arrays.toString(myLongs));

        // long Ve Long farki:
        long[] myNums1 = new long[5];
        System.out.println("myNums= "+Arrays.toString(myNums1));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));

        String[] names = new String[5];
        System.out.println( "names= "+Arrays.toString(names) );


        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        // WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES )
        // CAN ASSIGNED TO NULL VALUE
        // TO DEFINE , IT'S NOT POINTING TO ANY OBJECT YET

        // A String in Java is actually a non-primitive data type,
        // because it refers to an object. The String object has methods
        // that is used to perform certain operations on strings.
        String str = "abc" ;
        String str2 = null ;
        System.out.println(str);
        System.out.println(str2);

        int x = 0;
        //int x = null;  ERROR. PRIMITIVE TYPE VALUE CANNOT ASSIGN TO NULL
        Integer x1 = null;
        System.out.println(x);
        System.out.println(x1);

    }

    /**
     *  // TASK: SWAP FIRST AND LAST ITEM OF long ARRAY
     * @param nums long array
     */

    public static void swapFirstAndLastValue(long[] nums){
        // just like swapping the tea in tea cup with coffee in coffee cup
        // you need a temporary cup to hold tea so you can put your coffee in
        // and put your tea back into coffee cup
        // FIRST ITEM: nums[0]  ,  LAST ITEM: nums[nums.length-1]

        long temp = nums[0];              // putting tea in the teacup to temp cup
        nums[0] = nums[nums.length-1];    // putting coffee into tea cup
        nums[nums.length-1] = temp;      // putting tea(in temp cup) into coffee cup

    }
}
