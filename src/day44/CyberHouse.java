package day44;

public class CyberHouse {

    String design;
    int houseNum;
    // We can change default value of the fields by assigning value
    // directly in the template class. Now default value will be
    // Cybertek Ave instead of null
    static String neighborhoodName = "Cybertek Ave";

    // Creating Constructor by right clicking and choosing Generate
    // CONSTRUCTOR CAN ACCESS ANYTHING
    public CyberHouse(String design, int houseNum) {
        this.design = design;
        this.houseNum = houseNum;
    }

    // INSTANCE METHOD CAN ACCESS ANYTHING
    public void showAllInfo(){
        System.out.println( "house: " + this.houseNum+
                          ", design: "+ this.design+
                          ", neighbourhoodName "+neighborhoodName);
    }

    // STATIC METHOD CAN ONLY ACCESS STATIC MEMBERS OF SAME CLASS
    public static void showNeighborhoodName(){
        System.out.println("Neighborhood Name: " + neighborhoodName);

        //CANNOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        // System.out.println("House Num: "+houseNum);     // ERROR
    }



}
