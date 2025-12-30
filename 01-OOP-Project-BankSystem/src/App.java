import com.bank.account.SavingsAccount;
import com.bank.account.CurrentAccount;
import com.bank.customer.Customer;
import com.bank.customer.CustomerManager;
import com.bank.transaction.Transaction;
import com.bank.transaction.TransactionManager;

public class App {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        TransactionManager transactionManager = new TransactionManager();

        // Create Customers
        Customer c1 = new Customer("C001", "Alice");
        Customer c2 = new Customer("C002", "Bob");
        Customer c3 = new Customer("C003", "Alex");


        // Add Accounts
        c1.addAccount(new SavingsAccount("S001", 5000, 5));
        c2.addAccount(new CurrentAccount("C001", 2000, 1000));
        c3.addAccount(new CurrentAccount("C002", 5000, 1000));


        customerManager.addCustomer(c1);
        customerManager.addCustomer(c2);
        customerManager.addCustomer(c3);


        // Transactions
        SavingsAccount aliceAcc = (SavingsAccount) c1.getAccounts().get(0);
        aliceAcc.deposit(500);
        transactionManager.addTransaction(new Transaction(aliceAcc.getAccountNumber(), 500, "Deposit"));

        CurrentAccount bobAcc = (CurrentAccount) c2.getAccounts().get(0);
        bobAcc.withdraw(2500);
        transactionManager.addTransaction(new Transaction(bobAcc.getAccountNumber(), 2500, "Withdraw"));

        // List
        customerManager.listCustomers();
        transactionManager.listTransactions();
    }
}
