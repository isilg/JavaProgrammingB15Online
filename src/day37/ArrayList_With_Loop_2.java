package day37;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_With_Loop_2 {
    public static void main(String[] args) {

       // Create a String ArrayList, add some names. Find the longest name
       List<String> names = new ArrayList<>();
       names.add("Alex");
       names.add("James");
       names.add("John");
       names.add("Liz");
       names.add("Barbara");
       names.add("Max");

       String longestName = names.get(0);
       for (int i=0; i<names.size(); i++){
           // Assuming first name is the longest one
           if ( names.get(i).length() > longestName.length()){
               longestName = names.get(i);
           }
       }
        System.out.println("Longest name: "+longestName);



        List<String> names2 = new ArrayList<>();
        names2.add("Alex");
        names2.add("James");
        names2.add("John");
        names2.add("Liz");
        names2.add("Barbara");
        names2.add("Max");
        names2.add("Charlie");

       // ********IF THERE ARE 2 NAMES THAT HAS SAME LENGTH.
       // EGER >= DERSEM INSTEAD OF > , IF REPLACES THE SECOND
       // SAME LENGTH NAME TO THE FIRST ONE. BARBARA VE CHARLIE HAS
       // SAME LENGTH. IF I USE > INSIDE IF. BARBARA WILL TURN IF I USE
       // >= SECOND LONGEST, CHARLIE, WILL TURN
        String longestName2 = names2.get(0);
        for (int i=0; i<names2.size(); i++){
            if ( names2.get(i).length() >= longestName2.length()  ) {
                longestName2 = names2.get(i);
            }
        }
        System.out.println("Longest name in list2: " +longestName2);


        System.out.println("\t");
        for (int i=0; i<names2.size(); i++){
            if(names2.get(i).length() == longestName2.length()){
                System.out.println("Longest names = " + names2.get(i));
            }

        }

        System.out.println("\t");
        // USE FOR EACH LOOP TO GO THROUGH EACH ITEM
        for( String each: names ){
            System.out.print(each+" ");
        }
    }
}
