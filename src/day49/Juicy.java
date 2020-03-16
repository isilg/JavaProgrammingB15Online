package day49;

public interface Juicy {

    public abstract void melt();

    //Another type of method interface has is static method. It HAS BODY
    //and does not belong to any class. It CANNOT BE INHERITED!!
    public static void squeeze(){
        System.out.println("static squeezing");
    }




}
