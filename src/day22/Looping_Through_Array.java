package day22;
public class Looping_Through_Array {
    public static void main(String[] args) {

        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // GET THE SIZE OF THIS ARRAY OBJECT
        // ******* length is an attribute of an array so it is not written with parenthesis
        // if it is written w parenthesis it become a method ***********
        int itemCount = scores.length;   //Array=> .length   String=> .length()
        System.out.println(itemCount);      //4

        System.out.println();

        // GET THE LAST ITEM
        int lastItemIndex = itemCount-1;
        System.out.println(lastItemIndex); //3 cunku 4 element var sondan bir onceki 3.element

        System.out.println();

        for (int i = 0; i < itemCount; i++) {
            System.out.println( scores[i] );
        }
        System.out.println();

        // we are printing in reverse so we start with highest index till lowest index 0
        for (int i = lastItemIndex; i >=0 ; i--) {
            System.out.println( scores[i] );
        }

    }
}
