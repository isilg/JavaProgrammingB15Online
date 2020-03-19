package day51;

public class Main_Dog_And_Horse {
    public static void main(String[] args) {

        //Instantiate : creating an object of a specific class
        //Dog d1 = new Dog();

        // Instantiating a1 object
        //We are referring Dog object using Animal reference type
        //a1 ->is an address of Animal type object, it isn't an object itself
        //Animal -> reference type of a1
        Animal a1 = new Dog();
        a1.makeNoise();

        //If I type  a1 = new Horse();
        //I cut the tie between a1 and dog
        //now a1 is pointing the Horse
             a1 = new Horse();
             a1.makeNoise();

             Animal a2 = new Horse();
             a2.makeNoise();

             Dog d1 = new Dog();
             Animal a3 = d1;
             a3.makeNoise();
    }
}
