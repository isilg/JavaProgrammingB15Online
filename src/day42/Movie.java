package day42;

public class Movie {

    private String name;
    private double length;
    private String genre;

    //Create a constructor
    public Movie(){
        System.out.println("Empty Movie");
    }


    //Write another constructor to set all the fields value
    public Movie(String name, double length, String genre){
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }




    // Create toString() Method

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
