package day54.Polymorphism3;
public class Main {

    public static void main(String[] args) {

        //try all the polymorphic assignment according to these relationship

        Clothes c1 = new Clothes();    //Clothes implements Wearable
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();

        wearMyWearable(w1);  //In compile time wear method in Wearable is called, in run time Clothes object call Clothes's wear() method
        System.out.println("---------------");

        Watch wa = new Watch();  //Watch implements Wearable
        Wearable w2 = new Watch();
        Object o2 = new Watch();

        wearMyWearable(w2);
        wearMyWearable(wa);    //Watch implements Wearable so it doesn't give error
        //wearMyWearable(o2);  Error, need casting
        System.out.println("---------------");

        Perfume p1 = new Perfume();
        Wearable w3 = new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3 = new Perfume();

        wearMyWearable(p1);   //Perfume implements Wearable, Cosmetics
        wearMyWearable(w3);
        //wearMyWearable(c2);  error, casting needed. Cosmetic Interface & Wearable Interface are not related
        System.out.println("----------------");

        Makeup m1 = new Makeup();     //Makeup implements Wearable, Cosmetics
        Wearable w4 = new Makeup();
        Cosmetics c3 = new Makeup();
        Object o4 = new Makeup();

        wearMyWearable(m1);
        wearMyWearable(w4);

        System.out.println("--------");

        wearMyWearable( new Watch() );    //{Wearable w = new Watch(); return w;}


        Wearable result = getMyWearable();
        System.out.println(result.getClass().getSimpleName());  // RETURNS CLOTHES. return new Watch(); -> RETURNS Watch

    }



    //I did static to be able to call this method directly from main()
    public static void wearMyWearable(Wearable any){
        any.wear();
    }


    //Create a static method called getMyWearable, returning a Wearable object (or anything IS-A Wearable)
    //Don't try to do each line at the same time cause after the first return method will stop and the rest of the code won't be reached
    public static Wearable getMyWearable(){
        return new Clothes();      //Returning directly new Clothes object!! I.WAY: {Wearable w = new Clothes(); return w;}
        //return new Watch();      // I can return anything IS-A Wearable
        //return new Perfume();
        //return new Makeup();
    }


}
