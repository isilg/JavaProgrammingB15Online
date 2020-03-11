package day41;
public class TvDemo {
    public static void main(String[] args) {
        TV t1= new TV();
        t1.brand="Sony";
        System.out.println("t1: "+t1);

        t1.turnOn();
        t1.setCurrentChanel(12);    // en son t1.turnOff(); deyip bunu yazarsak
                                    // chanel 0 olur cunku tv off. Chanel i set
                                    // yapacaksan tv yi on yapman gerek
        t1.setCurrentChanel(121);
        System.out.println(t1.getCurrentChanel());
        t1.turnOff();
        System.out.println("t1= "+t1.toString());
    }


}
