package Multithreading.Synchronization.BankExample;

public class MyThread extends BankAccount{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //bankAccount.withdrawMoney(50);
                bankAccount.withdrawMoneyWithLock(50);
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
    }
}
