package org.example.bean;

public interface IDatabase {

//    List<Account> users = new ArrayList<>();


    Account create(Account user);

    Account find(Integer id);

    Account update(Account user);

    boolean sentMonney(Integer userSentId, Integer userReceiveId, Double moneySent);



}
