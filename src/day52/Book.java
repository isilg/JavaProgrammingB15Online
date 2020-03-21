package day52;

/**
 * Create an abstract class called Book -- fields: String name, String author   methods: abstract void method called displayBookInfo()
 * Add constructor to set all the fields
 * Concrete -->>
 *      PaperBook: fields: int weight  methods: implement abstract method ,  instance methods: read(), toString()
 *      AudioBook: field: double duration  methods: implement abstract method,  instance methods: listen(), toString()
 * Create an interface called KnowledgeBank -- methods: abstract method takeNote(), default method showTableOfContent()
 * Create another interface called Readable that PaperBook implements-- method: abstract method read()
 *
 * Create List<Book> add all your books , displayInfo on all of them find out how many paperbook is there
 *
 * PS: PaperBook and AudioBook extends Book and Book implements KnowledgeBank.
 *     PaperBook IS-A BOOK. PaperBook IS-A KnowledgeBank. PaperBook IS-A Readable
 *     AudioBook IS-A Book. AudioBook is not Readable
 *     BOOK IS-A KnowledgeBank
 */


//Short way to create sub class:
//Right click Book -> Show Context Action-->Implement Abstract Class -- give the sub class' name
public abstract class Book implements KnowledgeBank{

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();
}
