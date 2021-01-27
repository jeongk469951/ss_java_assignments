package com.ss.jkim.day04.part1;

// Java program to implement solution of producer
// consumer problem.

import java.util.ArrayList;


public class ProduceComsumeMain {

    private static ProduceConsume pc = new ProduceConsume();


    public static void main(String[] args)
            throws InterruptedException
    {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }


    private static class Thread1 extends Thread {
        public void run() {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}