package day49;

//building super-sub relationship
public class Burger implements Edible, Juicy{

    //constructor
//    public Burger(){
//        super();
//    }

    //IF YOU OVERRIDE A METHOD YOU CANNOT MAKE IT
    //LESS VISIBLE. IF WE DELETE PUBLIC HERE IT
    //BECOMES DEFAULT AND LESS VISIBLE GIVES ERROR
    @Override
    public void eat() {
        System.out.println("Eating burger");
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea");
    }

    @Override
    public void melt() {
        System.out.println("Cheese is melting inside the burger");
    }
}
