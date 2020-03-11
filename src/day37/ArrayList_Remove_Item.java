package day37;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_Remove_Item {
    public static void main(String[] args) {
        // Remove the items on the 2nd and 3rd indexes
        // Then remove the value 2 not index!!
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(14);
        list.add(34);
        list.add(41);
        list.add(19);
        System.out.println("Original list= "+ list);

        list.remove(1);
        System.out.println("After removing the item from index 1: "+ list );

        // **** After removing index 1, artik original list is after
        // removing index1 so when u remove index 2, bastaki listeyi
        // degil take the list after index 1 removed instead ******
        list.remove(2);
        System.out.println("After removing the item from index 2: "+ list );

        list.remove( Integer.valueOf(2));
        System.out.println("After removing value 2 "+list);

    }
}
