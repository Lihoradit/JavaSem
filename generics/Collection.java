package org.example.generics;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Collection<T> {
    Object[] type;
    private int size = 0;
    private int index = 0;

    public Collection() {
        type = new Object[10];
    }

    public void addElement(T element) {
        if (size >= type.length) {
            type = Arrays.copyOf(type, type.length * 2);
        }
        type[size++] = element;
    }

    public void deleteElements(T elem) {
        if (size == 0) System.out.println("Пустой список");
        for (int i = 0; i < size; i++) {
            if (type[i] == elem) {
                System.arraycopy(type, i + 1, type, i, type.length - 1 - i);
                size--;
                return;
            }

        }
    }

    public boolean hasNext() {
        return type[index] != null && index < size;
    }

    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        index++;
        return (T) type[index];
    }

    @Override
    public String toString() {
        return "Collection " +
                Arrays.toString(type);
    }
}
