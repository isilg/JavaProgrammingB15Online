package day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        String[] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow" , "Super Girl" };

        System.out.println("Show Count = "+shows.length);
        for (int i = 0; i < shows.length; i++) {
            String currentShow = shows[i];
            //System.out.println("currentShow = " + currentShow);
              System.out.println( currentShow + " has character count: "+ currentShow.length() );
        }

        System.out.println();
        for (int i=0 ; i<shows.length; i++){
            System.out.println(shows[i] +" has character count : "+shows[i].length());
        }

    }
}
