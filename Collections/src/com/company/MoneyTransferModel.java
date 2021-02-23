package com.company;

import java.util.*;

public class MoneyTransferModel {
    private String owner;
    private int accNumber;
    private double balance;
    private ArrayList<String> arrayList;
    private LinkedList<String> linkedList;
    private Map<String, String> mapList;
    private Vector<String> vectorList;
    private Set<String> setList;


    public MoneyTransferModel() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
        this.mapList = new HashMap<>();
        this.vectorList = new Vector<>();
        this.setList = new HashSet<>();
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public void setMapList(Map<String, String> mapList) {
        this.mapList = mapList;
    }

    public void setVectorList(Vector<String> vectorList) {
        this.vectorList = vectorList;
    }

    public void setSetList(Set<String> setList) {
        this.setList = setList;
    }

    public Map<String, String> getMapList() {
        return mapList;
    }

    public Vector<String> getVectorList() {
        return vectorList;
    }

    public Set<String> getSetList() {
        return setList;
    }

}
