public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Johnny", 1000.00);
        
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
