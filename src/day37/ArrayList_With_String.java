package day37;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_With_String {
    public static void main(String[] args) {
        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");
        superHeros.add("Wonder Woman");

        // REMOVE ANY HEROES THAT DOES NOT HAVE MAN IN THEIR NAMES
        // AS ITEMS GET REMOVED, INDEXES ARE SHIFT(ITEM EKSILINCE INDEX LER DEGISIYOR)
        // TO STAY IN THE SAME INDEX WE DO --i;
        for (int i=0; i<superHeros.size(); i++){
            if(superHeros.get(i).contains("man")){
                superHeros.remove(superHeros.get(i));
                --i;
            }
        }
        System.out.println(superHeros);


        System.out.println("Super Heros list = " + superHeros);

        // DO WE HAVE SUPERMAN IN THE LIST
        System.out.println("Do we have Superman in the list?: "+ superHeros.contains("Superman"));

        // DO WE HAVE MAN IN THE LIST? -->>  IT LOOKS EXACT SAME ITEM. THERE IS NO MAN.
        // LAST IS ITEMS THAT LAST SYLLABLE IS MAN BUT NOT THE EXACT ITEM
        System.out.println("Do we have man in the list? : "+superHeros.contains("man"));

    }
}
