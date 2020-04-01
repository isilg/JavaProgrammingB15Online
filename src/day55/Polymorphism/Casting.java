package day55.Polymorphism;
public class Casting { //Main for Dog class

    public static void main(String[] args) {

        //Upcasting from type Dog to Object
        Object o = new Dog("husky");


        //Downcasting Object to Dog
        Dog d = (Dog) o;
        d.bark();


        Dog d2 = new Dog("husky"); //this husky is a different husky than line 7

    }
}
