package org.example.Workers;

public class App {
    public static void main(String[] args) {
        Person[] empl = {new Employee(), new NotEmployee(), new Employee()};
        WorkSpace<Person> work= new WorkSpace<>(empl);
        Club<Person> club = new Club<>(empl);
        work.start();
        club.start();
    }
}
