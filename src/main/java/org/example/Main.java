package org.example;

public class Main {
    static int array[];

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");
        new ArrayThread().start();
        Thread.sleep(1000);
        new SummaThread().start();
        new AverageThread().start();
    }
}