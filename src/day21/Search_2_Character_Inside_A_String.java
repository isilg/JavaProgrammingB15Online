package day21;

public class Search_2_Character_Inside_A_String {
    public static void main(String[] args) {


        //Perform this action until I reach the character before last character
        //because last chance to get 2 characters is ->right before last character
        //name.length() =12 ,  last index=11 ise son 2 index 10 ve 11
        //FORMULA GIBI OGREN, 2 SERLI CHARACTER ARIYORSAN LENGTH-2
        //SEARCH "UN"
        String name = "Isil Avunduk";

        for(int i=0; i<name.length()-2; i++){
            String current2Chars = name.substring(i,i+2); //son dongu: (10,12) 12 dahil degil 10 ve 11. character ler alincak
            if (current2Chars.equalsIgnoreCase("un")) {
                System.out.println("The index of \"un\" is: "+ i);
            }
        }

    }
}
