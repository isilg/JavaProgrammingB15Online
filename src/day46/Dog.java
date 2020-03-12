package day46;

public class Dog {
    public static class Dog extends Animal {

        //!!!!!******INTERVIEW: WHAT IS OVERRIDING AND OVERLOADING******!!!!!
        //Overriding parent method. Overriding: child class has the same
        //method(same exact method name, same exact method parameter, same
        //exact return type, most of the time same access modifier) with the
        //parent but child class can give its own implementation to that inherited method

        public static void main(String[] args) {
            Dog twix = new Dog();
            twix.speak();
        }

        public void speak(){
            //speak();  stack overflow error. speak is a METHOD not CONSTRUCTOR.
            //It look for the closest speak method. It has own and parent has also but
            //since its own speak method is closer, it calls its own method again and again and again
            super.speak();    // If you wanna call parent's method use super.
            System.out.println("BARK!");
            super.speak();  //wanted to cal again
        }

    }
}
