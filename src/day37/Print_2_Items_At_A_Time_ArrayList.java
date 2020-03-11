package day37;
import java.util.ArrayList;
import java.util.List;
public class Print_2_Items_At_A_Time_ArrayList {
    public static void main(String[] args) {

        List<String> teamMates = new ArrayList<>();
        teamMates.add("Alex");
        teamMates.add("Max");
        teamMates.add("John");
        teamMates.add("Mike");
        teamMates.add("Liz");
        teamMates.add("Coco");

        // grouping 2 items a time -->> teamMates.size()-2 is second from last
        // this one and the last one is gonna be one group so Im going
        // till teamMates.size()-2
        // if u wanna group 3 at a time -->> teamMates.size()-3
        for (int i=0; i<=teamMates.size()-2; i++){
            System.out.println( teamMates.get(i)+ "-"+ teamMates.get(i+1) );
        }

        System.out.println("\t");
        // If you dont wanna get item 1-2, 2-3, 3-4..
        // If you wanna get -> 1-2, 3-4 ....
        for(int i=0; i<=teamMates.size()-2; i+=2){
            System.out.println( teamMates.get(i)+ "-"+ teamMates.get(i+1) );
        }


    }
}
