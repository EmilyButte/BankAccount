package BankAccount;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by emilybutte on 9/13/16.
 */

@Getter
@Setter
public class Account {

    String userName;
    String accountName;
    String accountType;
    long accountNumber;
    double balance;
    double interestRate;
    String accountStatus;
    String overdraftProtectionOption;

    public enum AccountType {CHECKING, SAVINGS, INVESTMENT}
    public enum AccountStatus {OPEN, CLOSED, FROZEN}
    public enum OverdraftProtectionOptions {ENABLED, DISABLED, AUTOTRANSFER}

    private Account(String accountType, long accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    // ADD A METHOD TO ACCESS ALL THE INFO BELOW AT ONCE? ACCOUNT

    private double getBalance() { return balance; }

    public double getInterestRate() { return interestRate; }

    public void setBalance(double balance) { this.balance = balance; }

    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }

    public void setAccountName(String accountName) { this.accountName = accountName; }

    public double withdraw() { return balance; }

    public double deposit () { return balance; }

    public double transfer(){ return balance; }
}