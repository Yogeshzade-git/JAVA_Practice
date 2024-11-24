package Multithreading.Thread_Methods;

public class MyThreadYield extends Thread{

    public MyThreadYield(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            Thread.yield();  // this gives hints to scheduler to give chance to other thread also
        }
    }
    public static void main(String[] args) {
        MyThreadYield myThreadYield1 = new MyThreadYield("T1");
        MyThreadYield myThreadYield2 = new MyThreadYield("T2");
        myThreadYield1.start();
        myThreadYield2.start();
    }
}
