package com.company;

public class Main {

    public static void main(String[] args) {
            SimpleSingleton object1 = SimpleSingleton.getInstance();
            SimpleSingleton object2 = SimpleSingleton.getInstance();
            ThreadSafe object = ThreadSafe.getInstance();
    }
}
