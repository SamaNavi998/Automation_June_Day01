package multithreading;

public class BankAccount {
    private String accountName;
    private int amount;

    public BankAccount(String accountName) {
        this.accountName = accountName;
    }
    public synchronized void depositMoney(int depositAmount){
        amount +=depositAmount;
        System.out.println(Thread.currentThread().getName()+" deposited "+depositAmount+" to "+accountName+".");
        System.out.println("Current balance is :"+amount);
    }

}
