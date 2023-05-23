package com.projects2;

public class Utils {
    public static Object[] arrysAdd(Object[] oldArrys) {
        Object[] newArrys = new Object[oldArrys.length + 1];

        if (oldArrys.length == 0) {
            return newArrys;
        }

        for (int i = 0; i < oldArrys.length; i++) {
            newArrys[i] = oldArrys[i];
        }

        return newArrys;
    }
}
