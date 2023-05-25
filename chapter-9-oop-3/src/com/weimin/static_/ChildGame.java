package com.weimin.static_;

public class ChildGame {
    public static void main(String[] args) {
        new Child("WeiMin1");
        new Child("WeiMin1");
        new Child("WeiMin1");
        new Child("WeiMin1");
        new Child("WeiMin1");

        System.out.println(Child.count);
    }
}

class Child {
    private String name;
    public static int count;

    public Child(String name) {
        this.name = name;
        Child.count++;
    }

    public void join() {
        System.out.println(this.name + "join this Game.");
    }
}
