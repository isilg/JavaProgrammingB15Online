package day38;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class retainAll_Method {
    public static void main(String[] args) {
        /**
         * The retainAll() method of ArrayList is used to remove all the
         * array list’s elements that are not contained in the specified collection
         */

        // CREATE A nums1 ArrayList THEN CREATE A NUMS2 UNMODIFIED ARRAYLIST
        // AND AND SOME ITEMS THEN RETAIN
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        System.out.println("nums1= "+nums1);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        System.out.println("nums2= "+nums2);

        //nums2 da nums1 da olan item lari dondurur
        nums2.retainAll(nums1);
        System.out.println("nums2 after retainAll= "+nums2);

        //nums1 da nums2 da olan item lari dondurur
        nums1.retainAll(nums2);
        System.out.println("nums1 after retain= "+nums1);


    }
}
