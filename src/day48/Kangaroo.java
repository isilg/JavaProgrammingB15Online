package day48;

public class Kangaroo implements Bounceable, BoxerWithBellyPouch{

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance){
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce(){
        System.out.println("This "+name+ " can jump "+jumpDistance+" meters");
    }
    public void eat(){
        System.out.println("Kangaroo with name "+name+" is eating");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBox(){
        System.out.println("Kangaroo with name "+name+" kickboxing");
    }

    public void carryChildInThePocket(){
        System.out.println("Kangaroo with name "+name+ " carrying her child in her pocket");
    }
}
