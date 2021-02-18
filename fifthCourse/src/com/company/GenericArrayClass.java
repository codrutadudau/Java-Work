package com.company;

import java.lang.reflect.Array;
import java.util.Objects;

public class GenericArrayClass<E> implements GenericStack<E> {
    private E elements[];
    private int size;
    private int top = -1;

    public GenericArrayClass(Class<E> element, int size) {
        this.size = size;
        elements = (E[]) Array.newInstance(element, size);
    }

    @Override
    public void add(E e) {
        if (top < size - 1) {
            elements[++top] = e;
        }
    }

    @Override
    public void list() {
        for (E i : elements) {
            System.out.println(i);
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public E remove() {
        E saved = elements[top];
        elements[top] = null;
        top--;
        size++;
        Objects.requireNonNull(elements[top]);
        return saved;
    }

    @Override
    public E get() {
        return elements[top];
    }
}
