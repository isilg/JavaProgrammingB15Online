package day40;
public class SpaceBattle {
    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();
        s1.name = "Orville";
        s1.setInitialPosition(1,5);   // Current Location
        s1.setDirection("up");   // It is moving up
        s1.move1Block();         // Shows new x and y coordinate
        System.out.println(s1);  // no need to use toString(). We already have that method
                                 // so IntelliJ automatically call it. If u don't have it then return hash code

        s1.setDirection("ABC");
        s1.move1Block();

        System.out.println(s1);

        s1.move1Block("up");      // en son x=1 y=6 daydi up giderse x=1 y=7
        s1.move1Block("right");   // x=2 y=7
        s1.move1Block("up");      // x=2 y=8
        s1.move1Block("up");      // x=2 y=9
        s1.move1Block("down");    // x=2 y=8
        s1.move1Block("Home");    // invalid direction so it stays at the last position where it was which is x=2, y=8

        System.out.println("s1 making more than 1 move and turning home(where it was) but home is invalid direction: "+s1);
    }
}
