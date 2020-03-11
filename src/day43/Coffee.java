package day43;
public class Coffee {
    private String type;
    private int caffeineLevel;
    private double price;


    // Create constructor
    public Coffee(){
        System.out.println("No arg constructor");
    }

    // Another constructor with parameters.
    // Right click - >Generate ->Constructor -> Choose the parameteres you want->  Click Enter
        public Coffee(String type, int caffeineLevel){
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor");
    }


    // Right click -> Constructor -> Choose parameters
    // IntellJ Constructor i create ettikten sonra if leri ekle
        public Coffee(String type, int caffeineLevel, double price) {
             this.type = type;
             this.caffeineLevel = caffeineLevel;
//              if(price>0){
//                  this.price = price;
//             }else {
//                 this.price = 1;
//             }
       // We already have a code to do above logic in setter
       // So we can call the method directly to avoid duplication
       // ****** YOU CAN CALL ANY METHODS OF SAME CLASS IN CONSTRUCTOR ****
            setPrice(price);
    }


    // Create toString() method
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }else {
            this.price = 1;
        }
    }
}
