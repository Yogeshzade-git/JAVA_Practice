package Multithreading.Synchronization.BankExample;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdrawMoneyWithLock(int amount){
        System.out.println(Thread.currentThread().getName() + " Trying to perform withdrawal");
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    System.out.println(Thread.currentThread().getName() + " withdrawing money");
                    try{
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawed "+ amount + " balance is " + balance);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "Withdrawal failed due insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not able acquire the lock, will try later ");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }


    //Problem with synchronized keyword ->
    // if current accessible thread is stuck due to an problem like db not responding,
    // resulting that thread never came out of synchronized block result into another thread unable to do there work ->
    // to resolve this we need to apply some constraint like timeout for each thread we can achieve this by Explicit Lock
    public synchronized void withdrawMoney(int amount){
        System.out.println(Thread.currentThread().getName() + " Trying to perform withdrawal");
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " withdrawing money");
            try{
                Thread.sleep(30000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrawed "+ amount + " balance is " + balance);
        }else{
            System.out.println(Thread.currentThread().getName() + "Withdrawal failed due insufficient balance");
        }
    }
}


