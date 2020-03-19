package day50;

public class Main_Shape_And_Square {

    public static void main(String[] args) {

        //Instantiate : creating an object of a specific class
        Square s1 = new Square("my square", 10);
        System.out.println(s1.toString());

        s1.calculateArea();
        System.out.println(s1);

        s1.draw();

        System.out.println("----------");

        //Instantiating c1 object
        Circle c1 = new Circle(5, "my circle");
        System.out.println(c1);

        c1.calculateArea();
        System.out.println(c1);

        c1.draw();




    }
}
