package Multithreading.Runnable_Interface;

public class MyClass extends MyClass2 implements Runnable {
    @Override
    public void run(){
        Thread.currentThread().setName("MyClass1");
        for (int i=0; i<100; i++){
            System.out.println("Current Thread" + Thread.currentThread().getName() + "Hello buddy!");
            greet();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
