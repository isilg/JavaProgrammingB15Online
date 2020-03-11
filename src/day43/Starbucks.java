package day43;
public class Starbucks {
    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        c1.setType("Turkish");
        c1.setCaffeineLevel(8);
        c1.setPrice(-4.99);
        System.out.println("c1= "+c1);

        Coffee c2 = new Coffee("Intensito",9);
        System.out.println("c2= "+c2);

  // We can set the price in 2 places: 1-In Constructor 2-In setPrice() method
  // so we need tp protect our data in both of them by using if we prevented to set the price less than 0
        Coffee c3 = new Coffee("Blonde",5,1.6);
        System.out.println("c3 before= "+c3);
        c3.setPrice(-100);
        System.out.println("c3 after= "+c3);

        Coffee c4 = new Coffee("Latte", 3, -2.6);
        System.out.println("c4= "+c4);


        // Get sum of the 4 coffee you created
        // Step 1- type belirle => price lar double old icin toplamlari da double
        // Step 2- variable ismi belirle => sumOfAllCoffee olsun
        // Step 3-  = sign
        // Step 4- get the prices and sum - Which method gives the prices? => getPrice()
                                          // 1th coffee's price: c1.getPrice()
                                          // 2nd   "       "   : c2.getPrice()
                                          // 3rd   "       "   : c3.getPrice()
                                          // 4th   "       "   : c4.getPrice()
        // Step 5- getPrice() doesn't show anything on the screeen so you need to use System.out.println()
        // GETPRICE() CANNOT BE USED BY ITSELF. WHY YOU CREATED THE C1,C2,C3, AND C4 OBJECTS
        // TO CALL THE METHODS!!!!  SO USE THEM TO CALL THE METHODS.
        double sumOfAllCoffee = c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println("Sum of all coffee: " + sumOfAllCoffee);

    }
}
