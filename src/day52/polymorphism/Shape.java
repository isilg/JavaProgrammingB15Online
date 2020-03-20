package day52.polymorphism;
/**
 * Create an Interface called Drawable
 * 		 it has draw method
 * Create an abstract class called Shape
 * 		it implements Drawable interface
 * 		it has 2 fields :  String name , double area
 * 		abstract method calculateArea();
 * Create 2 concrete Shape classes called
 * 				Square
 * 					field : length
 * 					instance methods : (implement all abstract methods)
 * 					toString method
 * 				Circle
 * 					field : radius
 * 					instance methods : (implement all abstract methods)
 * 					toString method
 */

public abstract class Shape implements Drawable {

    String name;
    double area;

    //Why we need constructor->giving to child class so sub class can use it
    //don't set the area, calculate the area
    public Shape(String name) {
        this.name = name;
    }


    public abstract void calculateArea();

}
