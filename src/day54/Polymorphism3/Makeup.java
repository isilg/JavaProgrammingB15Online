package day54.Polymorphism3;

public class Makeup implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing makeup!!");
    }
}
