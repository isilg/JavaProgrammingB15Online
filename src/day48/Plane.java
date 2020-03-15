package day48;

//Build relationship between class and interface using implement kywrd
public class Plane implements Flyable{

  //public static final boolean HAVE_WING = true;
    String name;
    int capacity;
    int speed;

    //since we are implementing abstract method,
    //we need to provide body by overriding it
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }


    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();
        System.out.println( Flyable.HAVE_WING ); //call static field -> class_name.field_name
        System.out.println(HAVE_WING); //main is static, HAVE_WING  is static, static can access to static
    }

}