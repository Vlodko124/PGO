import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();

        Product p1 = new Product(1, "Laptop Tonka", "Laptop", 4999.99, 10);
        Product p2 = new Product(2, "Mouse Hern", "Mouse", 349.99, 30);
        Product p3 = new Product(3, "Monitor efsfzcds\"", "Monitor", 1299.99, 15);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Customer c1 = new Customer(1, "John", "Doe", "poop@butt.com", true);
        Customer c2 = new Customer(2, "Jane", "Doe", "fart@butt.com", false);
        store.addCustomer(c1);
        store.addCustomer(c2);

        List<Product> orderProducts1 = List.of(p1, p2);
        List<Integer> orderQuantities1 = List.of(1, 1);
        Order order1 = store.createOrder(c1, orderProducts1, orderQuantities1);
        order1.displayDetails();
        store.displayProductsInCategory("Laptop");
        store.displayProductsInCategory("Mouse");
        store.changeOrderStatus(order1.getId(), "Completed");
        order1.displayDetails();

        List<Product> orderProducts2 = List.of(p3, p2);
        List<Integer> orderQuantities2 = List.of(2, 1);
        Order order2 = store.createOrder(c2, orderProducts2, orderQuantities2);
        store.displayCustomerOrders(1);
    }
}
