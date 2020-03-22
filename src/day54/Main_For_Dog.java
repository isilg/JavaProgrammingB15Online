package day54;
public class Main_For_Dog {

    public static void main(String[] args) {

    //Refer a dog object as Dog-> it can reach everything inside Dog, Animal, and IndoorPet
        Dog d1 = new Dog();

        System.out.println(d1.name);
        d1.speak();
        d1.play();


  //Refer a dog object as Animal->it can reach everything inside Animal & IndoorPet
      Animal a1 = new Dog();
      a1.speak();  //AT COMPILE TIME->IT CALLS SPEAK() METHOD IN ANIMAL BUT IN THE RUN
                   //TIME IT CALLS THE OBJECT. a1 NOT OBJECT IT HOLDS ADDRESS.
                   //DOG->OBJECT, AND IT REACHES SPEAK METHOD INSIDE DOG CLASS
                   //In the run time object decides which method
        Animal a2 = d1; //same as above code -> d1=new Dog; -> Animal a2 =new Dog;
        a2.speak();


     //Refer a dog object as Object-> it can do only things Object can do like toString(), hashCode
        Object o1 = new Dog();

        Object o2 = d1;



//Refer a dog object as IndoorPet-> it can reach inside IndoorPet
        IndoorPet p1 = new Dog();

        IndoorPet p2 = d1;


    }



}
