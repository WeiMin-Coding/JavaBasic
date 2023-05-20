package com.projects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    // 当前余额
    private double currentChange;
    // 零钱明细
    private Record record;
    private Object[] changeHistory = new Object[0];

    /**
     * 零钱通明细
     */
    private void coneyDetails() {
        System.out.println("------------零钱通明细------------");

        if (this.changeHistory.length == 0) return;
        for (int i = 0; i < this.changeHistory.length; i++) {
            System.out.println(this.changeHistory[i]);
        }
    }

    /**
     * 收益入账
     *
     * @return
     */
    private boolean crediting() {
        System.out.print("请输入账金额: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0) return false;
        this.currentChange += amount;
        boolean recordResult = this.consumptionRecords(1, amount, this.currentChange);
        return recordResult ? true : false;
    }

    /**
     * 消费
     *
     * @param
     * @return
     */
    private boolean consumption() {
        System.out.print("请消费金额: ");
        double amount = new Scanner(System.in).nextDouble();

        if (amount <= 0 || amount > this.currentChange) return false;
        boolean recordResult = true;
        this.currentChange -= amount;

        if (this.currentChange < 0) {
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
        if (type == 1) {
            this.record = new Record("收益入账", String.format("+%.2f", amount), String.format("余额:%.2f", balance));
        } else if (type == 2) {
            this.record = new Record("消费  ", String.format("+%.2f", amount), String.format("余额:%.2f", balance));
        }

        this.addArr(record);
        this.changeHistory[this.changeHistory.length - 1] = record;

        return true;
    }

    /**
     * 扩容
     */
    private void addArr(Record record) {
        Object[] temp = new Object[this.changeHistory.length + 1];
        if (this.changeHistory.length == 0) {
            this.changeHistory = temp;
            return;
        }

        for (int i = 0; i < this.changeHistory.length; i++) {
            temp[i] = this.changeHistory[i];
        }

        this.changeHistory = temp;
    }

    /**
     * 显示方法
     *
     * @return
     * @throws Exception
     */
    private int display() {
        int choice = 5;
        System.out.println("------------零钱通菜单------------");
        System.out.println("\t1 零钱通明细");
        System.out.println("\t2 收益入账");
        System.out.println("\t3 消费");
        System.out.println("\t4 退出");
        System.out.print("请选择(1-4): ");
        try {
            choice = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            return choice;
        }
        return choice;
    }

    /**
     * 退出方法
     *
     * @return
     */
    private boolean exit() {
        while (true) {
            System.out.print("你确定要退出吗？y/n ");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("y") || input.equals("n")) {
                if (input.equals("y")) {
                    System.exit(0);
                } else {
                    return false;
                }
            }
        }
    }

    public void start() {
        int choice;
        while (true) {
            choice = display();
            switch (choice) {
                case 1:
                    this.coneyDetails();
                    break;
                case 2:
                    this.crediting();
                    break;
                case 3:
                    this.consumption();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }
}

class Record {
    // 记录类型
    private String type;
    // 记录金额
    private String amount;
    // 记录日期
    private String date;
    // 记录剩余金额
    private String amountLeft;

    public Record(String type, String amount, String amountLeft) {
        this.type = type;
        this.amount = amount;
        this.amountLeft = amountLeft;
        this.date = this.getNowTime();
    }

    @Override
    public String toString() {
        return type + "\t" + amount + "\t" + date + "\t" + amountLeft;
    }

    private String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return sdf.format(date);
    }
}
