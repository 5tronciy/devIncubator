package net.incubator.servlet;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 * Created by Stronciy on 30.08.2020.
 */
public class JdbcTest {
    @Test
    public void getUsersdatatableByUserid() throws Exception {
        int userid;
        User user;
        userid = 1;
        user = Jdbc.getUsersdatatableByUserid(userid);
        assertEquals(user.getUserid(), userid);
    }

    @Test
    public void getAllAccounts() throws Exception {
        List<Account> accounts;
        accounts = Jdbc.getAllAccounts();
        assertNotNull(accounts);
    }

}