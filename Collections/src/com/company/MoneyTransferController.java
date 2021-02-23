package com.company;

import java.util.*;

public class MoneyTransferController implements MoneyTransferInterface {
    private MoneyTransferModel model;
    private MoneyTransferView view;

    private double balance;

    ArrayList<String> newArrayList = new ArrayList<>();
    LinkedList<String> newLinkedList = new LinkedList<>();
    Map<String, String> newMapList = new HashMap<>();
    Vector<String> newVectorList = new Vector<>();
    Set<String> newSetList = new HashSet<>();

    public MoneyTransferController(MoneyTransferModel model, MoneyTransferView view) {
        this.model = model;
        this.view = view;
    }

    public void setOwnerName(String name) {
        model.setOwner(name);
    }

    public String getName() {
        return model.getOwner();
    }

    public void setAccNumber(int accNumber) {
        model.setAccNumber(accNumber);
    }

    public int getAccNumber() {
        return model.getAccNumber();
    }

    public void setBalance(double balance) {
        model.setBalance(balance);
    }

    public double getBalance() {
        return model.getBalance();
    }

    public void setArrayList(ArrayList<String> arrayList) {
        model.setArrayList(arrayList);
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        model.setLinkedList(linkedList);
    }

    public void setMapList(Map<String, String> mapList) {
        model.setMapList(mapList);
    }

    public void setVectorList(Vector<String> vectorList) {
        model.setVectorList(vectorList);
    }

    public void setSetList(Set<String> setList) {
        model.setSetList(setList);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount is invalid! Please try again or contact your bank!");
            System.out.println(getAccNumber() + ": " + amount);
        } else {
            balance = getBalance();
            setBalance(balance + amount);
            System.out.println("The transaction was successful! Your balance after deposit:" + "\n" + getAccNumber() + ": " + getBalance());
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdraw amount is invalid! Please try again or contact your bank!");
            System.out.println(getAccNumber() + " " + amount);
        } else {
            if (amount > getBalance()) {
                System.out.println("Error: Insufficient funds|");
                System.out.println(getAccNumber() + " " + amount);
            } else {
                balance = getBalance();
                setBalance(balance - amount);
                System.out.println("The transaction was successful! Your balance after deposit: " + "\n" + getAccNumber() + ": " + getBalance());
            }
        }
    }

    @Override
    public void transfer(MoneyTransferController from, MoneyTransferController to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);

        newArrayList.add(from.getName() + " si " + to.getName() + " : " + amount + " lei");
        setArrayList(newArrayList);

        newLinkedList.add(from.getName() + " si " + to.getName() + " : " + amount + " lei");
        setLinkedList(newLinkedList);

        newMapList.put(from.getName() + " si " + to.getName(), amount + " lei");
        setMapList(newMapList);

        newVectorList.add(from.getName() + " si " + to.getName() + " : " + amount + " lei");
        setVectorList(newVectorList);

        newSetList.add(from.getName() + " si " + to.getName() + " : " + amount + " lei");
        setSetList(newSetList);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof String)) {
                return false;
            }
        }
        String ifEquals = (String) obj;
        return ifEquals.equals(ifEquals);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void iterateThroughCollections() {
        System.out.println("");
        System.out.println("ArrayList");
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(newArrayList.get(i));
        }
        if (newArrayList.get(0).equals(newArrayList.get(1))) {
            System.out.println("This two transactions are equal!");
        } else {
            System.out.println("This two transactions are not equal!");
        }
        newArrayList.remove(0);
        System.out.println(newArrayList.get(0));
        System.out.println("");
        System.out.println("LinkedList");
        for (Iterator it = newLinkedList.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        newLinkedList.removeLast();
        System.out.println(newLinkedList);
        System.out.println("");
        System.out.println("MapList");
        for (Map.Entry<String, String> entry : newMapList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public void updateView() {
        view.printInfo(model.getOwner(), model.getAccNumber(), model.getBalance());
    }

    public void updateViewCollections() {
        view.printTransaction(model.getArrayList(), model.getLinkedList(), model.getMapList(), model.getVectorList(), model.getSetList());
    }
}
