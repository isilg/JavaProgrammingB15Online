package day44;

// What is inherited from Super class?  =>> fields and methods
// that visible in subclass are inherited. Constructors are not inherited

// Vehicle => superclass
// Train => subclass
public class Train extends Vehicle{

    String make;
    int year;
    int wagonCount;

    public void makeChoChoSound(){
        System.out.println("CHOOO CHOOOO");
    }

    public void start(){
        System.out.println("starting "+make);
    }

    public void goForward(){
        System.out.println(make+ " is going forward");
    }


    public static void main(String[] args) {

        // Now I am inside the main. From main I'm calling makeChoChoSound()  method.
        // Since this method is an instance method I have to create an object to call it
        Train t1 = new Train();
        t1.makeChoChoSound();

        // We got these attributes from Vehicle
        t1.make= "Thomas";
        // t1 private old icin ona ulasamayiz
        // t1.year = 1999;
        // year a nasil ulasirim? =>> Vehicle class a year icin get and set method yazarak
        t1.setYear(1999);
        System.out.println(t1.getYear());


        // Calling the instance methods we got from Vehicle
        t1.start();
        t1.goForward();
    }
}
