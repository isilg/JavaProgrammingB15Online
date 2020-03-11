package day45;

public class Fruit {

    //ALWAYS ADD NO ARG CONSTRUCTOR IN SUPER CLASS.
    //IF THERE IS NO CONSTRUCTOR IN PARENT CLASS->NO ERROR.
    //BUT IF THERE IS CONSTRUCTOR WITH ARGUMENT AND NO CONSTRUCTOR
    //WITHOUT ARGUMENT-> JAVA WILL LOOK FOR THE NO ARGUMENT ONE AND
    //IF IT WONT SEE IT, IT WILL GIVE ERROR
    public Fruit(){    //Fruit class constructor
       System.out.println("No arg Fruit constructor message");
  }

    public Fruit(String str){
        System.out.println("One arg Fruit constructor");
    }


}
