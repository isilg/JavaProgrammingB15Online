package day42;
/**
 *  WHY WE NEED A CONSTRUCTOR
 *  We can create an object with initial attribute(s) value already set yada
 *  Giving initial state to the Object => constructor create etme amaci diyebiliriz
 *  It could be public, private, or default.
 *  It doesn't have return type because it is not a method.
 *  And it has same name as the class.
 *  It is a code block that is called every time a new object is created
 *  Whenever IntelliJ seed 'new' kywrd Constructor is called
 *  IT IS NOT A METHOD YOU CANNOT CALL IT ANYTIME
 *  IT IS CALLED WHEN A NEW OBJECT CREATED
 */
public class Bike {
    int speed;
    int gear;

    // Create a constructor.
    public Bike(){
        System.out.println("Message from constructor");

        gear = 1;
    }

    // ANOTHER CONSTRUCTOR
    public Bike(int newGear){
        gear = newGear;     // this.gear = newGear;
    }

    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

}
