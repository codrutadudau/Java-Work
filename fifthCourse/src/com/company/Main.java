package com.company;

public class Main {
    public static void main(String[] args) {

        GenericArrayClass<Integer> gac = new GenericArrayClass<>(Integer.class, 5);

        gac.add(1);
        gac.add(2);
        gac.add(3);
        gac.add(4);
        gac.add(5);
        System.out.println("STACK");
        System.out.println(" ");
        System.out.println("Check if the stack is empty: " + gac.isEmpty());
        System.out.println("Print the stack: ");
        gac.list();
        System.out.println("Get the last element in the stack: " + gac.get());
        System.out.println("Delete the last inserted element: " + gac.remove());
        System.out.println("Delete the last inserted element: " + gac.remove());
        System.out.println("Get the last element in the stack: " + gac.get());
        gac.list();
        System.out.println(" ");
        System.out.println("FIFO");
        System.out.println(" ");
        GenericArrayFIFOClass<Integer> gfc = new GenericArrayFIFOClass<>(Integer.class, 5);
        gfc.add(1);
        gfc.add(2);
        gfc.add(3);
        gfc.add(4);
        gfc.add(5);
        System.out.println("Check if the queue is empty: " + gfc.isEmpty());
        System.out.println("Print the queue: ");
        gfc.list();
        System.out.println("Get the first element in the queue: " + gfc.get());
        System.out.println("Delete the first inserted element: " + gfc.remove());
        System.out.println("Get the first element in the queue: " + gfc.get());
        gfc.list();
        GenericDictionary dict = new GenericDictionary("Ana", 1);
        GenericDictionary dict1 = new GenericDictionary("Ana", 2);
        GenericDictionary dict2 = new GenericDictionary("Ana", -3);
        dict.Add();
        dict1.Add();
        dict2.Add();
        System.out.println(dict + ", " + dict1 + ", " + dict2);

    }
}
