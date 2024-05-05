package org.example.Collections;

public class Employee {
    private int phoneNumber;
    private String name;
    private int workExp;
    private int emNum;
    private static int id=0;

    public Employee(int phoneNumber, String name, int workExp) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workExp = workExp;
        emNum=id;
        id++;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public int getEmNum() {
        return emNum;
    }

    @Override
    public String toString() {
        return "Employee" +
                "Номер телефона:" + phoneNumber +
                "Имя:" + name + '\'' +
                "Опыт работы:" + workExp +
                "Табельный номер" + emNum;
    }
}
