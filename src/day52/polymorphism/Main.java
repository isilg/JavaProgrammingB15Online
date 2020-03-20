package day52.polymorphism;
public class Main {

    public static void main(String[] args) {

        //Circle (sub class) -> Shape (super class) -> Drawable (class that super class implements. It is like "grand parent class" to Circle)

        //Circle c1 = new Circle("penny",2);    //You can access anything from Circle, Shape, and Drawable
        Shape c1 = new Circle("penny",2);     //You can access anything from Shape, and Drawable. No direct access to
                                                //Circle. No using Circle's methods. We need to refer Circle to access
                                                //it(this means to be able to use Circle's methods your reference type
                                                //has to be Circle -->>Circle c1 = new Circle("penny",2); )
        //Object c1 = new Circle("penny",2);    //You can access Object's methods. If u type c1. some methods coming up
        //Drawable c1 = new Circle("penny",2);  //You can access anything what Drawable has and what Object class has.
        //System.out.println(c1);


        printAnyShapeArea(c1);

        Shape r1 = new Rectangle("Book", 10,5);
        printAnyShapeArea(r1);

        Shape s1 = new Square("Bob", 6);
        printAnyShapeArea(s1);

        drawShape3Times(c1);
        drawShape3Times(r1);
        drawShape3Times(s1);


     //draw() -> coming from Drawable , calculateArea() -> coming from Shape
//        c1.draw();             // draw()  -->  Circle's method
//        c1.calculateArea();    // calculateArea() --> Shape's method
//        c1.toString();
//        c1.test();



     //getClass().getSimpleName() -> It is Object class method to bring what is that object's Class(in this case c1's class)
     //uncomment  Object c1 = new Circle("penny",2); line to be able to use object's method
        //System.out.println( c1.getClass().getSimpleName() );


    }



    //Create a method that accept any Shape and print the calculated area
    public static void printAnyShapeArea(Shape anyShape) { //I just wanna call whatever Im about to create directly in my main this is why I did it static
        anyShape.calculateArea();    //calculateArea() calculating the area  -->> area = Math.PI * radius * radius;
        System.out.println( anyShape.name+"'s area is= " + anyShape.area);  //calculating and assigning the result to area so call area and print it(printing the result)
    }


    //Create a static method called drawShape3Times. It has Shape as parameter. Return nothing. It will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape){
        for (int i=0; i<3; i++){
            anyShape.draw();
        }
    }


}
