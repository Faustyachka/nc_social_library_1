/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sociallibraryl.authorization;
import com.sociallibrary.ActionsImpl.UsersActionsImpl;
import ActionsInterfaces.UsersActions;
import com.sociallibrary.controller.Command;
import com.sociallibrary.controller.ConfigurationManager;
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
       if (uList.size()!=0){
       if (uList.get(0).getPassword().equals(request.getParameter("password")) && uList.get(0).getConfirmed()==1) {
            HttpSession session=request.getSession(true);
            session.setAttribute("role", (int) uList.get(0).getRole().getId());
            session.setAttribute("id", uList.get(0).getId());

           page = (ConfigurationManager.LOCAL_LIB);
           page += "?id="+String.valueOf(uList.get(0).getId())+"&role="+ String.valueOf(uList.get(0).getRole().getId());
       } else {
            page = ConfigurationManager.INDEX_PAGE;
       }
       } else {
            page =ConfigurationManager.INDEX_PAGE;
       }
        return page;
    }
}