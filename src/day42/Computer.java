package day42;

public class Computer {

    /**
     *  attributes:
     *          brand, ram(1-128), price(more than $20)
     *  behavior:
     *          runProgram --> print: brand is running program with the ram(size). Ex/ Apple is running program with the ram 128
     *          calculate  --> print: brand is calculating
     *          getters and setters
     *          toString()
     */


    private String brand;
    private int ram;
    private double price;


    public void runProgram(){
        System.out.println(this.brand+ " is running with the ram size "+ram);  //brand or this.brand and ram or this.ram
    }

    public void calculate(){
        System.out.println(brand+ " is calculating");
    }

    //Right click->Generate->Getter and Setter-> choose all of them and hit Enter


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        // we have a condition for the ram so we should write here
        if(ram>=1 && ram<=128) {
            this.ram = ram;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>20) {
            this.price = price;
        }
    }

    // Right click ->Generate->toString
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
