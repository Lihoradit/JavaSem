package org.example.Workers;

public class WorkSpace<T extends Person>{
    T[] array;

    public WorkSpace(T[] array) {
        this.array = array;
    }
    public void start(){
        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
        }
    }
}
