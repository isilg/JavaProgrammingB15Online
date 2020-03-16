package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable{

    int horsePower;
    String model;

    //year coming from Vehicle
    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla model "+model+ " self driving!!");
    }

    @Override
    public void start() {
        System.out.println("Tesla model "+model+ " start with electricity");
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
