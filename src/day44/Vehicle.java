package day44;

public class Vehicle {

    // What is the access modifier of make?
    // There is no access modifier so it is => default
    // public degil default. public olsaydi public yazardik
    String make;

    protected String make2;  // Protected access modifier: make the
                            // member accessible in subclasses of this
                            // class IN DIFFERENT PACKAGE
    private int year;

    public void start(){
        System.out.println("starting "+make);
    }

    public void goForward(){
        System.out.println(make+ " is going forward");
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }


}
