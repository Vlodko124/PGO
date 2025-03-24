public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    public Customer(int id, String firstName, String lastName, String email, boolean isLoyalCustomer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
    }

    public int getId() { return id; }
    public boolean isLoyalCustomer() { return isLoyalCustomer; }

    public void displayInfo() {
        System.out.println("Customer ID: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email + ", Loyal: " + isLoyalCustomer);
    }
}
