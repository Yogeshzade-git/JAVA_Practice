package Multithreading.Synchronization;

public class Counter {
    private int count=0; //Shared Resource

    public synchronized void incrementCount(){  // Achieved mutual exclusion via 'synchronized' keyword
        count++;  //Critical Section
    }

    public void incrementCount2(){
        synchronized (this){   // When we don't want to make entire method synchronized that time we uses synchronized block
            count++;
        }
    }

    public int displayCount(){
        return count;
    }
}
