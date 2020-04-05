package day56;
import java.util.Arrays;
import java.util.List;
public class Main_Store {
    public static void main(String[] args) {

      //WE DID THIS BEFORE MAKING List<Product> allProducts; PRIVATE
      //TO PREVENT UNAUTHORIZED ACCESS WE CHANGED THE FIELD TO PRIVATE OTHERWISE
      //SOMEONE MIGHT REACH AND REMOVE ALL THE ITEMS FROM LIST OR COULD MAKE ANY CHANGE
//        Store s1 = new Store();
//        System.out.println("s1 = " + s1);
//
//        //just return the name
//        System.out.println(s1.name);
//
//        //just return the arrayList
//        System.out.println(s1.allProducts);
//
//        //Add Product to your allProducts List
//        s1.allProducts.add(new Product("IMac", 4999));
//        System.out.println("allProducts List= " + s1.allProducts);




        //Create another Store object and 3 Products
        List<Product> starList = Arrays.asList(new Product("Coffee", 4),
                                               new Product("Latte", 2),
                                               new Product("Cookie",2),
                                               new Product("Sandwich",10),
                                               new Product("Nuts",7),
                                               new Product("Lemonade",6));
        Store s2 = new Store("Starbucks", starList);
        System.out.println("\ns2 = " + s2);


        //Calling addProduct(Product p) method
        Product p1 = new Product("CheeseCake" , 10);
        s2.addProduct(p1);        // s2.addProduct(new Product("CheeseCake" , 10));
        System.out.println("\ns2 " + s2);


        //Calling addProduct(String productName, int productPrice) method
        s2.addProduct("Tea",3);
        System.out.println("\ns2 = " + s2);


        System.out.println("\ns2.getProductCount() = " + s2.productCount());



        System.out.println("\n");
        s2.displayProducts();



        System.out.println("\nDo we have cheesecake for $10?: "+
                    s2.checkIfProductExist(p1));

        System.out.println("\nDo we have cookie for $2?: " +
                   s2.checkIfProductExist(new Product("Cookie",2)));



        System.out.println("\nWhere is the cheesecake in my list?: " + s2.indexOfProduct(p1));
        System.out.println("\nWhere is the cookie in my list?: " + s2.indexOfProduct( new Product("Cookie",2)));


       s2.removeProduct(p1);
       System.out.println("\nProduct list: " + s2);
       s2.removeProduct(p1);    //try to remove p1 again



        System.out.println(s2);


        s2.maxPriceProduct();


        System.out.println( s2.sumOfProducts() );


        System.out.println("Average price: "+s2.averagePrice());
        System.out.println("Products have price more than average: "
                                + s2.moreThanAveragePrice());

        System.out.println("Most expensive product is: "+s2.maxPriceProduct());



    }
}