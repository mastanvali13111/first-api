package com.avengers.StudentMangement;

public class Student {

    private String name;
    private int age;
    private int adminNo;
    private String state;

    public Student(String name, int age, int adminNo, String state) {
        this.name = name;
        this.age = age;
        this.adminNo = adminNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
