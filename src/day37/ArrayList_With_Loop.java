package day37;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_With_Loop {
    public static void main(String[] args) {

        /**
         * Create an ArrayList of Integer called nums and fill it up with 1-100
         */

        List<Integer> nums = new ArrayList<>();
        for (int i=1; i<=100; i++){
            nums.add(i);
        }
        System.out.print(nums);


        System.out.println("\t");
        // Change all the odd number value to 0;
        for (int i=0; i<nums.size(); i++) {
            if ( nums.get(i) % 2 != 0 ) {
                nums.set(i, 0);
            }
        }
        System.out.println(nums);



        System.out.println("\t");
        // FIND THE VALUE OF INDEX 20
        System.out.println("Value of index 20: " + nums.indexOf(20));


        System.out.println("\t");
        // INSERT 100 TO FIRST INDEX
        nums.add(0, 100);
        System.out.println(nums);


        System.out.println("\t");
        // INSERT 100 AFTER 34. ASSUME WE DONT KNOW WHERE IS 34
        List<Integer> list2 = new ArrayList<>();
        list2.add(44);
        list2.add(14);
        list2.add(34);
        list2.add(41);
        list2.add(19);

       int index34 =  list2.indexOf(34);
       list2.add(index34+1, 100);
        System.out.println("List after adding 100 after 34: " + list2);


        System.out.println("\t");
        // INSERT five 100 in front of 44
        for (int i=1; i<=5; i++){
            // list2.add( index where you wanna add the item, what item u wanna add)
            list2.add(list2.indexOf(44),100);
        }
        System.out.println("After adding five 100: "+list2);


    }
}
