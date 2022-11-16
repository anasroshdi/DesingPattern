package Adapter;

public class WebDriverAdapter implements WebDriver{

    IeDriver ieDriver;

    public WebDriverAdapter(IeDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}
