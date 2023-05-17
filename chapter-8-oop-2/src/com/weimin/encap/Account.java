package com.weimin.encap;

public class Account {
    private String name;
    private double balance;
    private String password;

    Account() {
    }

    Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public void setName(String name) {
        int nameLength = name.length();
        if (nameLength >= 2 && nameLength <= 4) {
            this.name = name;
        } else {
            System.out.println("很抱歉，名字长度必须在2到4个字符！将设置默认名字为无名氏");
            this.name = "无名氏";
        }
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("很抱歉，余额必须大于等于20！将设置默认余额为0");
            this.balance = 0;
        }
    }

    public void setPassword(String password) {
        int passwordLength = password.length();
        if (passwordLength == 6) {
            this.password = password;
        } else {
            System.out.println("很抱歉，密码长度不符合！将设置默认密码666666");
            this.password = "666666";
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
