package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add_Item_Unmodifiable_List {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");
        superHeros.add("Wonder Woman");

        List<String> superHeroCopy = new ArrayList<>( superHeros );
        System.out.println(superHeroCopy);

       // ***THIS WILL CREATE AN UNMODIFIABLE LIST!! **
        List<String > topics = Arrays.asList("Java","Selenium", "Database", "API");
        System.out.println("topics list = " +topics);

        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("Copy of topics list= "+ topicsCopy);
    }
}
