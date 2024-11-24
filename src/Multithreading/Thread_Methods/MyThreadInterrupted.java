package Multithreading.Thread_Methods;

public class MyThreadInterrupted extends Thread {
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.println("After 5 seconds -> Hello Yogesh");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyThreadInterrupted myThread = new MyThreadInterrupted();
        myThread.start();
        myThread.interrupt();   // it will interrupt the execution of myThread Thread.
    }
}
