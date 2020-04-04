package day56;
import java.util.Arrays;
import java.util.List;
public class Main_Store {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println("s1 = " + s1);

        //just return the name
        System.out.println(s1.name);

        //just return the arrayList
        System.out.println(s1.allProducts);

        //Add Product to your allProducts List
        s1.allProducts.add(new Product("IMac", 4999));
        System.out.println("allProducts List= " + s1.allProducts);



        //Create another Store object and 3 Products
        List<Product> starList = Arrays.asList(new Product("Coffee", 4),
                                               new Product("Latte", 2),
                                               new Product("Cookie",2));
        Store s2 = new Store("Starbucks", starList);
        System.out.println("\ns2 = " + s2);


        Product p1 = new Product("CheeseCake" , 10);
        s2.addProduct(p1);                                 //Calling addProduct(Product p) method
        System.out.println("\ns2 " + s2);

        s2.addProduct("Tea",3);  //Calling addProduct(String productName, int productPrice) method
        System.out.println("\ns2 = " + s2);


    }
}