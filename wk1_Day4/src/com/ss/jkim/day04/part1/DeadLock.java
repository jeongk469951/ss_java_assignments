package com.ss.jkim.day04.part1;


/**
 * @author Jeong Kim
 * Example of deadlock
 */
public class DeadLock {

    private static int[] Lock1 = {1,2,3};
    private static int[] Lock2 = {1,2,3};

    //runs two threads
    public static void main(String args[]) {

        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();

        T1.start();
        T2.start();
        System.out.println("Ended");
    }

    //Thread1 which starts with lock1
    private static class Thread1 extends Thread {
        public void run() {

            try {
                synchronized (Lock1) {
                    System.out.println("lock 1");

                    Thread.sleep(1000);

                    System.out.println("waiting");

                    synchronized (Lock2) {
                        System.out.println("lock 2");
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    //Thread2 which starts with lock2
    private static class Thread2 extends Thread {
        public void run() {

            try {
                synchronized (Lock1) {
                    System.out.println("lock 1");

                    Thread.sleep(1000);

                    System.out.println("waiting");

                    synchronized (Lock2) {
                        System.out.println("lock 2");
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
