package Multithreading.Runnable_Interface;

public class Main {
    public static void main(String[] args) {
         MyClass myClass = new MyClass();
         Thread t1 = new Thread(myClass);

         t1.start();
    }
}
