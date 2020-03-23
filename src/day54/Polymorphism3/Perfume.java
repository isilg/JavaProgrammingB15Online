package day54.Polymorphism3;

public class Perfume implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("Wearing perfume!!");
    }
}
