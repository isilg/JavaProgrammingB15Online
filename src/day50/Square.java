package day50;

public class Square extends Shape{

    int length;

   //Constructor
    public Square(String name, int length) {
        super(name);    //reusing functionality of super class. We have 1 constructor in parent (public Shape(String name){ this.name = name;} ) to set the name we are resuing it
        this.length = length;
    }


    @Override
    public void calculateArea() {
        //this.area = length * length; You can write this one also
        area = length * length;
    }

    //Color coming from Drawable grand parent class class
    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with length," +
                " length is: "+length+" with color "+COLOR); //COLOR or Drawable.COLOR both OKAY
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
