package day54.Polymorphism1;

import day54.Polymorphism1.Animal;
import day54.Polymorphism1.IndoorPet;

public class Dog extends Animal implements IndoorPet {
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
