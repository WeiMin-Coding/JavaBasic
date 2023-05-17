package com.weimin.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Persion weimin = new Persion("WeiMin", 50, 2500.00);
        System.out.println(weimin.info());
    }
}

class Persion {
    private String name;
    private int age;
    private double salaries;

    public Persion(String name, int age, double salaries) {
        this.name = name;
        this.age = age;
        this.salaries = salaries;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        }
    }

    public void setName(String name) {
        int nameLength = name.length();
        if (nameLength >= 2 && nameLength <= 6) {
            this.name = name;
        }
    }

    public void setSalaries(double salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return this.name;
    }

    public String info() {
        return "Name: " + this.name + " Age: " + this.age + " Salaries: " + this.salaries;
    }
}
