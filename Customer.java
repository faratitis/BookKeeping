import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Bank bank;
    private List<Transaction> transactions;

    public Customer(String username, String password, Bank bank) {
        super(username, password);
        this.bank = bank;
        this.transactions = new ArrayList<>();
    }

    public void deposit() {
        // Logic for deposit
        System.out.println("Depositing money.");
    }

    public void withdraw() {
        // Logic for withdraw
        System.out.println("Withdrawing money.");
    }

    public void transfer() {
        // Logic for transfer
        System.out.println("Transferring money.");
    }

    public void viewTransactions() {
        // Logic to view transactions
        System.out.println("Viewing transactions.");
    }

    // Implement other customer-specific methods
}
