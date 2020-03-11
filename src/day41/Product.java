package day41;

// I have a Product class and have 2 attributes that name, and price
// Make this product a well encapsulated. Make all the instance fields
// private so it can only be accessible in the same class
// provide public getters and setters method

// THIS KYWRD REFER TO INSTANCE FIELD (FIELD VALUE YU TEMSIL EDER(CLASS IN HEMEN ALTINDA
// TANIMLADIGIN DEGISKENLER) )
// ONLY CAN BE USED INSIDE INSTANCE METHOD AND CONSTRUCTOR


public class Product {

    private String name;
    private double price;



    public String getName(){
        // this her zaman field value yu temsil eder yani yukarda private olarak tanimladigimiz deger
        return this.name;
        //return name;
    }

    public void setName(String newName){
        //set the values
        name = newName;
    }

       // both field value and my parameter's value is name. When I set the value name = name,
       // It is confusing which one is which. So if I use this, I know it is field value
//    public void setName(String name){
//        this.name = name;
//    }



    public double getPrice(){
        return price;
        //return this.price;
    }

    public void setPrice(double newPrice){
        // set the value
        // If there is any condition type now(for example if)
        if(newPrice > 0 ) {
            price = newPrice;
        }
    }

}
