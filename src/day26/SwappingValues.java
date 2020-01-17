package day26;

public class SwappingValues {
    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        //name 1 should be Jason, name 2 should be Emma
        //Create a temporaray variable

        String tempContainer = name1;   //name1 => emma
        name1 = name2;                  //name1 => Jason
        name2 = tempContainer;          //name2=>Emma

        System.out.println("name 1: " +name1);
        System.out.println("name 2: " +name2);



    }

}
