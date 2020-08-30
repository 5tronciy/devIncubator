package net.incubator.servlet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stronciy on 30.08.2020.
 */
public class AccountTest {
    @Test
    public void getAccount() throws Exception {
        Account account = new Account(1,1,1);
        int accountValue = account.getAccount();
        assertEquals(accountValue, 1);
    }

    @Test
    public void getUserid() throws Exception {
        Account account = new Account(1,2,3);
        int accountValue = account.getUserid();
        assertEquals(accountValue, 3);
    }

}