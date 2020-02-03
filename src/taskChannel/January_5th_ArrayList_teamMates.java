package taskChannel;
import java.util.ArrayList;
import java.util.List;
public class January_5th_ArrayList_teamMates {
    public static void main(String[] args) {
        /**
         * Create Arraylist of String and store teamMates in ArrayList
         * print one by one
         * print reverse
         * print first and last
         * print 2 at a time
         * concat everyone in one string separated by -
         */

        // ArrayList<String> teamMates =  new ArrayList<>()
        List<String> teamMates =  new ArrayList<>();

        teamMates.add("Alex");
        teamMates.add("Max");
        teamMates.add("Coco");
        teamMates.add("Liz");
        teamMates.add("Mike");

        // print one by one
        // I. WAY:
        // for( String each : teamMates){
        //    System.out.println(each);
        // }

        //II.WAY
        for(int i= 0; i<teamMates.size(); i++){
            System.out.println( teamMates.get(i) );
        }

        System.out.println("\t");  //  \t : tab  \n: new line
        //print reverse
        for(int i= teamMates.size()-1; i>=0; i--){
            System.out.println( teamMates.get(i) );
        }

        System.out.println("\t");
        // print first and last
        System.out.println("First element= " + teamMates.get(0));
        System.out.println("Last Element= " + teamMates.get(teamMates.size()-1));


        System.out.println("\t");
        // print 2 at a time
        for(int i=0; i<=teamMates.size()-2; i++){
            System.out.println( teamMates.get(i)+ "-"+ teamMates.get(i+1) );
        }


        // concat everyone in one string separated by -


    }
}
