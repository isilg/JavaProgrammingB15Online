package day47;
public class Garage{
    public static void main(String[] args) {

        //Abstract class can not be instantiated
        //This means we cannot create object out of it
        //Car c1 = new Car();  //ERROR. I created a Car object. What is the
                             //point to have a class if we cannot instantiate.
                             //It is just meant to be a super class
        //Car c = new Car(); ERROR. You cannot create an object of abstract class

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");


    }
}
