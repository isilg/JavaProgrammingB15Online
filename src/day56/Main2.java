package day56;
import javax.lang.model.util.Types;
import java.util.ArrayList;
import java.util.List;
public class Main2 {
    public static void main(String[] args) {

  //HOW CONTAINS AND REMOVE METHODS WORK?--> BY CALLING EQUALS METHOD INTERNALLY. IT CHECKS IF THAT OBJECT IS IN THE LIST OR NOT THEN DOES THE PROCESS

        List<Product> productList =  new ArrayList<>();
        productList.add(new Product("Macbook",2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL",1299));
        productList.add(new Product("Samsung 10", 1188));
        productList.add(new Product("Samsung Note", 1288));

        System.out.println("productList.size() = " + productList.size());


        //Check whether we have $499 Sony TV
      //I.WAY -> How do I check sth inside a List ->using contain method
          boolean result = productList.contains(new Product("Sony TV", 499));
          System.out.println("Does productList has $499 Sony TV: "+ result);

          Product appleTV = new Product("Apple TV", 299);//boolean result2 = productList.contains(new Product("Apple TV", 499));
          boolean result2 = productList.contains(appleTV);
          System.out.println("Does productList has $299 Apple TV: " + result2);


     //II.Way
//        boolean result = false;
//        for (Product each : productList){
//            if (each.equals(new Product("Sony TV", 499))){
//                result = true;
//            }

       //III.WAY
//           if (each.getName().equals("Sony TV")&&each.getPrice()==499){    //!!!!!!  .equals ->name   == ->price
//               result = true;
//           }



        //Remove Sony from productList and then check if the list still includes or not
        productList.remove(new Product("Sony TV", 499));
        System.out.println("Product list contains Sony TV?: "+ productList.contains(new Product("Sony TV", 499)));

        //If it is complicated another way:
        Product sony = new Product("Sony TV", 499);
        System.out.println("Product list contains Sony TV?: " + productList.contains(sony));

        }

    }
