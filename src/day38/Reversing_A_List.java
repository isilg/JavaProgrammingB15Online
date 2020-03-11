package day38;
import java.util.*;
public class Reversing_A_List {
    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>( Arrays.asList(200, 100, 700, 400, 500) );

        System.out.println("nums1 before reversing= "+nums1);

        //reverse-->> SONDAN BASLAYIP BASA DOGRU GIDER
        Collections.reverse(nums1);
        System.out.println("nums1 after reversing= "+nums1);

        Collections.sort(nums1, Collections.reverseOrder() );
        System.out.println("nums1 after sorting reverse order = "+nums1);
        
    }
}
