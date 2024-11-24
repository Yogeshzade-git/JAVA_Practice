package Multithreading.Thread_Class;

public class MyClassMain {
    public static void main(String[] args) throws InterruptedException {
        MyClass myClass = new MyClass();
        MyClass2 myClass2 = new MyClass2();

        System.out.println(Thread.currentThread());
        myClass.start();
        myClass.join();
        myClass2.start();
;
    }
}
