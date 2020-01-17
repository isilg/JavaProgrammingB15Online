package day31;
public class Method_DailyRoutine {
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? Open it again!");
        System.out.println("------------------");
    }

    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button make your coffee");
        System.out.println("------------------");
    }
    public static void drinkCoffee(String other){
        System.out.println("This is a method that has same name w drinkCoffee() but has different parameter. Because 1 class cannot have 2 method that has same name and same parameter");
        System.out.println("Parameter is: "+other);
        System.out.println("-------------");
    }

    public  static void takeThemToSchool(){
        System.out.println("Take them to school bus");
        System.out.println("Say good bye!!");
        System.out.println("------------------");
    }

    public static void studyJava(){
        System.out.println("Think about Java waking up ");
        System.out.println("Think about Java drinking coffee ");
        System.out.println("Think about Java preparing kids for school ");
        System.out.println("Think about Java taking them to school");
        System.out.println("Eventually sit down and study Java, practice, practice!! ");
        System.out.println("Review last classes, come ready for the class ");
        System.out.println("------------------------- ");
    }

    public static void sayILoveJava300Times(){
        for (int i=1; i<=300; i++){
            System.out.print("I love Java");
        }
    }

    public static void finallyAwake(){
        //NOT CREATING A METHOD INSIDE A METHOD JUST CALLING OTHER METHODS
        wakeUp();
        drinkCoffee();
    }


    public static void main (String[] args){

        wakeUp();
        drinkCoffee();
        drinkCoffee("whatsThat");
        //takeThemToSchool();
        //studyJava();
        //sayILoveJava300Times();
        finallyAwake();
    }
}
