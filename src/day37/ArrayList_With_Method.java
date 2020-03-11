package day37;
import taskChannel.Array;
import java.util.ArrayList;
public class ArrayList_With_Method {
    public static void main(String[] args) {
    /**
    * Create a method that accepts a list of String as argument(what u pass to ur method)
    * and print out each and every item in the list vertically
    */

    // List<String > namelist = new ArrayList<>();  ERROR. LIST IS A MUCH BIGGER DATA TYPE THAN ARRAYLIST.
    // ASAGIDAKI INT-BYTE ORNEGINDEKI GIBI HATA VERIR. INT IS BIGGER THAN BYTE
    ArrayList<String > namelist = new ArrayList<>();
    namelist.add("Dior");
    namelist.add("Mac");
    namelist.add("Coco Chanel");
    namelist.add("YSL");
    printAList(namelist);

    System.out.println("\t");
    byte myByte = 17;
    printByte(myByte) ;

    //EXTRA INFO:
    //int myInt = 100;
    //printByte(myInt);    // ERROR.  DO CASTING: printByte( (byte)myInt);

    System.out.println("\t");
    System.out.println("Longest Element= " +getLongestElement(namelist) );

    }



    public static String getLongestElement( ArrayList<String> list) {
        String longestname = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (longestname.length() <= list.get(i).length()) {
                longestname = list.get(i);
            }
        }
        return(longestname);
    }

    /**
     * A simple method to print a byte value passed
     * @param b
     */
    public static void printByte(byte b){
        System.out.println("You passed byte value= "+b);
    }

    /**
     * This method will print out the content of passed List object
     * @param list of String
     * @return nothing
     */
    public static void printAList(ArrayList<String> list){
        for (String each : list)
        System.out.println("each item = " +each);
    }
}
