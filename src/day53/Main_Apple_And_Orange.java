package day53;
public class Main_Apple_And_Orange {

    public static void main(String[] args) {
        //*******HOW MANY OBJECT YOU HAVE? --- LOOK AT THE NEW KYWRD & IF U HAVE ANY METHOD RETURNS
        // THIS THIS KIND OF THIS, COUNT THEM ALSO. U MIGHT HAVE A METHOD THAT RETURN STRING ******

        Apple a1 = new Apple("sweet","red","Fuji");

        System.out.println("a1's taste= "+a1.taste);
        System.out.println("a1's color= "+a1.color);
        System.out.println("a1's type= "+a1.type);

        a1.getDigest();
        
        System.out.println("---------------");

        Fruit f1 = a1;

        Fruit f2 = new Apple("crispy","hot red","Gala");
        Fruit f3 = new Orange("sour","orange", 12);
        Fruit f4 = new Orange("sweet","Blood red",10);

        System.out.println( f1.color );
        System.out.println(f1.taste);

        //If Fruit doesn't have getDigest() below line will give error cause
        //f1's reference type is Fruit and we can reach what Fruit has not Apple
        f1.getDigest();

        //we cut Apple f1 tie by reassigning f1
        f1 = new Orange("sour", "reddish", 5);
        f1.getDigest();
        System.out.println(f1.toString());

        System.out.println( f2.toString() ); //toString() comes from Object class,Fruit doesn't have it but this is why we don't get hash code

    }
}


