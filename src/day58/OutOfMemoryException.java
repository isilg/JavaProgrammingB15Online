package day58;
import java.util.*;
import java.util.List;
public class OutOfMemoryException {

    //If u r keep creating objects or if you have one very large object
    //(u r writing a code and java is automatically opening excel file
    //that has maybe thousands of row) u get OutOfMemory exception
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i=1; i>0; i++) {   //Infinite loop because condition never false
            //System.out.println(i);
            nums.add(i);
        }
    }
}
