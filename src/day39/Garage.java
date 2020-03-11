package day39;
public class Garage {
    public static void main(String[] args) {

        // THE CLASS IM GONNA USE ITS ATTRIBUTES HAS NO MAIN METHOD BUT OTHER CLASS HAS !!!
        // Attribute lerini kullanacagin class in adi sonra
        // object name = new kywrd then gene attribute lerini
        // kullanacagin classin adi parantezle beraber!
        // GETTING AN INSTANCE OUT OF A CLASS MEANS GETTING AN OBJECT
        // OUT OF A CLASS. INSTANCE = OBJECT
        // INSTANCE VARIABLE MEANS THAT VARIABLE BELONG TO THE OBJECT

        Car c1 = new Car();
        c1.year = 2020;
        c1.model = "4 Runner";
        c1.make ="Toyota";
        c1.color = "white";

        System.out.println("----CAR 1 -----");
        //Print out the make and year of the car
        System.out.println("car1 make: "+c1.make);
        System.out.println("car1 color: "+c1.color);
        // !!! goForward Instance method u dondurmek icin System.out.print e ihtiyac yok
        // System.out.println(c1.goForward() );
        c1.goForward();
        c1.printYear();
        c1.changeColor("Red");


        // Create 2nd object
        Car c2 = new Car();
        c2.year = 2017;
        c2.model = "SantaFe";
        c2.make = "Hyundai";
        c2.color = "black";

        System.out.println("---- CAR 2 ------");
        // Print the year of Hyundai
        System.out.println("Year of hyundai: "+c2.year);
        c2.goForward();
        c2.printYear();

        // Change the color of Hyundai to the color of Toyota
        // We can do it 2 ways
        // 1th way is:
        c2.color = c1.color;  //c2.color = "white";
        // 2nd way is creating an instance method & calling it:
        System.out.println("New color of the Hyundai: "+c2.color);

        c2.changeColor("Blue");

    }
}
