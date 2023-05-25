package com.weimin.static_;

public class StaticMethod {
    public static void main(String[] args) {
        int twoSum = MyTools.twoSum(1, 2);
        System.out.println(twoSum);

        Stu stu = new Stu();
        stu.payFee(100);

        Stu stu1 = new Stu();
        stu1.payFee(100);

        System.out.println(Stu.fee);
    }
}

class MyTools {
    public static int twoSum(int n1, int n2) {
        return n1 + n2;
    }
}

class Stu {
    public static double fee = 0;

    public void payFee(double free) {
        Stu.fee += free;
    }
}
