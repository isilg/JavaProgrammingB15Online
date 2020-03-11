package day45;

public class Electronic {

    String brand;                              //instance field
    static boolean useElectricity = true;     //static field

    public void showBrand(){
        System.out.println("brand= "+brand);
    }

    public static void displayUseElectricity(){
        System.out.println("Calling useElectricity static field "+useElectricity);
    }
}
