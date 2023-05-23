package com.projects2;

import java.util.Scanner;

/**
 * 新增房源
 */
public class HouseAdd extends House {
    // 新增房源
    public void houseAdd(Object[] houseRecord) {
        System.out.println("添加房屋");

        House house = new House();
        System.out.print("Name: ");
        house.name = new Scanner(System.in).next();
        System.out.print("Tel: ");
        house.tel = new Scanner(System.in).next();
        System.out.print("Address: ");
        house.address = new Scanner(System.in).next();
        System.out.print("Price: ");
        house.price = new Scanner(System.in).nextDouble();
        System.out.print("Status: ");
        house.status = new Scanner(System.in).next();

        Object[] newArrys = Utils.arrysAdd(houseRecord);
        newArrys[newArrys.length - 1] = house;
        houseRecord = newArrys;
    }
}
