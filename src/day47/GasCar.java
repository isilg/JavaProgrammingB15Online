package day47;

//Gascar is concrete class. A class extends from
//abstract class called concrete class. It is not a keyword
//Concrete class must provide body for all inherited
//abstract methods or it cannot compile
public class GasCar extends Car{

    int gasLevel;

    //implementing(providing body) start method
    @Override
    public void start() {
        System.out.println("Gas car starting");
    }

    @Override
    public void goForward() {
        System.out.println("Gas car going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas car turning "+direction);
    }

}
