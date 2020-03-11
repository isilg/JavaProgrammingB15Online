package day44;
public class Person {

    private String name;
    private int age;
    // PersonAction class indaki 1 tane objeyi Human a atadim
    // diyelim. Digerlrine dokunmasamda species static old icin
    // butun object lere uygular ve hepsinin species i human olur
    // Static field belong to the class not any object
    public static String species;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
