package day40;
public class SpaceShip {
       /** Create a class called SpaceShip
        *  it has 4 attributes :
           name as String
           currentDirection as String   | EAST, WEST, NORTH, SOUTH
           xCordinate as int
           yCordinate as int

        few behaviours :
          setInitialPosition- accept 2 int parameters
               to provide initial position of spaceship
          setDirection void method
              accept 1 String parameter to set the direction to either up, down, right, left
          move1Block - accept no parameters
              and change the position according to the direction, move the spaceship to 1 block according to the current direction
          toString method
              return String representation of Spaceship Object

        5*5 KARELER DUSUN X-Y DUZLEMINDE. X:1 Y:1 OLAN NOKTADA CISIM DURUYO.
        DOGU DEYINCE 1 KARE SAGA GELIR X:2 Y:1 OLUR. KUZEY DEYINCE 1 KARE YUKARI GELIR X:2,Y:2
        */

       String name;
       String currentDirection;
       int x;
       int y;

       public void setInitialPosition(int newX, int newY){
           x = newX;
           y = newY;
       }

       public void setDirection(String newDirection){
           // If u accept valid value which are only up, down,right, and left then assign newDirection to currentDirection
           // ***ELSE TEKI currentDirection ="";  YAZMAZSAM =>
           //                   INITIAL CURRENT LOCATION IN VARSA YANI INVALID LOCATION DAN
           //                   ONCE BIR LOCATION GIRMISSEN 2.LOCATION I NOT VALID GIRSENDE INVALID MESAJI GELIYOR HEMEN ARDINDAN
           //                   ILK MOVE NEYSE O YONDE ARTMA VE AZALTMA YAPIYOR. EGER ILK MOVE INVALID ISE SADECE INVALID MESAJI VERIR****

           if( newDirection.equalsIgnoreCase("up")   ||
               newDirection.equalsIgnoreCase("down") ||
               newDirection.equalsIgnoreCase("right")||
               newDirection.equalsIgnoreCase("left") ) {

               currentDirection = newDirection;
           }else {
               System.out.println("Invalid Direction");
               currentDirection = "";    // we set the direction to empty value if user pass wrong direction.
                                         // So if the given direction is not valid, it will not move!
           }
       }

       public void move1Block(){      // Shows new x and y coordinate
           // switch kullanarak karar ver eger yukari gidersen Y artarmi azalirmi, asagi
           // gidersen Y nasil degisir, saga ve sola gidersen X nasil degisir

           switch (currentDirection){
               case "right":
                   x+=1;
                   break;
               case "left":
                   x-=1;
                   break;
               case "up":
                   y+=1;
                   break;
               case "down":
                   y-=1;
                   break;
           }

       }


       // setDirection(String newDirection) methoduyla 1 move haraket edebiliyordu up, down, right, or left
       // move1Block(String newDirection) methodu yazip setDirection(String newDirection) Instance Method unu
       // cagirarak arka arkaya istedigimiz kadar move yaptirabiliriz
        public void move1Block(String newDirection){
       // we are using the functionality we already have to set the direction
       // *****WE CAN CALL INSTANCE METHOD INSIDE ANOTHER INSTANCE METHOD***
            setDirection(newDirection);
            move1Block();
        }




       // *********toString METHODU AUTOMATIC OLARAK YAZDIRMAK ICIN:  RIGHT CLICK TO INTELLJ => GENERATE => toString =>ENTER
      @Override
      public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}

