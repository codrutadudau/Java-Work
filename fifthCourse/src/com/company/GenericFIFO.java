package com.company;

public interface GenericFIFO<E> {
    void add(E e);
    E remove();
    E get();
    void list();
    boolean isEmpty();
}
