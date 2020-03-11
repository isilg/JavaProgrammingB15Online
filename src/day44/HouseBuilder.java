package day44;
public class HouseBuilder {
    public static void main(String[] args) {

        //CyberHouse.neighborhoodName = "Brooklyn";
        CyberHouse.showNeighborhoodName();

        CyberHouse c1 = new CyberHouse("Vintage", 101);
        c1.showAllInfo();

        CyberHouse c2 = new CyberHouse("Classic",102);
        c2.showAllInfo();

        System.out.println(CyberHouse.neighborhoodName);
        // If I make  'static String neighborhoodName'  private, it gives error
        // because we cannot reach private


    }
}
