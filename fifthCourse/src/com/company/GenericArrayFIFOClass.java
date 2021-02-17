package com.company;

import java.lang.reflect.Array;

public class GenericArrayFIFOClass<E> implements GenericFIFO<E> {
    private E elements[];
    private int first, last;
    private int size = 0;

    public GenericArrayFIFOClass(Class<E> element, int size) {
        first = 0;
        last = -1;
        this.size = size;
        elements = (E[]) Array.newInstance(element, size);
    }

    @Override
    public void add(E e) {
        if (last == size - 1) {
            int j = 0;
            for (int i = first; i < last; i++) {
                elements[j++] = elements[i];
            }
        }
        elements[++last] = e;
        size++;
    }

    @Override
    public E remove() {
        E saved = elements[first];
        elements[first] = null;
        first++;
        size--;
        return saved;
    }

    @Override
    public E get() {

        return elements[first];
    }

    @Override
    public void list() {
        for (E i : elements) {
            System.out.println(i);
        }

    }

    @Override
    public boolean isEmpty() {
        return (last == -1);
    }
}
