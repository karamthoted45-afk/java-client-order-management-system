import java.util.ArrayList;

public class OrderService {
    private ArrayList<Order> orders = new ArrayList<>();

    public void createOrder(String id, int qty, double price) {
        Order o = new Order(id, qty, price);
        orders.add(o);
        System.out.println("Order Created: " + o);
    }

    public void listOrders() {
        System.out.println("All Orders:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}