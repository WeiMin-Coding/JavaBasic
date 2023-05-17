package com.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n3: " + n3);
        System.out.println("n4: " + n4);
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }

    public void h1() {
        m1();
        m2();
        m3();
        m4();
    }
}
