package day47;

public class Triangle extends Shape{

    int height;
    int base;

    public Triangle(int height, int base){
        super("My triangle");
        this.height = height;
        this.base = base;
    }


    public void calculateArea(){
        area = height * base / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name= " + name + '\'' +
                ", area=" + area +
                ", base="+base+
                ", height=" + height +
                '}';
    }
}
