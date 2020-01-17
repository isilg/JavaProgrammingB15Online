package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        //PRINT OUT EACH ELEMENTS(ITEMS)
        System.out.println( scores[0] );
        System.out.println( scores[1] );
        System.out.println( scores[2] );
        System.out.println( scores[3] );

        //UPDATE THE SECOND VALUE
        scores[1] = 99;
        System.out.println( scores[1] );
        System.out.println();

        //ONCE ARRAY IS CREATED WITH CERTAIN SIZE, WE CANNOT CHANGE THE SIZE!!!
        //WHEN YOU CREATE NEW ARRAY OBJECT IT WILL GET DEFAULT VALUE IN EACH ELEMENT
        int[] numbers = new int[3];
        System.out.println( numbers[0] );  //WE HAVEN'T INITIALIZED THE VALUES, INTELLIJ ASSIGNED THEM TO 0 AUTOMATICALLY
        System.out.println( numbers[1] );
        System.out.println( numbers[2] );

//      FOR BOOLEAN ARRAY IT AUTOMATICALLY ASSIGN FALSE
//        boolean[] yesNo = new boolean[2];
//        System.out.println( yesNo[0] );   //OUTPUT: false
//        boolean[2] = 10>7;   //now we assigned 3.element to a value

        System.out.println();
        //Create a byte array with size 4 and store it into a variable called data
        //Assign value for each index location. Print out the values at each index
        //update last index value then print out again

        byte[] data = new byte[4];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        System.out.println( data[0] );
        System.out.println( data[1] );
        System.out.println( data[2] );
        System.out.println( data[3] );

        data[3] = 127;
        System.out.println( data[3] );


    }
}
