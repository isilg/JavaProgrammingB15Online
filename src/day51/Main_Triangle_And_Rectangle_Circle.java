package day51;
public class Main_Triangle_And_Rectangle_Circle {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        Shape[] allShapes = {s1, s2, s3, new Triangle(), new Circle()};
        for(Shape each : allShapes){
            each.draw();
        }
    }
}
