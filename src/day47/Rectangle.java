package day47;

public class Rectangle extends Shape{

    //fields coming from parent:
    //String name;
    //int area;

    //fields are created in this class:
    int width;
    int height;

    //Constructor
    public Rectangle(int width, int height){
      //first line of any constructor always call super!!
      //set the name to rectangle
      super("my rectangle");
      this.height = height;
      this.width = width;
    }

    @Override
    public void calculateArea(){
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name= " + name + '\'' +
                ", area=" + area +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
