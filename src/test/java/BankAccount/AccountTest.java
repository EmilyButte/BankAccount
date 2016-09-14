package BankAccount;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/13/16.
 */
public class AccountTest {

    Account account = new Account();

    @Test
    public void getBalance() {
        double actualValue =  10.00;
        double expectedValue = account.Bob.getBalance(10.00);
        Assert.assertEquals("10.00", actualValue, expectedValue);
    }

    @Test
    pubic void getInterestRate() {
        double actualValue = ;
        double expectedValueValue = accoungt.Bob.interestRate;
        Assert.assertEquals("", actualValue, expectedValue);}

    public void setBalance(double balance) { this.balance = balance; }

    private void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }

    private void setAccountName(String accountName) { this.accountName = accountName; }

    private double withdraw() { return balance; }

    private double deposit () { return balance; }

    private double transfer(){ return balance; }
}
