package day49;

//Interface specify behaviors that classes must implement
public interface Edible {

    //constant field. Make the name all uppercase
    //In interface fields are automatically assigned public static final if not defined so
    public static final boolean IS_HUMAN_FOOD= true;


    //Methods are automatically assigned public abstract
    public abstract void eat();
    public abstract void drink();


    //If I add this method after implements classes , classes will give error
    //because every method in interface has to be override by class(es)
    //If I implement 10 classes from this interface will I go each of them
    //and implement this method? -> No need to if you describe your method
    //as default. !Default method has its own body
       //public default void digestion();


    public default void digest(){
        System.out.println("You implement the code if you want");
    }

}
