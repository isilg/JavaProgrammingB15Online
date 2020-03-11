package day40;
import java.util.ArrayList;
public class HotMarketAction_2 {
    public static void main(String[] args) {

        // Store them in the List(ArrayList)
        // It is asking create a list of Offer so you can store offer object  ==>>  <Offer>
        // If it says String , you can store String object  ==>  <String>
        // If it says int, you can store int object  ==> <int>

        // Im creating an ArrayList name's myOffers and it holds Offer type objects
        // *** Offer: type of the objects in ArrayList

        Offer o1 = new Offer();
        Offer o2 = new Offer();
        Offer o3 = new Offer();
        Offer o4 = new Offer();

        o1.location = "LA";
        o1.company = "Amazon";
        o1.salary = 140000;
        o1.isFullTime = true;


        o2.location = "LA";
        o2.company = "Google";
        o2.salary = 155000;
        o2.isFullTime = true;


        o3.location = "San Francisco";
        o3.company = "Apple";
        o3.salary = 135000;
        o3.isFullTime = true;


        // Create an Empty object. Empty object doesnt have any value for the attribute
        // My attributes are location. company, salary, isFullTime
        // but o4 doesn't have any of that attributes. All of the attributes display default value
        // default values:  For primitive numbers:   0 or 0.0, boolean: false, char: false ,
        //                  For any reference types: null

        o4.displayInfo();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add( o1 );
        myOffers.add( o2 );
        myOffers.add( o3 );
        myOffers.add( o4 );


        // HOW TO PRINT AN ARRAYLIST: 1- .toString() 2- FOR LOOP- .get(i)  3-FOR EACH LOOP  4-TEMPLATE VE DISPLAY METHOD/toString() VARSA ONU CAGIR(BU ORNEKTEKI GIBI)
        System.out.println("\n");
        // Print each offer
        // This prints hashcode
        System.out.println("Using directly ArrayList name to display offers gives hash code: " + myOffers);

        System.out.println("toString ile arrayList dondurme,  myOffers.toString() result: "+myOffers.toString());

        System.out.println("\n");
        // Best way is loop
        for( Offer each : myOffers){
            each.displayInfo(); System.out.println("\n");
        }

        // II.WAY:
        for(int i=0; i<myOffers.size(); i++){
            myOffers.get(i).displayInfo();
            // Offer each = myOffers.get(i);
            // each.displayInfo();
        }


    }
}
