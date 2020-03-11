package day43;
import day42.Movie;
public class MovieAction {
    public static void main(String[] args) {

        // m1 is an object, Movie is data type. m1 is the address of Joker, 2.5, Drama
        Movie m1 = new Movie("Joker", 2.5, "Drama");
        printMovieInformation(m1);

        System.out.println("\t");
        Movie m2 = new Movie("Cindrella", 1.5, "Family");
        printMovieInformation(m2);

        System.out.println("\t");
        printShorterDurationMovieName(m1, m2);

        System.out.println("\t");
        Movie result = getJokerMovieObject();
        System.out.println("Name is "+result.getName());

        System.out.println("\t");
        printMovieNameCharacters(m1);
        printMovieNameCharacters(m2);

        System.out.println("\t");
        System.out.println( isMovieLengthMoreThan2Hours(m1) );
        System.out.println( isMovieLengthMoreThan2Hours(m2) );

        System.out.println("\t");
        System.out.println(isFamilyMovie(m1));
        System.out.println(isFamilyMovie(m2));

        System.out.println("\t");
        System.out.println( getCombinedMovieInfo(m1) );



    }



    public static void printMovieInformation(Movie movieObj) {
        System.out.println("The movie name: " + movieObj.getName());
        System.out.println("The movie is: " + movieObj.getLength() + " hour long");
        System.out.println("and it genre is: " + movieObj.getGenre());
    }


    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2 ){
         if(movieObj1.getLength() < movieObj2.getLength()){
             System.out.println(movieObj1.getName());
         }else{
             System.out.println(movieObj2.getName());
         }
    }

    // Create a static method that return movie object with name Joker, 2.5 hour, and type Drama
    public static Movie getJokerMovieObject(){

        // Movie:data type  j:name of variable(pointer to your object)
        Movie j = new Movie("Joker", 2.5, "Drama");
        return j;
    }

    // Print movie name all uppercase
    public  static  void printMovieNameCharacters(Movie movieObj){
        System.out.println(movieObj.getName().toUpperCase());
    }

    // Return true if the movie's length is more than 2 hours otherwise return false
    public static boolean isMovieLengthMoreThan2Hours(Movie movieObj){
        if (movieObj.getLength() > 2){
            return true;
        }else
            return false;
    }

    public static boolean isFamilyMovie(Movie movieObj){
        if (movieObj.getGenre().equals("Family")){
            return true;
        }else
            return false;
    }


    // return Joker-2.5-Drama
    public static String getCombinedMovieInfo(Movie movieObj){
        String combinedResult="";
        combinedResult += movieObj.getName()+"-";
        combinedResult += movieObj.getLength()+"-";
        combinedResult += movieObj.getGenre();
        return  combinedResult;

    }



}

