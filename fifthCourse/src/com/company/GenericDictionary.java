package com.company;

import java.util.HashMap;
import java.util.Map;

public class GenericDictionary {
    String key;
    Object value;
    private Map<String, Object> dictionary = new HashMap<>();

    public GenericDictionary(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void Add() {
        for (Map.Entry<String, Object> entry : dictionary.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
        }
    }

    public String toString() {
        return this.key + ": " + this.value;
    }
}
