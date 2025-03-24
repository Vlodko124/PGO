import java.util.List;

public class Order {
    private int id;
    public Customer customer;
    public List<Product> products;
    public List<Integer> quantities;
    private String orderDate;
    private String status;

    public Order(int id, Customer customer, List<Product> products, List<Integer> quantities, String orderDate, String status) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getId() { return id; }
    public void setStatus(String status) { this.status = status; }

    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }
        return customer.isLoyalCustomer() ? total * 0.9 : total;
    }

    public void displayDetails() {
        System.out.println("Order ID: " + id + ", Customer: " + customer.getId() + ", Status: " + status + ", Total: " + calculateTotalValue());
    }
}
