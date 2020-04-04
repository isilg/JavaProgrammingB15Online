package day56;
/**
 * Create a class called Store
 * It has String name and List<Product> as instance variable
 * no arg constructor to initialize the list to empty ArrayList object
 * 2 Arg constructor to accept name and List<Product>
 * First line of constructor should call no arg constructor to reuse initialization logic.
 * Inside constructor AddAll Products user passed to the instance variable last.
 * Create an instance void method called addProduct(Product p)
 *  * Create an instance void method called removeProduct(Product p)
 *  * Create an instance void method called checkIfProductExist(Product p)
 *  * Hint : just call list remove method, it will internally call .equal method to decide which one to remove
 *  * more methods : find and return max price product, Find sum.of all products
 *  * Find list of products more than average
 */
import java.util.ArrayList;
import java.util.List;
public class Store {
    String name;
    List<Product> allProducts;


    public Store(){  // no-arg constructor
        this.name = "Cybertek Store";          //initializing the name to Cybertek Store
        this.allProducts = new ArrayList<>();  //Creating an empty list we can add items later on.
                                               //Store object create edip ekrana dondurursek name icin "Cybertek Store",
                                               //allProducts icin [] dondurur eleman eklemeden once, ama bu satiri yazmazsak null dondurur
    }

    public Store(String name, List<Product> otherList){   //2 arg constructor
        this();  //Calling no-arg const. List is already initialized in no-arg const (this.allProducts = new ArrayList<>();) so since we are calling it, we dont need to initialize again
        this.name = name;
        allProducts.addAll(otherList);   //adding all the products to the existing arrayList we have (we get all the products at the Main like starbucks object)
    }



    public void addProduct(Product p){
        allProducts.add(p);     //allProduct list will never be null, if we wont add Product
                                // it will just return [], but it doesn't return null cause
                               //inside no-arg const we did this.allProducts = new ArrayList<>();
    }

    //Instead of using new keywrd all the time we can overload addProduct and give 2 arg, name and price
    //What is important to overload a method? -> Method signature (Method name and parameter list)
    //If u have same name and different param list u will be overloading the method right
    public void addProduct(String productName, int productPrice){
        Product newP = new Product(productName, productPrice);
        allProducts.add(newP);
    }


    public void removeProduct(Product p){

    }

    public void checkIfProductExist(Product p){

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", \nallProducts=" + allProducts +
                '}';
    }
}
