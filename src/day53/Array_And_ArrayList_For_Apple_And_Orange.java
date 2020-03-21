package day53;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_And_ArrayList_For_Apple_And_Orange {
    public static void main(String[] args) {

        Fruit f1 = new Apple("very sweet", "pinkish red", "Pink Lady");
        Fruit f2 = new Apple("crispy", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("sweet", "Blood red", 10);

        Fruit[] myFruit = {f1, f2, f3, f4};

        for (Fruit each : myFruit) {
            each.getDigest();
        }

        Fruit f5= new Orange("sweet", "Blood red", 10);

        //It is not resizeable, adding and removing won't work, anything else works
        List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);


      //It will compile but will give Exception Error!!!...
          //fruitList.add(f5);
          //System.out.println(fruitList);

      //*****Create regular list if you wanna add or remove item!!!!!.......*****
        List<Fruit> myFruitList =  new ArrayList<>(Arrays.asList(f1, f2, f3, f4));

        for ( Fruit each: myFruitList ){
            System.out.println( each.toString() );
            System.out.println(each.getClass().getSimpleName());
        }

    }
}
