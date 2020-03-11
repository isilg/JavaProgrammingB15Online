package day38;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class addAll_Method {
    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple","Salmon");
        System.out.println("groceries= "+ groceries);

        ArrayList<String> newList = new ArrayList<>(groceries);
        newList.add("Diet coke");
        newList.add("Sugar");

        System.out.println("new list is: "+ newList);

        // ADD SOME MORE ITEM; PASTA, BRANZINI, ASPARAGUS, SPINACH
        List<String> newItemsToAdd = Arrays.asList("Pasta","Branzini","Asparagus","Spinach");

        // Add one list to the another list
        // We want to add all items inside newItemsToAdd to newList
        // addAll method accepts collection that is any kind of type data
        newList.addAll(newItemsToAdd);

        // ASAGIDAKI GIBI DIYEMEDIGIMIZ ICIN .addAll kullandik. newList CREATED ALREADY ERROR VERIYOR
        // ArrayList<String > newList = new ArrayList<>(newItemsToAdd);

        System.out.println("new list with all items: " +newList);

    }
}
