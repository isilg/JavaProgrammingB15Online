package day38;
import taskChannel.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList_Short_Way {
    public static void main(String[] args) {
        /**
         *  Create a list of 6 double in short way
         *  We'll just read them and wil not add or remove any item
         */
        List<Double > prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 65.67);
        System.out.println(prices);

        // How many item we have that more than $5.
        int i = 0;
            for( Double each: prices){
                if (each > 5){
                    i++;
                }
        }
        System.out.println("There are "+i+ " item more than $5.");

        // I want to add 2 more pieces (different items than in the list)
        // CAN I ADD THE LIST?  NO!  WHY??  CAUSE I CREATED AN UNMODIFIED LIST
        // BY USING Arrays.asList
        // SO I AM COPYING THE LIST AND ADDING NEW ITEMS INSIDE THE NEW LIST
        ArrayList<Double> newprices = new ArrayList<>(prices);
        newprices.add(0.99);
        newprices.add(199.99);
        System.out.println("My new list is: "+newprices);


        // ADD 1 MORE 0.99 THEN REMOVE IT. THERE WILL BE 2  0.99
        // WHICH ONE JAVA WILL REMOVE  =>> old one will be removed not the newly added one
        newprices.add(0.99);
        newprices.remove(0.99);
        System.out.println(newprices);


        // CREATE AN ARRAYLIST OBJECT IN ONE SHOT WITH MANY ITEMS
        // SO WE CAN ADD OR REMOVER

        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));
        System.out.println("One shot price list: "+oneShotPrice);

        // ADD 100.99 AFTER 9.99
        oneShotPrice.add(1, 100.99);
        System.out.println("After adding 100.99 after 9.99: "+ oneShotPrice);

        //REMOVE ITEM 3
        oneShotPrice.remove(2);
        System.out.println("After removing item 3 which is index 2: "+oneShotPrice);
    }

}
