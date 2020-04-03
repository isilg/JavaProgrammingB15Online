package day56;
/**
 * Create a class called Product with encapsulated fields name, price and create a constructor
 * override the .equals method coming from Object class(OBJECT CLASS IS SUPER CLASS OF ALL THE CLASSES IN JAVA, DON'T CREATE OBJECT CLASS. IT IS ALREADY EXIST) :
 * Two products should be equal if they have the same fields value.
 * Practice Association: important
 * Create a class called Store
 * It has List<Product> as instance variable
 * no arg constructor to initialize the list to empty ArrayList object
 * 1 Arg constructor to accept List<Product>
 * First line of constructor should call no arg constructor to reuse initialization logic.
 * Inside constructor AddAll Products user passed to the instance variable last.
 * Create an instance void method called addProduct(Product p)
 * Create an instance void method called removeProduct(Product p)
 * Create an instance void method called checkIfProductExist(Product p)
 * Hint : just call list remove method, it will internally call .equal method to decide which one to remove
 * more methods : find and return max price product, Find sum.of all products
 * Find list of products more than average
 */

public class Product extends Object{  //If I am gonna override .equals method from Object class I need to extend my Product class

    private String name;
    private int price;


    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){  // In Object class method signature of equals method is (Object obj). We have to have same signature
        Product otherProduct = (Product) obj;  //downcasting Object product to Product
        return this.name.equals(otherProduct.name) && this.price==otherProduct.price;    //Compare the name & price
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
