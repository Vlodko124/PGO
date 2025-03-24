import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private List<Product> products = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private int orderCount = 0;

    public void addProduct(Product product) { products.add(product); }
    public void addCustomer(Customer customer) { customers.add(customer); }

    public Order createOrder(Customer customer, List<Product> products, List<Integer> quantities) {
        Order order = new Order(++orderCount, customer, products, quantities, "2025-03-24", "New");
        orders.add(order);
        updateStockAfterOrder(order);
        return order;
    }

    public void updateStockAfterOrder(Order order) {
        for (int i = 0; i < order.products.size(); i++) {
            Product product = order.products.get(i);
            int newStock = product.getStockQuantity() - order.quantities.get(i);
            product.setStockQuantity(newStock);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                order.setStatus(newStatus);
                break;
            }
        }
    }

    public void displayProductsInCategory(String category) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayInfo();
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        for (Order order : orders) {
            if (order.customer.getId() == customerId) {
                order.displayDetails();
            }
        }
    }
}
