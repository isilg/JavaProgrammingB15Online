package day43;
import java.util.Arrays;
import java.util.List;
public class PetStore {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        System.out.println("p1= "+p1);
        p1.speak();
        p1.setType("cow");
        p1.speak();
        System.out.println("------");


        Pet p2 = new Pet("horse", "Walter");

        Pet p3 = new Pet("cat", "Samantha");

        Pet p4 = new Pet("dog", "Oliver");

        List<Pet> myPets = Arrays.asList(p1,p2,p3,p4);
        System.out.println("myPets= "+myPets);

        for ( Pet each: myPets){
            System.out.println("each.getName() = " + each.getName());
            each.speak();
        }

        System.out.println("-----------");
        // Print only cats
        for (Pet each : myPets){
            if ( each.getType().equalsIgnoreCase("cat") ){
                System.out.println( "Cat name is: "+each.getName() );
            }
        }
    }
}
