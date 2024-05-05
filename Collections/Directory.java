package org.example.Collections;

import java.util.ArrayList;

public class Directory {
    static ArrayList<Employee> empls = new ArrayList<>();

    public static void findEmployeeEXP(int workExp){
        for (int i = 0; i < empls.size(); i++) {
            if (empls.get(i).getWorkExp()==workExp){
                System.out.println(empls.get(i));
            }
        }
    }
    public static void findPhoneNumber(String name){
        for (int i = 0; i < empls.size(); i++) {
            if (empls.get(i).getName()==name){
                System.out.println(empls.get(i).getPhoneNumber());
            }
        }
    }
    public static void findEmployeeID(int emNum){
        for (int i = 0; i < empls.size(); i++) {
            if (empls.get(i).getEmNum()==emNum){
                System.out.println(empls.get(i));
            }
        }
    }
    public static void addEmployee(int phoneNumber, String name, int workExp){
        empls.add(new Employee(phoneNumber,name,workExp));
    }
    public static void main(String[] args) {
        empls.add(new Employee(1234, "Vasya", 1));
        empls.add(new Employee(5555,"Marina",2));
        empls.add(new Employee(4321,"Gregori", 14));
        empls.add(new Employee(7676,"Gnida",5));
        empls.add(new Employee(8888,"Lena",2));
        findEmployeeEXP(2);
        findPhoneNumber("Vasya");
        findEmployeeID(0);
        addEmployee(66666,"1341",22);
        System.out.println(empls);
    }
}
