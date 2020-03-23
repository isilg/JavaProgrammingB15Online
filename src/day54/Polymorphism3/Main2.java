package day54.Polymorphism3;
import java.util.List;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        Wearable w2 = new Makeup();
        Wearable w3 = new Watch();
        Wearable w4 = new Perfume();

        //Store these objects  -> ArrayList is a way. Im not adding or removing any item beside the below ones so Im using Arrays.asList
        List<Wearable> myWear = Arrays.asList(w1, w2, w3, w4);

        for(Wearable each : myWear){
            each.wear();
        }


    }
}
