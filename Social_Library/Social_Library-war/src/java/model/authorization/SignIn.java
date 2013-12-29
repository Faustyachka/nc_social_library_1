/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.authorization;
import ActionsImpl.UsersActionsImpl;
import ActionsInterfaces.UsersActions;
import Controller.Command;
import Controller.ConfigurationManager;
import TransferObject.Users;
import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.log4j.Logger;
/**
 *
 * @author Костя
 */
public class SignIn implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = ConfigurationManager.INDEX_PAGE;
        response.setContentType("text/html;charset=UTF-8");
        UsersActions uAction = new UsersActionsImpl();
        List<Users> uList = uAction.searchUsersByParameter("login", request.getParameter("login"));
//        uList.getPassword();
       if (uList.get(0).getPassword().equals(request.getParameter("password"))) {
           page = ConfigurationManager.INDEX_PAGE;
       } else {
            page = ConfigurationManager.REGISTR_PAGE;
       }
        return page;
    }
}
