package day51;
public class Person implements Comparable<Person>{

    //Create 2 fields name and age
    String name;
    int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    //Compare p1 and p2 by age. If p1 is older print 1
    //if they r same age print 0 , other wise print -1
    //We'll call this method from PersonComparing class
    //to compare 2 people's age. If I use p1.age > p2.age
    //It'll give error p1 ve p2 objects are created in
    //PersonComparing class. So what can I use-> this kywrd
    //and other parameter I created as arg to my method
    //it always return 1, -1, and 0. It is conventional
    @Override
    public int compareTo(Person otherPerson) {
        //Comparing by age
//         if (this.age > otherPerson.age) {
//            return 1;
//        } else if (this.age < otherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//       }

     //Comparing by name (first character)
     //this.name.charAt(0) > otherPerson.name.charAt(0) -> ASCII Code,
     //whoever comes first has less number let's say we have 2 character
     //a and c -> a has lower ascii code so a comes before. Let's say z and c
     //c has lower ascii code c comes before(think like regular alphabet)
        if (this.name.charAt(0) > otherPerson.name.charAt(0)) {
            return 1;  //how to get 2nd character ->charAt(0)
                       //Last character -> this.name.length()-1
        } else if (this.name.charAt(0) < otherPerson.name.charAt(0)) {
            return -1;
        } else {
            return 0;
        }
    }



    //toString() Method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
