package day55.Polymorphism2;
public class Main {
    public static void main(String[] args) {

        Engine en = new Engine("V6", 400);
        Driver d = new Driver("Pedro", 12345);
        Taxi t1 = new Taxi(101, en, d);     // Constructor of Taxi -->>public Taxi(int plateNumber, Engine eng)
        System.out.println("t1= " + t1.toString());

        System.out.println("---------");

        //CREATE AN ENGINE OBJECT AND DIRECTLY PASS IT
        Taxi t2 = new Taxi(102, new Engine("V8",600), new Driver("John",12345) );


        //Store t2 plate number in a variable x
        int x = t2.plateNumber;


        //Store t2 driver field in a variable y
        Driver y = t2.dr;


        //Store t2 Engine field in a variable z
        Engine z = t2.eng;


        //Get the horse power of the Taxi t2
        System.out.println("Engine horsepower is= " + t2.eng.horsePower);


        //PRINT OUT DRIVER NAME AND CAR HORSE POWER LIKE driver <name> is driving the taxi with horsepower <> on the highway
        System.out.println(t2.dr.name);   //dr is a field name of taxi. dr Driver name ve DriverID'yi verir. Sadece name icin dr.name

        //Get first character of driver name
        System.out.println( t2.dr.name.charAt(0) );




    }

}
