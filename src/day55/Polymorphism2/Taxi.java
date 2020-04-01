package day55.Polymorphism2;

public class Taxi {

    int plateNumber;
    Engine eng;    //taxi has engine and its type is Engine. Engine is a data type for my instance variable(for my field). As long as there is a class it can be a data type. Also it can be a method parameter type, method return type
    Driver dr;     //taxi has driver and its type is Driver

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Number=" + plateNumber +
                ", Engine=" + eng.toString() +
                ", Driver=" + dr.toString() +
                '}';
    }
}
