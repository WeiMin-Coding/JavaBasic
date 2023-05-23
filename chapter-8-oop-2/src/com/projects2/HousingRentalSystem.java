package com.projects2;

import java.util.Scanner;

public class HousingRentalSystem {
    private Object[] houseRecord = new Object[0];

    /**
     * 新增房源
     */
    private void houseAdd() {
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

        Object[] newArrys = Utils.arrysAdd(this.houseRecord);
        newArrys[newArrys.length - 1] = house;
        this.houseRecord = newArrys;
    }

    /**
     * 显示房源列表
     */
    private void displayHouse() {

    }

    public void mainMenu() {
        System.out.println("房屋出租系统");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\t1 新增房源");
            System.out.println("\t2 查找房源");
            System.out.println("\t3 删除房源");
            System.out.println("\t4 修改房源");
            System.out.println("\t5 房源列表");
            System.out.println("\t6 退出");
            System.out.print("请选择(1-6): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // 新增房源
                    this.houseAdd();
                    break;
                case 5:
                    // 房源列表
                    this.houseAdd();
                    break;
                default:
                    System.out.println("输入有误！请重新输入！");
                    break;
            }
        } while (true);
    }
}
