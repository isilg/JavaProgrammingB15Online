package day53;

//Right click to Fruit -> Show Context Action ->Create subclass  and call it Apple do it one more time and call it Orange
public abstract class Fruit {

    String taste;
    String color;

    public Fruit( String taste, String color){
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigest();


}
