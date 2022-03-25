package com.example.iterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Bag<T> implements Container <T>{

    ArrayList<T> bag = new ArrayList<>();

    @java.lang.Override
    public boolean isEmpty() {

        return bag.isEmpty();
    }

    @java.lang.Override
    public int size() {

        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    public void forEach(Consumer<? super T> action){
        bag.forEach(action);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }


}
