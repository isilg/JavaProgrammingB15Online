package day38;
import java.util.ArrayList;
import java.util.Arrays;
public class removeAll_Method {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1= "+nums1);

        // REMOVE 100 AND 133
        // JUST LIKE addAll method, removeAll method expect another collection/List Object to be removed
        nums1.removeAll(Arrays.asList(100,300));
        System.out.println("nums1 after removing 100 and 300= "+nums1);

        // IF YOU WANT TO REMOVE STH YOU DONT HAVE:
        // WE ALREADY REMOVED 100 AND 300 SO WE DONT HAVE THEM
        // IF WE TRY TO REMOVE THEM AGAIN ==>> NOTHING HAPPENS
        nums1.removeAll(Arrays.asList(100,300));
        System.out.println("nums1 after trying to remove item we dont have= " + nums1);


        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(123);
        nums2.add(100);
        nums2.add(100);
        nums2.add(223);
        nums2.add(133);
        nums2.add(125);
        nums2.add(122);
        nums2.removeAll(Arrays.asList(100,1000));

        // REMOVE 100 AND 1000
        // *********WE HAVE 2 100  WHICH ONE IT REMOVES ==>> removeAll
        // REMOVES ALL OF THEM!!!  **************
        System.out.println("nums2 after removing 100 an 1000= "+nums1);
        nums1.removeAll(Arrays.asList(100, 1000));
        System.out.println(nums2);

    }
}
