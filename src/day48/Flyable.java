package day48;

//interface is abstract type just like abstract class
//no object can be created from it
//it provide guideline for implementing classes
public interface Flyable {

    //an interface can only have public static final field
    public static final boolean HAVE_WING = true;

    //Can we have constructor? : NO!!

    public abstract void fly();
}
