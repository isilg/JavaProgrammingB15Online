package day45;

//If we don't explicitly(visible, manually) extends another class
//we always automatically extends Object class.
//Object class is super class of all the classes in Java
//It is not an object we create, it is a class called Object in Java
public class Book  extends Object{


    public static void main(String[] args) {

        Book b1 = new Book();
        System.out.println(b1.toString());
    }

    //we get this method(toString()) from Object class parent and rewriting it -> doing Overriding
    public String toString(){
        return "my own version of toString";  //this method is been called by b1, at line 13
    }

}
