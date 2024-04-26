package org.example.Workers;

public class NotEmployee implements Person {
    @Override
    public void doWork() {
        System.out.println("Not found a job");
    }

    @Override
    public void haveRest() {
        System.out.println("Piv4ik eeeeeee");
    }
}
