package day47;
//This abstract class designed to be a super class
public abstract class Car {

    int year;
    String brand;

    //let's add one functionality
    //Since it is an abstract method it cannot have a body
    // So don't use {} , just use ();
  //public abstract void start(){ }   ERROR
    public abstract void start();

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);

    public void doCarThing(){
        System.out.println("non-abstract method can be in an abstract class");
    }

    public static void doStaticThing(){
        System.out.println("static method can be in an abstract class");
    }

}

