package Multithreading.Thread_Methods;

public class MyThreadSetDaemon extends Thread{

/*    EXPLANATION:- Technically program should never stop because of infinite loop, but as we set myThreadSetDaemon1.setDaemon(true); that's why
    JVM will not wait for that thread to complete there work as it is marked as Daemon thread*/

    public MyThreadSetDaemon(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) {
        MyThreadSetDaemon myThreadSetDaemon1 = new MyThreadSetDaemon("T1");
        myThreadSetDaemon1.setDaemon(true);   // gives hint to jvm that it is background thread and no need to wait for this while termination
        myThreadSetDaemon1.start();
        System.out.println("Main Done");
    }
}
