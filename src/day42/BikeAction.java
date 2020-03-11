package day42;

public class BikeAction {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();


        // I dont want empty gear when object is created
        // I want to the bike come with gear set to 1
        // You can go to the constructor and type the condition
        // b1.gear  and b2.gear => are just to see the data
        System.out.println("b1 gear: " + b1.gear);
        System.out.println("b2 gear: " + b2.gear);


        // I want to be able to set the default gear to any number
        // I specify when object is being called (gear sadece 1 set olmasin
        // ben cagirdikca neye set edersem onu gostersin)
        // Template te 2. Constructor i tanimladim ve parametre verdim
        // How do I create an object using 2. constructor?
        // New Object create et ve parametre ver parantez icine:
        Bike b3 = new Bike(9);
        System.out.println("b3 gear: "+b3.gear);


   // I want a Bike object with both speed and gear set to the value I specify
        Bike b4 = new Bike(3,55);
        System.out.println("b4 gear: " + b4.gear);
        System.out.println("b4 speed: "+ b4.speed);


    }
}
