package day39;
public class Car {

    // Attributes: year , model,  make, color
    int year;
    String model ;
    String make;
    String color;

    // II.WAY:
    // int year;
    // String model, make, color

    // To add BEHAVIOUR to the class => ADD METHOD
    // NO STATIC => We didn't create it as  public static void goForward()
    // THIS IS WHY IT IS INSTANCE METHOD

    // We need an object when we call Instance Methods.
    // Car is a template. It cannot even be run. No run button
    public void goForward(){
        // mesajin basina attribute lerden ekleyebiliriz boylece
        // create ettigimiz 2 car in ikisi icinde cagirdigimiz zaman
        // karisiklik olmaz
        System.out.println(make +" Going Forward");
    }


    public void printYear(){
        // direk year yazip car in uretim yilini getirebiliriz
        // it is coming from our instance field
        System.out.println( "Car age: " + (2020 - year) );
    }

    // Change car's color what
    public void changeColor(String newColor){
        color = newColor;
        System.out.println("New color is: "+newColor);

    }

}
