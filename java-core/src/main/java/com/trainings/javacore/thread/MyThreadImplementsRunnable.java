package com.trainings.javacore.thread;

/**
 * Created by jlising on 2/21/16.
 */
public class MyThreadImplementsRunnable implements Runnable{
    private Thread t;
    private String threadName;

    public MyThreadImplementsRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " +  threadName );
    }

    @Override
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start (){
        System.out.println("Starting " +  threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    public static void main(String args[]){
        MyThreadImplementsRunnable myThread1 = new MyThreadImplementsRunnable("Thread 1");
        MyThreadImplementsRunnable myThread2 = new MyThreadImplementsRunnable("Thread 2");

        myThread1.start();
        myThread2.start();
    }
}
