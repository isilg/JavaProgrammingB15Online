package day53;

//create methods -> displayFruit(), digestBetter()-accepts a Fruit as
//parameter type, and inside the method, it will digest the Fruit
//object 4 times then displayInformation, getMyFavoriteFruit(),
//static method called GetFavoriteByType- has one int parameter,
//returns favorite apple object if type is 1, orange object if type 2
public class FruitShopUtility {
    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f2);


        System.out.println("-----------------");
        //Can we directly pass any object rather than saving it into a variable
        displayFruit(new Apple("sweet", "green", "Fuji"));

        //THERE IS NO 3 ARG, WHOLE THING IS 1 OBJECT
        digestBetter(new Orange("sweet", "light orange", 10));


        System.out.println("_________--------_________");
        //to call getMyFavoriteFruit() what x's type should be?-> Fruit, Why? ->method's type is Fruit
        Fruit x = getMyFavoriteFruit();
        x.getDigest();
        System.out.println("My favorite fruit: " + x);


        getFavoriteByType(1);
        getFavoriteByType(2);
        getFavoriteByType(3);



    }

    //just displaying Fruit, not returning anything so make it void
    //I want to call it directly from main->do it static(calling from another
    //class: Class_Name.method_name).Someone could call this method and pass an argument
    public static void displayFruit(Fruit anyFruit) {
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }


    public static void digestBetter(Fruit anyFruit) {
        for (int i = 0; i < 4; i++) {
            anyFruit.getDigest();
        }
        System.out.println(anyFruit);
    }


    //RETURN TYPE IS FRUIT CAUSE WE RETURN f, ITS TYPE IS FRUIT
    public static Fruit getMyFavoriteFruit() {
        //Fruit f = new Orange("crispy", "green", 100);
        //return f;
        return new Orange("crispy", "green", 100);
    }

    //BE CAREFUL RETURN TYPE
    public static Fruit getFavoriteByType(int num) {
        if (num == 1) {
            return new Apple("crispy", "hot red", "Gala");
        } else if (num == 2) {
            return new Orange("sour", "orange", 12);
     //we can return null for any method that return reference type
     //because null can be assigned to a reference type variable
        } else {
            return null;
        }

    }
}
