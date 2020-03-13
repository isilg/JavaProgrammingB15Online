package day47;
public class ElectricCar extends Car {

    int batteryLevel;


    //If you don't implement method from abstract class it gives error.
    //Make this method comment and see what error gives. Hover over
    //the name off the class. It shows implement methods.

    //can I type public abstract void start{  System.out.println("This is how electric car start");}
    //NO. Abstarct method cannot have body
    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }

    //implementing(providing a body) abstract parent class goForward method
    @Override
    public void goForward() {
        System.out.println("Electric car going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Electric car going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Electric car turning "+direction);
    }

    public static void main(String[] args) {
       //Car c1 = new Car(); ERROR. We cannot create an object of abstract class
        ElectricCar e1 = new ElectricCar();
        e1.start();

        e1.goBackward();
        e1.goForward();
        e1.turn("Right");

    }
}


