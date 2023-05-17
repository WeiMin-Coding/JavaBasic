package com.weimin.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("WM111");
        account.setBalance(2);
        account.setPassword("88888");
        System.out.println(account);
    }
}
