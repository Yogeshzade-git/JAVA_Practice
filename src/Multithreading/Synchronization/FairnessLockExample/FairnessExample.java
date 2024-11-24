package Multithreading.Synchronization.FairnessLockExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessExample {
    private final Lock lock = new ReentrantLock(true);   // by passing true arg in ReentrantLock constructor will make it Fair lock

    public void accessResource(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Acquired Lock");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " Released Lock");
            lock.unlock();
        }

    }
}
