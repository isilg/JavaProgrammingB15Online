package day37;
import java.util.ArrayList;
import java.util.List;
public class Price_List_Update_ArrayList {
    public static void main(String[] args) {
        //ArrayList<String> teamMates = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);


        // CHANGE THE THIRD PRICE TO 10$
        priceList.set(2, 10.0);
        System.out.println(priceList);

        System.out.println("\t");
        // ADD 4$ TO FIRST PRICE
        priceList.set(0, priceList.get(0) + 4);
        System.out.println(priceList);

        System.out.println("\t");
        // CHANGE LAST PRICE TO SUM OF FIRST AND SECOND PRICE
        priceList.set(priceList.size() - 1, (priceList.get(0) + priceList.get(1)));
        System.out.println(priceList);

        System.out.println("\t");
        //GIVE 40% OFF TO SECOND PRICE
        //40% off -->> multiply it 0.6
        priceList.set(1, priceList.get(1) * 0.6);
        System.out.println(priceList);

        System.out.println("\t");
        System.out.println("Price list before doubling = " + priceList);
        //DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i, priceList.get(i) * 2);
        }
        System.out.println("Price list after doubling = " + priceList);


        System.out.println("\t");
        //CUT THE PRICE INTO HALF IF THE PRICE IS MORE THAN $20
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > 20) {
                priceList.set(i, priceList.get(i) / 2);
            }
        }
        System.out.println(priceList);


        System.out.println("\t");
        // SWAP THE FIRST VALUE WITH THE LAST VALUE
        // temp <= first   first <= last  last <= temp
        Double temp = priceList.get(0);
        // priceList.set(degisecek item indexi, atayacagin deger yada atayacagin item in indexi)
        priceList.set(0, priceList.get(priceList.size()-1) );
        priceList.set(priceList.size()-1, temp);
        System.out.println(priceList);

    }
}
