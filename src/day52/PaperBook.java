package day52;

public class PaperBook extends Book implements Readable{

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }


    public static void read(){
        System.out.println("I'm reading");
    }


    @Override
    public void displayBookInfo() {
        System.out.println("Paper book's name is: "+name+ ", its author is: "+author+", and its weight: "+weight+" pound");
    }

    @Override
    public void takeNote() {
        System.out.println("Bookmark and taking note "+ name);
    }


    @Override
    public void Read() {
        System.out.println("Reading the "+name+" written by "+author);
    }


    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
