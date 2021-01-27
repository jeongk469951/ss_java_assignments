package com.ss.jkim.day04.part1;


/**
 * @author jeongkim
 * Implementing double check locking.
 */

public class DoubleCheckedSingleton {

    //Used volatile to be more safe
    private static volatile DoubleCheckedSingleton instance;


    private DoubleCheckedSingleton(){
    }

    public static DoubleCheckedSingleton getInstance() {

        //Omly using lock when necessary to get better performance
        if(instance == null){
            synchronized (instance){
                instance = new DoubleCheckedSingleton();
            }
        }

        return instance;
    }

}
