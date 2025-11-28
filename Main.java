public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.createOrder("Order-101", 5, 299.99);
        service.listOrders();
    }
}