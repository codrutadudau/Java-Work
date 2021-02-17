package com.company;

public interface GenericStack<E> {
    void add(E e);
    E remove();
    E get();
    void list();
    boolean isEmpty();
}
