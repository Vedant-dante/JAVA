package Assignment9;

class Account {

    final long accountNumber;
    String accountHolder;
    double balance;

    Account(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    final void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Account account = new Account(
            1234567890,
            "Rahul",
            50000
        );

        account.displayAccountDetails();
    }
}