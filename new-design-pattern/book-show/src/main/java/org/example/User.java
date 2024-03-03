package org.example;

public class User {
    private String userId;
    private String userName;
    private Integer balanceAmt;

    public User(String userId, String userName, Integer balanceAmt) {
        this.userId = userId;
        this.userName = userName;
        this.balanceAmt = balanceAmt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(Integer balanceAmt) {
        this.balanceAmt = balanceAmt;
    }
}
