package day45;

//As long as we type extends it gives error because we didn't write
//constructor to Planet. So we are going to Planet and typing a constructor
public class Earth extends Planet {

    int population;

    //Create constructor -> right click -> Generate -> Constructor
    //!!!***IF YOU CREATE CONSTRUCTOR LIKE THAT, YOU WILL CREATE A SHORT WAY
    //OF PARENT CLASS. BELOW CODE MEANS -> super(gravity, radius, hasLife)
    //IF YOU DO IT FROM GENERATE AND IT YOU'LL DO SOME CHANGES IN PARENT'S
    //CONSTRUCTOR, YOU WON'T GET THE CHANGES SO CREATE THE CONSTRUCTOR WITH
    //SUPER KEYWORD
//    public Earth(double gravity, int radius, boolean hasLife, int population) {
//        super(gravity, radius, hasLife);
//        this.population = population;
//    }
    public Earth(double gravity, int radius, boolean hasLife, int population) {
      super(gravity, radius, hasLife); //when Java see this line it calls
                                       //parent'sconstructor, print System.out.println("Crazy Change");
                                      //inside that constructor then continue with the code down below (this.population=population; )
      this.population=population;  //adding my field here so I wont need another
                                   //constructor just for my field like ->
                                   //public Earth(int population){ this.population = population; }
    }

    public static void main(String[] args) {
        Earth e1 = new Earth(9.81,5000,true,100000);
        System.out.println("e1= "+e1);
    }

    //Add toString method to print out object -> right click ->generate->toString()
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
