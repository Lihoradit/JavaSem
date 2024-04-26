package org.example.Workers;

public class Club <T extends Person>{
    T[] array;

    public Club(T[] array) {
        this.array = array;
    }
    public void start(){
        for (int i = 0; i < array.length; i++) {
            array[i].haveRest();
        }
    }
}
