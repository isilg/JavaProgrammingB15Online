package day42;

import java.util.Comparator;

public class ComputerShop {
    public static void main(String[] args) {
         Computer c1 = new Computer();
         c1.setBrand("Apple");
         c1.setRam(32);
         c1.setPrice(2000);

         c1.runProgram();
         c1.calculate();

         c1.setPrice(12);  // change the price
         c1.setRam(1000);
         
        // Price and Ram doesn't change because the value I set them are invalid
        // ram(1-128), price(more than $20) olmasi gerekiyordu
        // o yuzden degismez degerler, ilk set ettigim degerler ekrana gelir
         System.out.println("c1= "+c1.toString() );
         
         
        // Store the ram
        // 1- type of the ram 2- name of the variable we r gonna save ram
        // 3- equal sign 4- c1 object will call the getter method to get ram
        // So we can get the ram and save it as myRam variable
        int myRam = c1.getRam();
        System.out.println("myRam = " + myRam);
        
        
        // Create 2nd computer
        Computer c2 = new Computer();
        c2.setBrand("HP");
        // Set HP price to half of Apple price
        c2.setPrice(c1.getPrice() / 2);
        // Set HP ram to quarter of apple ram'
        c2.setRam(myRam/4);
        System.out.println("c2 = " + c2);
    }
}
