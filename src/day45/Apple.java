package day45;

public class Apple extends Fruit {

    public Apple() {       //Apple constructor
        //super();        //I want to reuse the functionality already written in super class
        //2 CONSTRUCTOR CANNOT BE CALLED AT THE SAME TIME MAKE 1 OF THEM DEFAULT
        //super("test");
        System.out.println("Message from Apple constructor");
    }


    public static void main (String[] args){
        Apple a1 = new Apple();
     }

   }

