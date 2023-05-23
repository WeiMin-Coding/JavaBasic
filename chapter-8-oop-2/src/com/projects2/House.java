package com.projects2;

public class House {
    // 编号
    public int id;
    // 房东名字
    public String name;
    // 房东电话
    public String tel;
    // 地址
    public String address;
    // 月租
    public double price;
    // 状态
    public String status;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
