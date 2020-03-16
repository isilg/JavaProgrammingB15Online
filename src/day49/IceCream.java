package day49;

public class IceCream implements Edible{

    //do not type default when you implement a default method
    //default is a kywrd can be used just in interfaces
    @Override
    public void digest(){
        System.out.println("Digesting burger");
    }


    @Override
    public void eat() {
        System.out.println("eat ice cream");
    }

    @Override
    public void drink() {
        System.out.println("if ice cream melts, you'll drink it");
    }


    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.eat();
        i1.drink();
        i1.digest();

    //this returns hash code cause I don't have toString method
    //inside IceCream class
        System.out.println( i1.toString());
    }


}
