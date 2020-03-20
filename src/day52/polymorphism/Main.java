package day52.polymorphism;
public class Main {

    public static void main(String[] args) {

        //Circle (sub class) -> Shape (super class) -> Drawable (class that super class implements. It is like "grand parent class" to Circle)

        Circle c1 = new Circle("penny",2);    //You can access anything from Circle, Shape, and Drawable
        //Shape c1 = new Circle("penny",2);     //You can access anything from Shape, and Drawable. No direct access to
                                                //Circle. No using Circle's methods. We need to refer Circle to access
                                                //it(this means to be able to use Circle's methods your reference type
                                                //has to be Circle -->>Circle c1 = new Circle("penny",2); )
        //Object c1 = new Circle("penny",2);    //You can access Object's methods. If u type c1. some methods coming up
        //Drawable c1 = new Circle("penny",2);  //You can access anything what Drawable has and what Object class has.
        System.out.println(c1);

        //draw() -> coming from Drawable , calculateArea() -> coming from Shape
        c1.draw();             // draw()  -->  Circle's method
        c1.calculateArea();    // calculateArea() --> Shape's method
        c1.toString();
        c1.test();

    }
}