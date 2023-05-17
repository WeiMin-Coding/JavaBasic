package com.weimin.extend;

public class Student {
    public String name;
    public int age;
    private double score;

    public Student() {
        System.out.println("执行Student构造器");
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " Age: " + this.age
        + " Score: " + this.score);
    }
}
