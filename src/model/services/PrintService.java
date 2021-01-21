package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> list = new ArrayList<>();

    public PrintService(){}

    public void addValue(T value) {
        list.add(value);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size() ; i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return list.get(0);
    }
}
