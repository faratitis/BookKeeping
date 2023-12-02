import java.util.List;

public class NotificationService {
    private List<Customer> customers;

    public NotificationService(List<Customer> customers) {
        this.customers = customers;
    }

    public void sendNotification(Customer customer, String message) {
        if (customers.contains(customer)) {
            System.out.println("Sending notification to " + customer.username + ": " + message);
        } else {
            System.out.println("Failed to send notification. Customer not found.");
        }
    }
}
