package Multithreading.Synchronization.FairnessLockExample;

public class Main {
    public static void main(String[] args) {
        FairnessExample fairnessExample = new FairnessExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairnessExample.accessResource();
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
