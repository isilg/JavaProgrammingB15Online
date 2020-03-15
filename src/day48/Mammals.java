package day48;

//Mammal is extending abstract super class Animal
//And it is another abstract class itself
public abstract class Mammals extends Animal {

  //If subclass of an abstract class is also abstract, it doesn't
  //required to provide a body for abstract method. You can
  //provide body but not required. If teh method isn't abstract
  //you have to provide a body
      public abstract void makeNoise(); //->Comes from parent
      public abstract void drinkMilk();
}
