package day48;

interface BoxerWithBellyPouch{

    public abstract void kickBox();

    public abstract void carryChildInThePocket();

    public default void read(){
        System.out.println("ONLY DEFAULT METHOD CAN HAVE BODY IN INTERFACE");
    }
    public static void study(){
        System.out.println("what r u studying?");
    }


    //If I BoxerWithBellyPouch extends Bounceable and
    // inherit void bounce method still I cannot write body
// @Override
// void bounce();

}
