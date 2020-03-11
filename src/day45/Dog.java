package day45;

public class Dog extends Animal{
    public void speak(){
        //!!!!!******INTERVIEW: WHAT IS OVERRIDING AND OVERLOADING******!!!!!

        //Overriding parent method. Overriding: child class has the
        //same method(same exact method name, same exact method parameter,
        //same exact return type, most of the time same access modifier)
        // with the parent but child class can give its
        //own implementation to a method
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Dog twix = new Dog();
        twix.speak();
    }
}
