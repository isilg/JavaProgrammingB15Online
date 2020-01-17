package day13;

public class AmazonShippingCalculator2 {
    public static void main(String[] args) {


        boolean youWantToShop = true;
        String preference = "Store";

        //NESTED IF MEANS IF INSIDE ANOTHER IF
        if (youWantToShop) {     //if(  youWantToShop ==true )  ISTER BUNU KULLAN ISTER TRUE YAZMADAN AYNI SEY

            if (preference.equals("Store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");

            } else {
                System.out.println("GOOD JOB STAY HOME KEEP CODING");
            }
        }
    }
    }