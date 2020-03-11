package day45;

public class Planet {

    //Create static/non-static variables first
    double gravity;
    int radius;
    boolean hasLife;

    public Planet(){

    }

    //Create constructor
    public Planet(double gravity, int radius, boolean hasLife){
        this.gravity = gravity;
        this.radius = radius;
        this.hasLife = hasLife;
        System.out.println("Crazy Change");
    }

}
