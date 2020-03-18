package day51;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {

        //Create Person objects. Since we are in the same folder
        //and Person class is public we can reach it
        Person p1 = new Person("Katie", 34);
        Person p2 = new Person("Max", 18);
        Person p3 = new Person("Asena", 18);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        //Provide Person object directly
        System.out.println(p1.compareTo(new Person("John Snow", 27)));

        //2.way to provide Person object directly
        int result = p1.compareTo(new Person("John Snow", 27));
        System.out.println(result);

        //Print out the name of the younger person between p1 and p3
        if ( p1.compareTo(p3)==1 ){  //Method returns 1 if this.age>otherPerson.age
            System.out.println(p3.name);
        }else
            System.out.println(p1.name);


        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add( new Person("John",27));
        System.out.println(list);


        //Sorting according to the first character of the names
        Collections.sort((list));
        System.out.println(list);
    }
}
