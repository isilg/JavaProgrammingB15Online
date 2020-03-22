package day54.Polymorphism2;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Running Chrome Browser---");
        WebDriver c1 = new ChromeDriver();  // You have a -> WebDriver reference and ChromeDriver Object
        c1.openBrowser();
        c1.navigateTo("www.amazon.com");
        c1.maximize();
        c1.closeBrowser();



        System.out.println("\n-----Running Firefox Browser-----");
        c1 = new FirefoxDriver();
        c1.openBrowser();
        c1.navigateTo("www.amazon.com");
        c1.maximize();
        c1.closeBrowser();


    }
}
