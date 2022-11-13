package org.example;

public class AccountService {


    //    Chuyển tiền
    private IDatabase accountDao;
    public AccountService(IDatabase accountDao) {
        this.accountDao = accountDao;
    }
    public Object transferMoney(Integer idSent, Integer idReceive, Double moneySent){
        Account accountSent = accountDao.find(idSent);
        Account accountReceive = accountDao.find(idReceive);
        if(accountSent == null || accountReceive == null){
            return false;
        }else {
            if (accountSent.accountBalance() > moneySent){
            accountSent.setAccountBalance(accountSent.accountBalance()-moneySent);
            accountReceive.setAccountBalance(accountReceive.accountBalance()+moneySent);
            return true;
            }
            else return false;
        }
    }
    public Object getAccount(Integer id){
        //    Lấy thông tin account theo id
        return accountDao.find(id);
    }
    public Account create(Account account){
        return accountDao.create(account);
    }
}
