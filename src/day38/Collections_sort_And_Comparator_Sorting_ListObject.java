package day38;
import taskChannel.Array;
import java.util.*;
public class Collections_sort_And_Comparator_Sorting_ListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums ArrayList before sort= "+nums);

        //I. WAY: USE Collections.sort to sort an ArrayList
        Collections.sort(nums);
        System.out.println("nums after sort= " +nums);

        //USE Collections.sort(array_name , Comparator.reverseOrder());
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums after reverse sorting = "+nums);


        //II.WAY: .sort(Comparator.naturalOrder() ) or .sort(Comparator.reverseOrder() )
        nums.sort( Comparator.naturalOrder() );
        System.out.println("nums after using nums.sort(Comparator.naturalOrder())= "+nums);

        nums.sort( Comparator.reverseOrder() );
        System.out.println( "nums after using nums.sort(Comparator.reverseOrder())= "+nums );

    }
}
