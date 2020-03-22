package day54;

public class Dog extends Animal implements IndoorPet{
    String name;

    @Override
    public void speak() {
        System.out.println("Bark!!");
    }

    @Override
    public void play(){
        System.out.println("Running after the ball");
    }


}
