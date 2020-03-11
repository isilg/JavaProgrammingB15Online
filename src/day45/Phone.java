package day45;

public class Phone extends Electronic{
    double size;
    double price;

    // How can I use size  and price -> create an object
    public static void main(String[] args) {

        Phone p1 = new Phone();  //created p1 object
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        System.out.println( Electronic.useElectricity );   //We can inherit useElectricity from parent class and reach this way
        System.out.println( Phone.useElectricity);         //Other way to reach useElectricity is this class name because we
                                                           //already inherit it and it is ours. How can we reach our static
                                                           //variable from main -> our_class_name.variable_name
       //How to call showBrand method() -> since it is non static method -> use an object to call it
        p1.showBrand();

        //How to call displayUseElectricity() -> since it is static method -> u can call it directly, just type its name
        displayUseElectricity();

    }
}
