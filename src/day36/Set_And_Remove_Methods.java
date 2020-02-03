package day36;
import java.util.ArrayList;
public class Set_And_Remove_Methods {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(12L);   // 12L is automatically converted to new Long(12L);
        list.add(100L);
        list.add(125L);
        list.add(150L);
        list.add(200L);

        // UPDATING VALUE AT CERTAIN INDEX: SET METHOD
        list.set(3,195L);
        System.out.println("New Value for list.get(3)= "+list.get(3));

        // REMOVING ITEM BY ITS VALUE
        list.remove(100L);
        System.out.println("List after removing 100 = "+ list);

        // REMOVING ITEM BY ITS INDEX
        // \n : new line    \t : new tab
        list.remove(2);
        System.out.println("List after removing item at index= \n"+list);

    }
}
