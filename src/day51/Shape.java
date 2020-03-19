package day51;

public abstract class Shape {

    Shape[] myShapes = {"rectangle","triangle", "triangle", "circle", "circle"};
    for(Shape each : myShapes){
        each.draw();
    }

    //ABSTRACT class has NO BODY
    public abstract void draw();
}
