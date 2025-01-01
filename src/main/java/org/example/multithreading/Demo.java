package org.example.multithreading;

public class Demo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            System.out.println("run method");
        }
    }

    public static void main(String[] args) {
        Demo t=new Demo();
        t.start();
        for (int i=1;i<=10;i++)
        {
            System.out.println("main thread");
        }
    }
}

