package Adapter;

public class ChromeDriver implements  WebDriver{


    @Override
    public void getElement() {
        System.out.println("Get element from chromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from chromeDriver");
    }
}
