package com.company;

public class SimpleSingleton {
    static SimpleSingleton object = new SimpleSingleton();

    private SimpleSingleton() {}//don't allow users to create any new instances

    public static SimpleSingleton getInstance() {
        return object;
    }

}
