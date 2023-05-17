package com.weimin.extend2;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("父类 Base() 构造器");
    }

    public Base(String name) {
        System.out.println("父类 Base(String name) 构造器");
    }

    public Base(String name, int age) {
        System.out.println("父类 Base(String name, int age) 构造器");
    }


    public int getN4() {
        return this.n4;
    }

    public void test100() {
        System.out.println("Base().test100()");
    }

    public void test200() {
        System.out.println("Base().test200()");
    }

    public void test300() {
        System.out.println("Base().test300()");
    }

    private void test400() {
        System.out.println("Base().test400()");
    }

    public void claaTest400() {
        this.test400();
    }
}
