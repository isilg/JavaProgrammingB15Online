package day51;

//Class -> implements -> Interface
//Interface -> extends -> Interface
//Class -> extends -> Class

public class Drone implements UprightFlyable{

    @Override
    public void FlyUpright() {
        System.out.println("Flying upright");
    }

    @Override
    public void fly() {
        System.out.println("Flying regularly");
    }
}
