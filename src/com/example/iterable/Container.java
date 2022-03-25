package com.example.iterable;

import java.util.Iterator;
import java.util.function.Consumer;

public interface Container<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void add(T item);
}
