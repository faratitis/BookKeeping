import java.util.List;

public class Admin extends User {
    private Bank bank;

    public Admin(String username, String password, Bank bank) {
        super(username, password);
        this.bank = bank;
    }

    public void addCustomer() {
        // Logic to add a customer
        System.out.println("Adding a customer.");
    }

    public void viewAllCustomers() {
        // Logic to view all customers
        List<Customer> customers = bank.getCustomers();
        System.out.println("\nAll Customers:");
        for (Customer customer : customers) {
            System.out.println(customer.username);
        }
    }

    // Implement other admin-specific methods
}
