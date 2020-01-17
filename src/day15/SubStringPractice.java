package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        String movie = "Lord Of The Ring" ;
        
        //Remove 'Of' from movie
        
        String wordOf = movie.substring(5,7);   //7 excluded
        System.out.println("wordOf = " + wordOf);


        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);


        //Get from second word. till last word.  How do I know 2nd word?
        //2nd word starts right after the first space
        int startingPoint = movie.indexOf(" ")+1;  //space den hemen sonra basliyo 2. kelime
        int endingPoint = movie.length();
        System.out.println("secon word till last:  " + movie.substring(startingPoint,endingPoint));


        String secondWordsTillLast = movie.substring(5,16);  //16 is excluded so 15 is the last character. If I type 15 I lost last character since 15 won't be included
        System.out.println("secondWordsTillLast = " + secondWordsTillLast);


        String secondToLast = movie.substring(5);  //it means start from 5 and end at the last character
        System.out.println("secondToLast = " + secondToLast);


        //Reverse Lord of the ring to Ring Of the Lord
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);

        System.out.println(wordRing+wordOfThe+wordLord);


        //Print Ring Of The Java Lord
        System.out.println(wordRing+wordOfThe+"Java " +wordLord);  //I added Java
    }
}
