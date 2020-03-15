package day48;

public interface Bounceable {


    public static final double GRAVITY = 9.81;

  //every member of interface automatically public
  //if no access modifier is given methods with no body
  //they are automatically assigned -> public abstract
  // we can type just void bounce() it doesn't give error
   public abstract void bounce();

}
