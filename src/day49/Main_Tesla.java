package day49;

public class Main_Tesla {

    public static void main(String[] args) {
        Tesla t1 = new Tesla(2020, 460, "Cyber Truck");
        t1.start();
        t1.selfDrive();
        t1.charge();
        t1.goForward();

        System.out.println("t1= "+t1);
    }
}
