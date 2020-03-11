package day44.sub;

import day44.Vehicle;

// Vehicle is in day44 package but Car inside the sub package
// they are not in the same package so IntelliJ automatically import line 3
// import dy44.Vehicle   if it doesn't because of the version of IntelliJ,
// you should do it
public class Car extends Vehicle {

    // ******* FROM VEHICLE CLASS WE CANNOT REACH OUT THE YEAR BECAUSE IT IS PRIVATE
    // AND WE CANNOT INHERIT 'MAKE' BECAUSE IT'S DEFAULT AND DEFAULT ACCESS MODIFIER
    // CAN BE ACCESSED FROM SAME PACKAGE! CAR ISN'T IN THE SAME PACKAGE WITH VEHICLE

    int mileage ;

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.mileage = 39637;
        System.out.println("c1.mileage: "+ c1.mileage);

        c1.make2 = "Toyota Corolla";
        System.out.println("c1.make2: "+c1.make2);

        c1.setYear(2016);
        System.out.println("c1.getYear(): "+c1.getYear());

    }

}
