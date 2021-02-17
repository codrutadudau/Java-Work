package com.company;

public interface Horn {
    default void blowHorn() {
        System.out.println("Blowing horn!");
    }
}
