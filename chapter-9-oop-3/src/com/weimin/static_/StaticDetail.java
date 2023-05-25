package com.weimin.static_;

public class StaticDetail {
    public static void main(String[] args) {
//        A1 a1 = new A1();
        System.out.println(A1.address);
        System.out.println(A2.count);
    }
}

class A1 {
    public static String address = "Bei Jing";
}

class A2 {
    public static int count = 1;
}
