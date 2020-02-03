package day36;
import taskChannel.Array;
import java.util.ArrayList;
import java.util.List;
public class Array_List_Intro {
    public static void main(String[] args) {

        // How do we create an ArrayList Object
        ArrayList<String> list1 = new ArrayList<String>();  //new ArrayList<String>();  esitlikten sonrasi seklindede yazilabilir

        //BELOW GIVES ERROR. ARRAYLIST ONLY STORE OBJECTS NOT PRIMITIVE
        //ArrayList<int> list2 = new ArrayList<>();

        ArrayList<Integer> list2 =  new ArrayList<>();     // new ArrayList<Integer>();

        ArrayList<Long> list3 =new ArrayList<>();

        ArrayList<Double> list4 =  new ArrayList<>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY
        // List is a more general data type compared to ArrayList is more concrete type
        // ArrayList is one type of List
        List<String> myList = new ArrayList<>();

    }
}
