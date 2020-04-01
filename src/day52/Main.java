package day52;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Book b1 = new PaperBook("Java", "Akbar",3);
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 3);

        b1.displayBookInfo();
        System.out.println("b1 object type: "+ b1.getClass().getSimpleName());

        KnowledgeBank kb = b1;
        kb.takeNote();
        kb.showTableOfContent();

        System.out.println("-------------");

        PaperBook p1 = new PaperBook("Agile", "Guljannat", 1);
        b1.showTableOfContent();
        b1.displayBookInfo();
        System.out.println(b1);

        System.out.println("-------------");


        List<Book> bookList = Arrays.asList(p1,b2,b3);

        int pCount = 0;
        int aCount = 0;
        for (Book each : bookList){
            //each.displayBookInfo();
            System.out.println( each.getClass().getSimpleName() );   //it comes from Object class
            if (each.getClass().getSimpleName().equals("PaperBook")){
                ++pCount;
            }else
                ++aCount;
        }
        System.out.println("Number of paper book is: "+pCount+ ", number of audio book is: "+aCount);





    }
}
