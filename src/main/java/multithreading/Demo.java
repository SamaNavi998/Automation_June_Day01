package multithreading;

public class Demo {

    public static void main(String[] arg) {

        BankAccount account1 = new BankAccount("Account01");
        BankAccount account2 = new BankAccount("Account02");

        DepositedThread t1 = new DepositedThread(account1);
        DepositedThread t2 = new DepositedThread(account2);

        DepositedRunnable r1 = new DepositedRunnable(account1);
        DepositedRunnable r2 = new DepositedRunnable(account2);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
