import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        while (true) {
            System.out.println("\nChoose an operation: 1. Deposit  2. Withdraw  3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Exiting the banking system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
