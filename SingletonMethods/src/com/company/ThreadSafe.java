package com.company;

public class ThreadSafe {
    static ThreadSafe object;

    private ThreadSafe() {}//don't allow users to create any new instances

    synchronized public static ThreadSafe getInstance() {
        if(object == null){
            object = new ThreadSafe();
        }
        return object;
    }
}
