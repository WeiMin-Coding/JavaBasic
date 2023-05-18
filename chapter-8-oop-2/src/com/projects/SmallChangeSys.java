package com.projects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    // 当前余额
    private double currentChange;
    // 零钱明细
    private String[][] changeHistory = new String[0][];

    /**
     * 零钱通明细
     */
    private void coneyDetails() {
        System.out.println("------------零钱通明细------------");

        if (this.changeHistory.length == 0) return;
        for (int i = 0; i < this.changeHistory.length; i++) {
            String details = String.format("%s\t%s\t%s\t%s",
                    this.changeHistory[i][0],
                    this.changeHistory[i][1],
                    this.changeHistory[i][2],
                    this.changeHistory[i][3]);
            System.out.println(details);
        }
    }

    /**
     * 收益入账
     *
     * @return
     */
    private boolean crediting(double amount) {
        if (amount <= 0) return false;
        this.currentChange += amount;
        boolean recordResult = this.consumptionRecords(1, amount, this.currentChange);
        return recordResult ? true : false;
    }

    private boolean consumption(double amount) {
        if (amount <= 0) return false;
        boolean recordResult = true;
        this.currentChange -= amount;

        if (this.currentChange <= 0) {
            System.out.println("很抱歉，余额为0!");
            return false;
        }

        this.consumptionRecords(2, amount, this.currentChange);

        return recordResult ? true : false;
    }

    /**
     * 消费记录
     *
     * @param type   类型，1入账 2消费
     * @param amount
     * @return
     */
    private boolean consumptionRecords(int type, double amount, double balance) {
        String[] record = new String[4];
        record[2] = getNowTime();
        if (type == 1) {
            record[0] = "收益入账";
            record[1] = String.format("+%f", amount);
            record[3] = String.format("余额:%f", balance);
        } else if (type == 2) {
            record[0] = "消费";
            record[1] = String.format("-%f", amount);
            record[3] = String.format("余额:%f", balance);
        }

        this.addArr();
        this.changeHistory[this.changeHistory.length - 1] = record;

        return true;
    }

    /**
     * 扩容
     */
    private void addArr() {
        String[][] temp = new String[this.changeHistory.length + 1][];
        if (this.changeHistory.length == 0) {
            this.changeHistory = temp;
            return;
        }

        for (int i = 0; i < this.changeHistory.length; i++) {
             temp[i] = this.changeHistory[i];
        }

        this.changeHistory = temp;
    }

    private String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return sdf.format(date);
    }

    private int display() throws Exception {
        System.out.println("------------零钱通菜单------------");
        System.out.println("\t1 零钱通明细");
        System.out.println("\t2 收益入账");
        System.out.println("\t3 消费");
        System.out.println("\t4 退出");
        System.out.print("请选择(1-4): ");
        return new Scanner(System.in).nextInt();
    }

    public void start() {
        while (true) {
            int choice = 0;
            try {
                choice = display();
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            switch (choice) {
                case 1:
                    this.coneyDetails();
                    break;
                case 2:
                    System.out.print("请输入账金额: ");
                    this.crediting(new Scanner(System.in).nextDouble());
                    break;
                case 3:
                    System.out.print("请消费金额: ");
                    this.consumption(new Scanner(System.in).nextDouble());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SmallChangeSys smallChangeSys = new SmallChangeSys();
        smallChangeSys.start();
    }
}
