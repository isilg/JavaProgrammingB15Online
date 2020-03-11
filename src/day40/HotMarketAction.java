package day40;
import java.util.ArrayList;
public class HotMarketAction {
    public static void main(String[] args) {
        /**
         * Create Offer class with
         * instance fields :
         * location, company, salary , isFullTime
         * instance methods :
         * displayOfferDetails -- print all info about offers
         * Create 4 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
         * Optionally :
         * Store them into List<Offer> then call the method.
         * Optionally :
         * Add 5000 to each offers less than 100K
         */
        // o1 objem Offer class ina ait tum attribute leri kullanabilir
        // diye permission verdim burda
        Offer o1 = new Offer();
        o1.location = "LA";
        o1.company = "Amazon";
        o1.salary = 140000;
        o1.isFullTime = true;

        o1.displayInfo();

        Offer o2 = new Offer();
        o2.location = "LA";
        o2.company = "Google";
        o2.salary = 155000;
        o2.isFullTime = true;

        o2.displayInfo();


        Offer o3 = new Offer();
        o3.location = "San Francisco";
        o3.company = "Apple";
        o3.salary = 135000;
        o3.isFullTime = true;

        o3.displayInfo();

        // Create an Empty object. Empty object doesnt have any value for the attribute
        // My attributes are location. company, salary, isFullTime
        // but o4 doesn't have any of that attributes. All of the attributes display default value
        // default values:  For primitive numbers:   0 or 0.0, boolean: false, char: false ,
        //                  For any reference types: null
        Offer o4 = new Offer();
        o4.displayInfo();


        System.out.println("\t");
        // Add 2K to Amazon offer
        System.out.println(o1.salary+2000);


        System.out.println("\t");
        // Set the salary value o4 offer object to sum of all the other offers
        o4.salary = o1.salary + o2.salary + o3.salary ;
        o4.displayInfo();
        // BUNU YAPMA. INSTANCE METHOD U CAGIRIYORSAN System.out.println KULLANILMIYOR
        // System.out.println( o4.displayInfo() );

        System.out.println("\t");
        o4.turnToFullTime();
        o4.turnToFullTime();    // method ilk cagrilinca full time a dondurmustu o4 object i
                               // o yuzden 2. kez cagirinca "Already full time" doner
        o4.displayInfo();

        System.out.println("\n");
        System.out.println("Changing last offer's location:"+"\t");
        o4.changeLocation("DC");
        o4.displayInfo();

        System.out.println("\n");
        o4.changeAllInfo("Amazon", "San Francisco",150000, true);
        // IF changeAllInfo method weren't call displayInfo(); method inside itself
        // I had to call here ( o4.displayInfo() ) but I don't need now.


        System.out.println("\n");
        // If o4 earn more than 100k, move him to Atlanta
        // Which methods I need to use  ==>> is100k(), changeLocation, displayInfo()
         if(o4.is100k()) {   // o4.is100k() == true demeye gerek yok zaten bu code true donduruyor
             o4.changeLocation("Atlanta");
         }
             o4.displayInfo();

        // toString(); Instance Method u return yapiyo, System.out.println() kullanmiyo ekrana bilgi gelmez yani
        // o4.toString();


    }
  }
