package net.incubator.servlet; /**
 * Created by Stronciy on 30.08.2020.
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class UserBankList extends HttpServlet {

    private String message;

    public void init(){
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter messageWriter = response.getWriter();
        String requestQueryString;
        requestQueryString = request.getQueryString();
        User user;
        List<Account> accounts;
        Account richestUserAccount;
        try {
            if (requestQueryString.contains("richest_user")) {
                accounts = Jdbc.getAllAccounts();
                accounts.sort((Account o1, Account o2)->-(o1.getAccount()-o2.getAccount()));
                richestUserAccount = accounts.get(1);
                user = Jdbc.getUsersdatatableByUserid(richestUserAccount.getUserid());
                message=user.getName()+" "+user.getSureName();
            }
            else if (requestQueryString.contains("accounts_sum")) {
                accounts = Jdbc.getAllAccounts();
                int sum=0;
                for (int i = 0; i < accounts.size(); i++) {
                    sum+=accounts.get(i).getAccount();
                }
                message = String.valueOf(sum);
            }
            else {
                response.sendError(404,requestQueryString+" not found!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        messageWriter.println(message);
    }

    public void destroy() {
    }
}
