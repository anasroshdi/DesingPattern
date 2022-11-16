package Command;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

    private List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order){
        orders.add(order);
    }

    public void executeOrders(){

        for (Order order: orders) {
            order.execute();
        }
        orders.clear();
    }
}


