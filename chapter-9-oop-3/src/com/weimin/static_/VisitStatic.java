package com.weimin.static_;

public class VisitStatic {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.sex);
    }
}

class A {
    private String name = "WeiMin";
    public static String sex = "M";
}
