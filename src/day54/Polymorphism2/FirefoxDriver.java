package day54.Polymorphism2;

public class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening FirefoxDriver Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url+ " using FirefoxDriver Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing FirefoxDriver Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FirefoxDriver Browser");
    }
}
