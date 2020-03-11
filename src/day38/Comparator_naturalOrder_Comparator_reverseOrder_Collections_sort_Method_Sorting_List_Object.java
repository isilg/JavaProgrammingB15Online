package day38;
import jdk.swing.interop.SwingInterOpUtils;
import javax.swing.border.Border;
import java.util.*;
public class Comparator_naturalOrder_Comparator_reverseOrder_Collections_sort_Method_Sorting_List_Object {
    public static void main(String[] args) {
        /**
         * List itself also has sort method that accept one Comparator Object
         * simple way to get Comparator objects are
         * Comparator.naturalOrder() -->> low to high order
         * Comparator.reverseOrder() -->> high to low order
         */
        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums before sort = " +nums);

  //I.WAY- ASCENDING
        Collections.sort(nums);
        System.out.println("nums after sort = "+ nums);

 //II.WAY- DESCENDING    (LIST TO BE SORTED, COMPARATOR OBJECT BY CALLING)
        Collections.sort(nums, Comparator.reverseOrder() );
        System.out.println("nums after sort= "+nums);

        nums.sort(Comparator.naturalOrder() );
        System.out.println("nums after using = nums.sort(Comparator.naturalOrder() )+\n"+nums);

        nums.sort(Comparator.reverseOrder() );
        System.out.println("nums after using = nums.sort(Comparator.reverseOrder() )+\n"+nums);

    }
}
