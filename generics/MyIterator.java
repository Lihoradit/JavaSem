package org.example.generics;

import java.util.NoSuchElementException;

public class MyIterator<T> {
    private T[] array;

    private int index=0;
    public MyIterator(T[] temp) {
        this.array = temp;
    }
    public boolean hasNext(){
        if (array[index]!=null && index< array.length){

            return true;
        }
        return false;
    }
    public T next(){
        if (!hasNext()) throw new NoSuchElementException();
        return array[index++];
    }
}
