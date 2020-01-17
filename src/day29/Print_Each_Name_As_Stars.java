package day29;

public class Print_Each_Name_As_Stars {
    public static void main(String[] args) {

        //PRINT EACH NAME AS STARS  EX/Superman-**********
        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeroes){
            String[] heroSplitted = eachHero.split("-");
            String heroAlias = heroSplitted[0];
            String fullName = heroSplitted[1];
            String stars = "";
            for(int i=1; i<=fullName.length(); i++){
                stars += "*";
            }

            String heroX = eachHero.replace(fullName, stars);
            System.out.println("hero = "+eachHero);
            System.out.println("heroX= "+heroX);

        }

    }
}
