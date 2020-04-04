package day56;
import java.util.ArrayList;
import java.util.List;

public class List_Review {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(11);
        nums.add(11);
        nums.add(20);
        System.out.println("nums = " + nums);

        //Check if nums have 10?
        System.out.println("nums.contains(10) = " + nums.contains(10));

        //Check if nums have 70?
        System.out.println("nums.contains(70) = " + nums.contains(70));


    }

}
