package BankAccount;

/**
 * Created by emilybutte on 9/13/16.
 */
public class App {
    public static void main(String[] args) {

        Account bob = new Account("SAVINGS", 0123456789);
        bob.userName = "Bob";
        bob.balance = 10.00;
        bob.interestRate = 0.03;
        bob.accountStatus = "OPEN";
        bob.overdraftProtectionOption = "ENABLED";

        Account sue = new Account("CHECKING", 9876543210);
        sue.userName = "Sue";
        sue.balance = 350.00;
        sue.interestRate = 0.01;
        sue.accountStatus = "FROZEN";
        sue.overdraftProtectionOption = "DISABLED";
    }
}

