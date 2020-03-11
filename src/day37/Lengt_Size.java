package day37;
import day03.StringDataType;
import java.util.ArrayList;
import java.util.List;
public class Lengt_Size {
    public static void main(String[] args) {

        /**
         * length   :   counting  the  elements  inside  array, it's a property of array object
         * length() :    "         "   characters  "    String, it's a method of String object
         * size()   :    "         "   elements    "    ArrayList object
         *
         * Last item of an array called arr      :   arr[arr.length-1]
         * Last item of an ArrayList called list :   list.get( list.size()-1 )
         * Last char of a String called str      :   str.charAt( str.length()-1 )
         */
        String str = "isil";
        System.out.println( str.charAt(str.length()-1) );

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println( list.get(list.size()-1) );

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println( arr[arr.length-1] );

     }
   }

