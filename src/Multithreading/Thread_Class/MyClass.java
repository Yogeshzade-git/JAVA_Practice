package Multithreading.Thread_Class;

public class MyClass extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setName("MyClass1");
        for (int i=0; i<100; i++){
            System.out.println("Current Thread" + Thread.currentThread().getName() + "Hello buddy!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
