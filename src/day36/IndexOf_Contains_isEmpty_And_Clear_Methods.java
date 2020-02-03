package day36;
import java.util.ArrayList;
public class IndexOf_Contains_isEmpty_And_Clear_Methods {
    public static void main(String[] args) {

        ArrayList<Long> list = new ArrayList<>();
        list.add(12L);   // 12L is automatically converted to new Long(12L);
        list.add(100L);
        list.add(125L);
        list.add(150L);
        list.add(200L);
        // list.add(null);   // practically you don't add null item but it is possible.
                            // you can add null element into a list

        // Looking for location of certain item
        System.out.println("Location of 100L by using list.indexOf() = "
                            + list.indexOf(100L));

        // IF WE DONT HAVE THAT ITEM , IT RETURN -1
        System.out.println("Location of 23L by using list.indexOf() = "
                + list.indexOf(23L));

        System.out.println("Do I have 10L = "+ (list.indexOf(10L)!=-1) );

        System.out.println("Do I have 10L = "+ list.contains(10L) );

        // CHECK WHETHER A LIST IS EMPTY OR NOT
        System.out.println("is list empty = "+list.isEmpty());

        // DELETE EVERYTHING INSIDE THE ARRAYLIST
        // TYPE ARRAY NAME AND TYPE . ->>IT WILL GIVE BUNCH OF METHODS
        // NO NEED TO MEMORIZE EVERYTHING
        list.clear();
        System.out.println("Is ArrayList empty? = "+ list.isEmpty());
    }
}
