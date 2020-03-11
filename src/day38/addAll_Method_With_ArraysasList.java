package day38;
import java.util.ArrayList;
import java.util.Arrays;
public class addAll_Method_With_ArraysasList {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 =  new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

      // ADD ALL NUMS2 ITEMS INTO NUMS1
        nums1.addAll(nums2);
        System.out.println("nums1 list: "+nums1);
        System.out.println("nums2 list: "+nums2);

     // I WANT TO ADD 4 MORE ITEM TO NUM2 BY USING addAll

       nums2.addAll(Arrays.asList(100, 200, 300, 400) );
       System.out.println(nums2);



    }
}
