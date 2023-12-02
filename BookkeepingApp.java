import java.util.Scanner;

public class BookkeepingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Login as:\n1. Admin\n2. Customer\n3. Exit");
            int userType = scanner.nextInt();

            if (userType == 1) {
                Admin admin = loginAdmin(scanner, bank);
                adminMenu(scanner, admin);
            } else if (userType == 2) {
                Customer customer = loginCustomer(scanner, bank);
                customerMenu(scanner, customer);
            } else if (userType == 3) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static Admin loginAdmin(Scanner scanner, Bank bank) {
        System.out.println("Enter admin username:");
        String username = scanner.next();
        System.out.println("Enter admin password:");
        String password = scanner.next();
        return new Admin(username, password, bank);
    }

    private static Customer loginCustomer(Scanner scanner, Bank bank) {
        System.out.println("Enter customer username:");
        String username = scanner.next();
        System.out.println("Enter customer password:");
        String password = scanner.next();
        return new Customer(username, password, bank);
    }

    private static void adminMenu(Scanner scanner, Admin admin) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    admin.addCustomer();
                    break;
                case 2:
                    admin.viewAllCustomers();
                    break;
                case 3:
                    System.out.println("Exiting admin menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void customerMenu(Scanner scanner, Customer customer) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    customer.deposit();
                    break;
                case 2:
                    customer.withdraw();
                    break;
                case 3:
                    customer.transfer();
                    break;
                case 4:
                    customer.viewTransactions();
                    break;
                case 5:
                    System.out.println("Exiting customer menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

