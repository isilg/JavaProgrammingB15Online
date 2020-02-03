package day36;
import java.util.ArrayList;
public class Size_And_Get_Methods {
    public static void main(String[] args) {

        // CREATE AN ARRAYLIST OBJECT OF LONG AND ASSIGN IT TO VARIABLE

        ArrayList<Long> list = new ArrayList<>();
        list.add(12L);   // 12L is automatically converted to new Long(12L);
        list.add(100L);
        list.add(150L);
        list.add(200L);

        System.out.println("list = " + list);

        // COUNTING ITEMS INSIDE ARRAYLIST
        System.out.println("Counting items using lst.size() = "+list.size());

        // GETTING ITEMS INSIDE ARRAYLIST OBJECT
        System.out.println("First item is: list.get(0) = "+ list.get(0));

        // GET THE SUM OF ABOVE LIST ITEMS.
        // SINCE ARRAY ELEMENTS ARE OBJECT HOW CAN WE ADD THEM? -->> AUTO UNBOXING. JAVA HANDLE IT FOR US
        int x=0;
        for (int i=0; i<list.size(); i++){
            x+=list.get(i);
        }
        System.out.println("sum = " + x);


        // GET THE MAX ITEM

        long max = list.get(0);
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max item is: " + max);


        //INSERT 125 BETWEEN 100L AND 150L, -BETWEEN 2ND AND 3RD ITEM

        list.add(2,125L);
        System.out.println("list= "+ list);

        // BRING THE 4TH ELEMENT
        // 4TH ELEMENT IS INDEX:3

        System.out.println(list.get(3));
    }
}
