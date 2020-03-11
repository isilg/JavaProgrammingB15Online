package day39;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList_Practice {
    public static void main(String[] args) {
        /**
         * TASK CHANNEL EXERCISE:
         * Create an ArrayList of String to store 12 elements.
         * Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         * Task 1 : print only items name
         * Task 2 : print all the prices more than 500
         * Task 3 : print average price
         * Task 4 : print all the items name that has less than 20$ monthly payment.
         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
         * Task 6 : Print all information about most expensive items.
         * Task 7 : Update Dyson price to 80% off. Assume there is only one Dyson (Monthly payment should also be calculated accordingly)
         * Task 8 : Count the items prices more than average price.
         * OPTIONALLY :
         * Task 9 : Remove all the items has more than average price.
         * Task 10 : Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)  :
         */


        ArrayList<String> productList = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

        //CHECK THE SIZE
        System.out.println(productList.size());
        //SEE EACH ELEMENTS
        System.out.println("productLst = " + productList);

        // TASK 1:
        // HER BIR ITEMI TEK TEK DUSUN, SPLIT YAPARSAK 3 ITEM OLACAK ELIMIZDE
        // ILK ITEM LAR NAME LER YANI [0]. ASAGIDAKI KUCUK ORNEGE BAK
        // COMMA DAN SPLIT YAP ILK ITEM'I GETIR, SONRA SPLIT YAP COMMA DAN VE 2. ITEM I GETIR,
        // SONRA COMMA DAN SPLIT YAP VE 3. ITEM I GETIR

//        String itemDetails = "iPhone 6s, 449, 18.71";
//        System.out.println(itemDetails.split(",") [0]);   // IT IS A STRING
//        System.out.println(itemDetails.split(",") [1]);   // IT IS A STRING AMA PRICE'I DOUBLE ISTERSEN ASAGIDAKI GIBI PARSING YAP
//        System.out.println( Double.parseDouble(itemDetails.split(",") [1]) );
//        System.out.println(itemDetails.split(",") [2]);   // BU OUTCOME DA BIR STRING


        System.out.println("\n");
        System.out.println("TASK 1: ");
        for (int i = 0; i < productList.size(); i++) {
            // AFTER GETTING EACH ITEM BY USING get(i) WE SPLIT EACH OF THEM INTO 3 PIECES FROM COMMA
            // AND GET FIRST PART OF THREE, NAME, -->> [0]
            System.out.print(productList.get(i).split(",")[0] + ", ");
        }
        //II.WAY - FOR EACH LOOP
//        for (String eachProduct : productList){
//            String names = eachProduct.split(",")[0];
//            System.out.println("eachProduct name= " + names);
//        }


        System.out.println("\n");
        System.out.println("TASK 2: ");
        for (String eachProduct : productList) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.print("price = " + price + ", ");
            }
        }

        //II.WAY
//        System.out.println("\n");
//        for (int i=0; i<productList.size(); i++){
//            Double price = Double.parseDouble( productList.get(i).split(",")[1] );
//            if (price > 500){
//                System.out.print(productList.get(i).split(",")[0] + ",");
//            }
//        }



        System.out.println("\n");
        System.out.println("TASK 3: ");
        double sum = 0.0;

        for (String eachProduct : productList) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }
        double average = sum/ productList.size();
        System.out.println("average= " + average);  //sum/12

        //II.WAY
//      Double sum= 0.0;
//      for (int i=0; i<productList.size(); i++){
//          sum += Double.parseDouble( productList.get(i).split(",")[1] );
//      }
//      System.out.println(sum/12); //if u know how many item u have, divide the sum to that number otherwise use: name of ArrayList.size()


        System.out.println("\n");
        System.out.println("TASK 4: ");

        // STEP 1: PRODUCTLIST IN ICINDEKI HERBIR ITEMI AL VE SPLIT TEN AYIRIP SON ELEMANI AL CUNKU SON ELEMAN MONTHLY PAYMENT I VERIYOR
        // STEP 2: SPLIT KULLANDIGIN AN STRING SONUC ELDE EDERSIN FAKAT STRING < 20 DIYE KARSILASTIRILAMAYACAGINDAN CASTING YAPARAK DOUBLE A CEVIR SONUCU
        // IF ILE HERBIR MONTHLY PAYMENT IN 20 DEN KUCUK OLUP OLMADIGINA BAK VE KUCUK OLANLARI DONDUR
        for (String eachProduct : productList) {
           Double monthly = Double.parseDouble(eachProduct.split(",")[2]);
           if (monthly < 20) {
               System.out.print(monthly + ", ");
                }
            }

        System.out.println("\n");
        System.out.println("TASK 5: ");
        // EQUAL METHOD SADECE IPHONE OLANI AL DEMEK O YUZDEN ONU KULLANMA
        // CONTAIN KULLANIRSAN ADININ ICINDE IPHONE GECMESI YETER, MODELI ONEMLI DEGIL
        // EGER ADININ ICINDE IPHONE VARSA O ITEM IN [2] YANI MONTHLY PAYMENT INI DONDUR
        for(String eachItem : productList) {
            String name = eachItem.split(",")[0];
            if ( name.contains("iphone") ){
                System.out.println(eachItem.split(",")[2] + ", ");
            }
        }

        System.out.println("\n");
        System.out.println("TASK 6: ");
        // ASSUME FIRST ITEM IS MOST EXPENSIVE. SPLIT IT FROM COMMA AND GET THE SECOND PART
        // IF WE KNOW INDEX WE CAN GET EVERYTHING ABOUT THAT ITEM.
        // productList.get(0);  ==>> EVERTHING ABOUT THE FIRST ITEM
        // productList.get(1); ==>> EVERTHING ABOUT THE SECOND ITEM
        // IF WE ASSUME FIRST ITEM IS THE MOST EXPENSIVE SO WE GET THE INDEX AS 0 AS THE
        // MOST EXPENSIVE ITEM SINCE FISRT ITEM'S INDEX IS 0
        Double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        for (int i=0; i<productList.size(); i++){
            Double eachPrice = Double.parseDouble( productList.get(i).split(",")[1] );
            if (eachPrice > maxPrice){
               maxPrice = eachPrice;
               maxPriceIndex = i ;
            }
         }
         System.out.println( productList.get(maxPriceIndex) );



        //II.WAY ==>> for each loop
//        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
//        String maxPriceItem = "";
//
//        for (String eachProduct : productList) {
//
//            double price = Double.parseDouble(eachProduct.split(",")[1]);
//            if (price > maxPrice) {
//                maxPrice = price;
//                maxPriceItem = eachProduct;
//            }
//
//        }
//        System.out.println("maxPriceItem = " + maxPriceItem+", maxPriceItem is at index :  " + productList.indexOf(maxPriceItem));


        System.out.println("\n");
        System.out.println("TASK 7: ");
        //EGER ONCE DYSON I DONDURUP BILGILERINI GORMEK ISTERSEN:
//        for(int i=0; i<productList.size(); i++) {
//            if (productList.get(i).startsWith("Dyson")) {
//                System.out.println(productList.get(i));
//            }
//        }

        // BILGILERI GORMENE GEREK YOKSA YUKARDAKI CODE U SKIP VE ASAGIDAKI CODE U YAZ
        // ********* IF U SPLIT A STRING U GET A STRING ARRAY **********
        // String[] ==>> String.split();
        String itemDetails = "Dyson Vacuum, 399, 16.25";
        String[] itemSplitArr = itemDetails.split(",");
        String name    = itemSplitArr[0];
        double price   = Double.parseDouble( itemSplitArr[1] );
        double monthly = Double.parseDouble( itemSplitArr[2] );
        itemDetails = name+ ", "+price*0.2+", "+monthly*0.2;
        System.out.println(itemDetails);



        System.out.println("\n");
        System.out.println("TASK 8: ");
        // KAC ITEM IN FIYATI AVERAGE PRICE DAN BUYUK ONU BULUUYORUZ
        int i = 0;
        for (String eachitem : productList){
            double prices = Double.parseDouble(eachitem.split(",")[1]);
            // I FOUND THE AVERAGE ON QUESTION 3 ALREADY
            if(prices > average){
                i++;
            }
        }
        System.out.println("items have price that more than average: "+i);


        System.out.println("\n");
        System.out.println("TASK 9: ");
        // **************** IT IS NOT RECOMMENDED USING FOR EACH IF U R REMOVING OR ADDING AN ITEM ***********

        for (int x=0; x<productList.size(); x++){
            double eachPrice = Double.parseDouble(productList.get(x).split(",")[1]);
            if(eachPrice > average){
                // REMOVE BY INDEX
                productList.remove(x);
                --x;
                // AFTER REMOVING 1 ITEM, INDEX SHIFTS.
                // REMOVE ITEMS MORE THAN OR EQUAL TO 10  ==>>  1  10  5  13    ==>>
                // X=0: INDEX:0 -> 1 , INDEX:1 -> 10, INDEX:2 -> 5, INDEX:3 -> 13
                // ILK ITERATIONDA ILK ELEMANA BAKIYORUZ 10 DAN BUYUKMU, DEGIL , LISTE OLDUGU GIBI KALIR
                // INDEX NO'LAR AYNI.
                // IKINCI ITERATION'DA X=1 MEANS INDEX:1=> INDEX I 1 OLAN ELEMAN 2. ELEMAN OLD ICIN IKINCI ELEMANA BAKTIK
                // 10 OLD ICIN GIDER. GERIYE 1 5 13 KALIR YENI LISTEDE
                // OYLE OLUNCA INDEX:0 -> 1, INDEX:1 -> 5, INDEX:2 -> 13
                // X=2 OLDU AMA 1 E BAKMISTIK SIMDI 5 E BAKMAMIZ GEREKIRKEN INDEX 2 YANI 13 E GECTIK!!!!
                // THIS IS WHY HER REMOVING ITEM DAN SONRA INDEX 1 AZALTILIR!!!!!!!!!!!!!
            }
        }
        System.out.println("new product list: " + productList + " its size: " +productList.size());



        System.out.println("\n");
        System.out.println("TASK : 10");

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for(String eachProduct : productList){
            String names = eachProduct.split(",")[0];
            itemNames.add(names);
            double pricePart = Double.parseDouble( eachProduct.split(",")[1] );
            prices.add(pricePart);
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);
        }
        System.out.println("Item Names: "+ itemNames);
        System.out.println("Prices: "+prices);
        System.out.println("Monthly Payments: "+monthlyPayments);

        }
    }


