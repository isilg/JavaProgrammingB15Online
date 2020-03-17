package day50;

public abstract class Shape implements Drawable{

    String name;
    double area;

    public abstract void calculateArea();

    //Why we need constructor->giving to child class so sub class can use it
    //don't set the area, calculate the area
    public Shape(String name) {
        this.name = name;
    }

}
