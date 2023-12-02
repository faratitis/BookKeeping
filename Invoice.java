public class Invoice {
    private Transaction transaction;
    private Customer customer;

    public Invoice(Transaction transaction, Customer customer) {
        this.transaction = transaction;
        this.customer = customer;
    }
}
