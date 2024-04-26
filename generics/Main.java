package org.example.generics;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> t = new Collection<>();
        t.addElement(1);
        t.addElement(3);
        t.addElement(2);
        t.addElement(4);
        t.addElement(2);
        t.addElement(6);
        System.out.println(t);
        t.deleteElements(4);
        System.out.println(t);
        MyIterator<Integer> iter = new MyIterator(t.type);
        while (t.hasNext()){
            System.out.println(t.next());
        }
    }
}

