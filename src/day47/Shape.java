package day47;
public abstract class Shape {

    String name;
    int area;

   //Constructor to set name values
   //area meant to be calculated not to be set. We don't
   //know the area just based on the shape we need to
   //calculate it.This is why we created calculateArea() method
    public Shape(String name) {
        this.name = name;
    }

    //Abstract method called calculateArea
    //DON'T FORGET NOT TO ADD BODY!!
    public abstract void calculateArea();

   //toString optional. It returns String, its name is toString
   //it is used to return a string representation of the elements
    public abstract String toString();

}


