package day52.polymorphism;

public class Circle extends Shape {

    int radius;


public Circle(String name, int radius){
    super(name);
    this.radius=radius;
}

public void test(){
    System.out.println("testing");
}

public void calculateArea(){
    area = Math.PI * radius * radius;
}

@Override
public void draw() {
    System.out.println("Make a point and start making circle with radius " + radius);
}

@Override
public String toString() {
    return "Circle{" +
            "radius=" + radius +
            ", name='" + name + '\'' +
            ", area=" + area +
            '}';
}


}
