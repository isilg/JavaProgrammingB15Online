package day30;
public class Car_Inventory {
    public static void main(String[] args) {

        String[] cars = {"Acura-NSX",
                          "Chevrolet-Corvette",
                          "Chevrolet-Cavalier",
                          "BMW-3 Series",
                          "Pontiac-LeMans",
                          "BMW-7 Series",
                          "Oldsmobile-Achieva",
                          "Honda-Civic"};

        //TASK 1: count Chevrolet and Civic
        // we can use contains , startWith , endWith to get same result
        int chevyCNT = 0;
        int civicCNT = 0;

        for (String eachCar : cars) {

            //if(eachCar.startsWith("Chevrolet")){
            // what if I want case insensitivity
            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                // toLowerCase() kullandiktan sonra arama yaparken
                // tum harfleri kucuk yaz eger ("Chevrolet") yazarsan 0 dondurur
                // toUpperCase() yapiyosanda "CIVIC" de confuse yapma IntellJ i :))
                chevyCNT++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCNT++;
            }

        }
        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println("civicCNT = " + civicCNT);

        System.out.println("\t");



        //II.WAY
//        int counterChevrolet = 0;
//        int counterCivic = 0;
//
//        for(int i=0; i<cars.length; i++){
//            if( cars[i].toLowerCase().contains("chevrolet") ){
//                counterChevrolet++;
//            }else if( cars[i].toLowerCase().contains("civic") ){
//                counterCivic++;
//            }
//        }
//        System.out.println(counterChevrolet+ " Chevrolet we have");
//        System.out.println(counterCivic+" Civic we have");


        //III.WAY
//        for (String eachCar : cars) {
//
//            //if(eachCar.startsWith("Chevrolet")){
//            // what if I want case insensitivity
//            if (eachCar.toLowerCase().startsWith("chevrolet")) {
//                chevyCNT++;
//            }
//            if (eachCar.toUpperCase().contains("CIVIC")) {
//                civicCNT++;
//            }
//
//        }
//        System.out.println("chevyCNT = " + chevyCNT);
//        System.out.println("civicCNT = " + civicCNT);



        // TASK 2 : PRINT ALL LOCATION OF Honda-Civic in this array
        for (int x = 0; x < cars.length; x++) {
            if (cars[x].equals("Honda-Civic")) {
                System.out.println("Civic found at location: " + x);
            }
        }

        //TASK 3: FIND THE LOCATIONS OF CIVIC
        for( int i=0; i<cars.length; i++){
            if(cars[i].toLowerCase().contains("civic")){
                //toLowerCase() diyosan civic in de harflerini kucuk yaz
                System.out.println("Civic found at location: " + i);
            }
        }

        //II.WAY - .equals() method
//        for (int i=0; i<cars.length; i++){
//            if (cars[i].equals("Honda-Civic")){
//                System.out.println("Location of Honda-Civic is: "+ i);
//            }
//        }

         // TASK: PRINT BRAND AND MODEL SEPARATELY FOR Honda-Civic
         // Print Out => Brand: Honda ModeL: Civic

          String hondaCar = "Honda-Civic";
          String[] hondaCarSplitted =  hondaCar.split("-");
          System.out.println("Brand: "+hondaCarSplitted[0]+", Model: " + hondaCarSplitted[1]);






    }
}
