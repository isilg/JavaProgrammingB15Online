package day11;

public class Switch {
    public static void main(String[] args) {

         String targetOption = "bd";

         switch (targetOption){
             case "bd" :
                 System.out.println("you turned on bedroom light");
                 break;
             case "lr" :
                 System.out.println("you turned on living room light");
                 break;
             case "ki" :
                 System.out.println("you turned on kitchen light");
                 break;
             case "ha" :
                 System.out.println("you turned on hallway light");
                 break;

             default:
                 System.out.println("wrong option");
         }

    }
}
