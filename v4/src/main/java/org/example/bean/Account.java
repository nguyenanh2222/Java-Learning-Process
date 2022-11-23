package org.example.bean;


public class Account {
    private Integer id;
    private String fullName;
    private Double accountBalance;

    public Account(Integer id, String fullName, Double accountBalance) {
        this.id = id;
        this.fullName = fullName;
        this.accountBalance = accountBalance;
    }

    public Integer id() {
        return id;
    }

    public Integer setId(Integer id) {
        this.id = id;
        return this.id;
    }

    public String fullName() {
        return fullName;
    }

    public Account setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Double accountBalance() {
        return accountBalance;
    }

    public Account setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("id=").append(id);
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", accountBalance=").append(accountBalance);
        sb.append('}');
        return sb.toString();
    }
}

