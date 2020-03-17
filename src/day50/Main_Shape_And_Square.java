package day50;

public class Main_Shape_And_Square {

    public static void main(String[] args) {

        Square s1 = new Square("my square", 10);
        System.out.println(s1.toString());

        s1.calculateArea();
        System.out.println(s1);

        s1.draw();

        System.out.println("----------");

        Circle c1 = new Circle(5, "my circle");
        System.out.println(c1);

        c1.calculateArea();
        System.out.println(c1);

        c1.draw();




    }
}
