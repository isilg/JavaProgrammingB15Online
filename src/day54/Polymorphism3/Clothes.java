package day54.Polymorphism3;

public class Clothes implements Wearable {

    int size;


    @Override
    public void wear() {
        System.out.println("Wearing clothes!!");
    }
}
