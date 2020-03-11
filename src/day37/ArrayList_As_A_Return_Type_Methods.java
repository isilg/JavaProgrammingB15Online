package day37;
import org.w3c.dom.ls.LSOutput;
import taskChannel.Array;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_As_A_Return_Type_Methods {
    public static void main(String[] args) {
        /**
         * Create a method that accept a finalNumber as int
         * return an ArrayList of Integer containing numbers
         * starting from 1 till finalNumber
         */

        System.out.println( finalNum(10) );
        List<Integer> myList = finalNum(5);
        System.out.println("myList = " + myList);
    }


   // public static  List<Integer>  finalNum(int finalNumber)
      public static ArrayList<Integer> finalNum( int finalNumber ) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= finalNumber; i++) {
            list.add(i);
        }
        return list;
    }

}