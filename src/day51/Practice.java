package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        // Create 1 String and 1 int type ArrayList

        List<String> list1 = new ArrayList<>();
        list1.add("Abc");

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(10);
        list2.add(11);
        list2.add(8);
        list2.remove(2);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);
    }
}
