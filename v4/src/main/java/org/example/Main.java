package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.create(new Account(1, "anh", 600000.0));
        accountService.create(new Account(2, "sang", 0.0));
        System.out.println(accountService.getAccount(1));
        System.out.println(accountService.getAccount(2));
        accountService.transferMoney(1, 2, 500000.0);
        System.out.println(accountService.getAccount(1));
        System.out.println(accountService.getAccount(2));
    }
}