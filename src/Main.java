import Bridge.*;
import Command.BuyOrder;
import Command.SellOrder;
import Command.Stock;
import Command.StockBroker;
import Composite.CompositeAccount;
import Composite.DespositeAccount;
import Composite.SavingAccount;
import Adapter.IeDriver;
import Adapter.WebDriver;
import Adapter.WebDriverAdapter;
import Facade.WebExplorerHelperFacade;
import Factory.Vehicle;
import Factory.VehicleFactory;
import Observer.DeliverData;
import Observer.Seller;
import Observer.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("_________________________COMPOSITE DESIGN PATTERN_______________________________");

        //Composite
        CompositeAccount components = new CompositeAccount();

        components.addAccount(new DespositeAccount("d01",100));
        components.addAccount(new DespositeAccount("d02",200));
        components.addAccount(new SavingAccount("s01",150));
        float totalBalance = components.getBalance();
        System.out.println("total balance:"+ totalBalance);

        System.out.println("__________________________OBSERVER DESIGN PATTERN_______________________________");

        //Observer
        DeliverData deliverData = new DeliverData();

        Seller seller = new Seller();
        User user = new User();

        deliverData.register(seller);
        deliverData.register(user);
        deliverData.locationChanged();

        System.out.println("__________________________ADAPTER DESIGN PATTERN___________________________________");

        //Adapter
        WebDriver webDriver = new WebDriverAdapter(new IeDriver());
        webDriver.getElement();
        webDriver.selectElement();

        System.out.println("__________________________FACTORY DESIGN PATTERN________________________________");
        //Factory
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        System.out.println("__________________________FACADE DESIGN PATTERN________________________________");
        //FACADE
        String test = "CheckElementPresent";
        WebExplorerHelperFacade.generateReports("firefox","html",test);

        System.out.println("__________________________COMMAND DESIGN PATTERN________________________________");

        Stock stock = new Stock();
        BuyOrder buyOrder = new BuyOrder(stock);
        SellOrder sellOrder = new SellOrder(stock);

        StockBroker stockBroker = new StockBroker();

        stockBroker.placeOrder(buyOrder);
        stockBroker.placeOrder(sellOrder);

        stockBroker.executeOrders();

        System.out.println("__________________________Bridge DESIGN PATTERN________________________________");

        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}