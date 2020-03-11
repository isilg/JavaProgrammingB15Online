package day41;

public class ProductDemo {
    public static void main(String[] args) {


        Product p1 = new Product();
        p1.setName("iPhone");
        p1.setPrice(699);

        System.out.println("p1 name= "+p1.getName());

        // Store the price(price i  bir degiskene ata)
        double myPrice = p1.getPrice();

        // Degiskenin adini yaz, nokta koy, sout and Enter yada soutv Enter
        System.out.println(myPrice);




    }

}