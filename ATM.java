public class ATM {
    private double balance;

    // Constructor
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal amount exceeds balance or is invalid.");
        }
    }

    public static void main(String[] args) {
        // Create an ATM instance with an initial balance
        ATM atm = new ATM(1000.0);

        // Simulate some operations
        atm.checkBalance();     // Check initial balance
        atm.deposit(200.0);     // Deposit money
        atm.withdraw(150.0);    // Withdraw money
        atm.checkBalance();      // Check balance after transactions
        atm.withdraw(1200.0);   // Attempt to withdraw more than balance
        atm.deposit(-50.0);     // Attempt to deposit negative amount
    }
}
