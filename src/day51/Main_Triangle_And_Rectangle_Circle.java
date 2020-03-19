package day51;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main_Triangle_And_Rectangle_Circle {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();



        Shape[] allShapes = {s1, s2, s3, new Triangle(), new Circle()};

        System.out.println("----------For each loop----------");
        for(Shape each : allShapes){
            each.draw();
        }


        System.out.println("----------For loop----------");
        //allShapes is an array so we use length with List we use size
        for(int i=0; i<allShapes.length; i++){
            allShapes[i].draw();
        }


        //Quick way to create a list
        //Can we add or remove item from this sort way -->> NO
        List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1, new Triangle());

        System.out.println("----------For each with list----------");
        for ( Shape each : shapeList ){
            each.draw();
        }

        //Instantiate : creating an object of a specific class
        //ArrayList is a class, List is an interface that implement the shape
        List<Shape> shapeList1 = new ArrayList<>();
        shapeList1.add(s1);
        shapeList1.add(s2);
        shapeList1.add(s3);
        shapeList1.add(s2);
        shapeList1.add(s1);


        System.out.println("----------For each loop with list----------");
        for (Shape each : shapeList){
            each.draw();
        }


        System.out.println("----------For loop with list----------");
        //use size for list
        //use get() method to get each object then call draw method if you want
        for (int i=0; i<shapeList.size(); i++){
            shapeList.get(i).draw();
        }

    }
}
