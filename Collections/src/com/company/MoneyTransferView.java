package com.company;

import java.util.*;

public class MoneyTransferView {
    public void printInfo(String ownerName, int accNumber, double balance) {
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    public void printTransaction(ArrayList<String> arrayList, LinkedList<String> linkedList, Map<String, String> mapList, Vector<String> vectorList, Set<String> setList) {
        System.out.println("Transactions between:");
        System.out.println("Array List: " + arrayList);
        System.out.println("Linked List: " + linkedList);
        System.out.println("Map: " + mapList);
        System.out.println("Vector: " + vectorList);
        System.out.println("Set List: " + setList);
    }
}
