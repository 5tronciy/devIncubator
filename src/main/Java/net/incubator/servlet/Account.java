package net.incubator.servlet;

/**
 * Created by Stronciy on 30.08.2020.
 */
public class Account {
    private int accountid;
    private int account;
    private int userid;

    public int getAccount() {
        return account;
    }

    public int getUserid() {
        return userid;
    }

    public Account(int accountid, int account, int userid) {
        this.accountid = accountid;
        this.account = account;
        this.userid = userid;
    }
}
