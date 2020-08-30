package net.incubator.servlet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stronciy on 30.08.2020.
 */
public class UserTest {
    @Test
    public void getUserid() throws Exception {
        User user = new User(1, "Mickey", "Mouse");
        int userid = user.getUserid();
        assertEquals(userid, 1);
    }

    @Test
    public void getName() throws Exception {
        User user = new User(1, "Mickey", "Mouse");
        String userName = user.getName();
        assertEquals(userName, "Mickey");
    }

    @Test
    public void getSureName() throws Exception {
        User user = new User(1, "Mickey", "Mouse");
        String userSurName = user.getSureName();
        assertEquals(userSurName, "Mouse");
    }

}