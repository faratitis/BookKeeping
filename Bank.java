import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private List<Admin> admins;

    public Bank() {
        this.customers = new ArrayList<>();
        this.admins = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Admin> getAdmins() {
        return admins;
    }
}
