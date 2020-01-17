package day29;
public class SplitMethod {
    public static void main(String[] args) {

        //AFTER USING SPLIT TO A STRING WE GET STRING ARRAYS. THIS IS WHY WE ASSIGNED
        //hero1.split("-") TO AN ARRAY
        //RULE:  whole string is split and returned in the form of a string array.

        String hero1 = "Superman-Clark J Kent";

        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];




//        int nameCharCount = fullName.length();
//        String stars = "";
//        for (int i = 0; i < nameCharCount; i++) {
//
//            stars = stars + "*"; //  stars += "*";
//
//        }
//        System.out.println(fullName);
//        System.out.println(stars);

        //String heroX = hero1.replace(heroSplitted[1], stars);
//        System.out.println("hero1 = " + hero1);
//        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));



    }
}
