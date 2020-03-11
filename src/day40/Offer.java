package day40;
public class Offer {

    String location;      // Attribute 1
    String company;       // Attribute 2
    long salary;          // Attribute 3
    boolean isFullTime;   // Attribute 4

    public void displayInfo(){
        System.out.println("Location: " + location+
                           ", Company: "+ company+
                           ", Salary: " + salary+
                           ", isFullTime: "+isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime(){
        if(isFullTime==false) {
            isFullTime = true;
        }else
            System.out.println("Already full time");
    }


    // Write a method to change the location of the Offer
    // to the location  user passed
    public void changeLocation(String newLocation){
        location = newLocation;
    }

    // Write a method to accept 4 parameters to change all info about offers
    // *** METHODS DONT SEE EACH OTHER SO EVEN PARAMETERS ARE SAME IT WILL BE NO CONFUSION
    // BELOW METHOD HAS newLocation PARAMETER ==>> public void changeLocation(String newLocation)
    // THIS METHOD ALSO HAS newLocation PARAMETER BUT THESE 2 ARE NOTHING TO DO WITH
    // EACH OTHER(BIRBIRLERIYLE ALAKALARI YOK)
    // ********** I ALREADY CREATED A METHOD TO CHANGE THE LOCATION CAN I USE IT
    // HERE TO CHANGE THE LOCATION? =>> YES, I CAN USE changeLocation METHOD ************

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime ){
        company    =  newCompany;
        location   =  newLocation;
        salary     =  newSalary;
        isFullTime =  newIsFullTime;
        // ***** System.out.println(); e IHTIYACIN YOK EGER DISPLAY METHOD UN VARSA.
        // o4 ICIN BU METHODU CAGIRDIM SONRADA DISPLAY METHOD ILE UPDATED INFO YU DONDURDUM
        // INSTANCE METHOD CAN CALL ANOTHER INSTANCE METHOD DIRECTLY
        // SO I CAN TYPE:
        displayInfo();
        // AFTER AN OBJECT CALL THIS METHOD NO NEED TO USE System.out.println
        // This method will already display every info
    }

       // Write a method to check if the offer at least 100K. If it is return true, otherwise return false
        public boolean is100k() {
            return salary >= 100000;  // No need if loop. This code means: If salary at least 100K, return true
        }


        // Create an Instance called toString. Has no parameter
        // return String representation of Offer Object in below format
        // [Location = Virginia, Company = Amazon | Salary = 15000 $ | isFullTime = true]
        public String toString(){
             String str = "[Location ="+location+"|"+
                          " Company = "+company+ "|"+
                          " Salary = "+salary + "|"+
                          " isFullTime = "+isFullTime+"]";
             return str;
        }

}
