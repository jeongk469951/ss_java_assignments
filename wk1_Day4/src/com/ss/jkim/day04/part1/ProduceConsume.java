package com.ss.jkim.day04.part1;

import java.util.ArrayList;


/**
 * @author Jeong Kim
 * Implements program
 * with one thread (the producer) that produces items (in this case simple int's). Another thread (the consumer) consumes items.
 *
 */


public class ProduceConsume {



    ArrayList<Integer> list = new ArrayList<>();
    int capacity = 10;


    // Function called by producer thread
    public void produce() throws InterruptedException
    {
        int value = 1;
        while (true) {
            synchronized (this)
            {

                // waits if list is full
                while (list.size() == capacity)
                    wait();

                System.out.println("Produced "
                        + value);

                //insert value in arraylist
                list.add(value++);

                // notify consumer thread
                notify();


                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {

                // waits if list is empty
                while (list.size() == 0)
                    wait();

                // to retrive the ifrst job in the list
                int val = list.remove(0);

                System.out.println("Consumed "
                        + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}

