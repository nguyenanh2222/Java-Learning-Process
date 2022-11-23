package org.example.bean;

import org.example.bean.Account;
import org.example.bean.IDatabase;

import java.util.ArrayList;
import java.util.List;

public class Oracle implements IDatabase {
    private List<Account> users;



    Oracle(){
        System.out.printf("ORACLE");
        this.users = new ArrayList<>();
    }

    public Account create(Account user) {
        users.add(user);
        return user;
    }


    public Account find(Integer id) {
        for (Account user: users){
            if (user.id() == id){
                return user;
            }
    }
        return null;
    }

    public Account update(Account user){
        for (Account u : users) {
            if (u.id() == user.id()) {
                u.setFullName(user.fullName());
                u.setAccountBalance(user.accountBalance());
                return u;
            }
        }
        return null;
    }

    public boolean sentMonney(Integer userSentId, Integer userReceiveId, Double moneySent){
        List<Integer> check = new ArrayList<Integer>();
        for ( Account user :users){
            if(user.id() == userSentId){
                if(moneySent < user.accountBalance()){
                    user.setAccountBalance(user.accountBalance() - moneySent);
                    check.add(userSentId);
                }
            }
            if(user.id() == userReceiveId) {
                user.setAccountBalance(user.accountBalance() + moneySent);
                check.add(userReceiveId);
            }
        }
        if (check.contains(userSentId) && check.contains(userReceiveId)) return true;
        else return false;
    }
}
