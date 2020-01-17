package day29;
public class Print_Stars_Instead_Of_String_Name {
    public static void main(String[] args) {

        String hero1= "Superman-Clark J Kent";

        //TASK: Print hero1 like Superman-**********

        String[] heroSplitted = hero1.split("-");
        String heroAlias = heroSplitted[0];
        String fullName = heroSplitted[1];

        //I GENERATE AS MANY STAR AS THE LENGTH OF THE NAME
        int nameCharCount =  fullName.length();
        String stars = "";
        for (int i=0; i<nameCharCount; i++){    //for (int i=0; i<hero1.split("-")[1].length(); i++)
            stars = stars + "*";        //stars += "*"
        }
        System.out.println("hero1= "+ hero1);
        System.out.println("heroX= "+ heroAlias+"-"+stars);

        System.out.println("\n");
        //TASK: WRITE SAME CODE BY USING REPLACE METHOD

        String stars1="";
        for (int i=1; i<=fullName.length(); i++){
                stars1 += "*";
        }
        String heroX = hero1.replace(fullName, stars1);  //hero1.replace(heroSplitted[1], stars1)
        System.out.println("hero1= "+ hero1);
        System.out.println("heroX= "+ heroX);
        }
}
