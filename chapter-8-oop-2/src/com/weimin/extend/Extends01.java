package com.weimin.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Xiao";
        pupil.age = 11;
        pupil.setScore(50);
        pupil.testing();
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "Da";
        graduate.age = 23;
        graduate.setScore(50);
        graduate.testing();
        graduate.showInfo();
    }
}
