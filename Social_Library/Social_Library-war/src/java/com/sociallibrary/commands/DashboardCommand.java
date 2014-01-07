/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sociallibrary.commands;

import com.sociallibrary.controller.Command;
import com.sociallibrary.controller.ConfigurationManager;
import com.sociallibrary.entity.Library;
import com.sociallibrary.model.Dashboard;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pavel
 */
public class DashboardCommand implements  Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page =null;
        Dashboard dashboard =new Dashboard();
        List<Library> lib=dashboard.getInProgress();
        request.setAttribute("inprogress", lib);

        page=ConfigurationManager.Dashboard_PAGE;



        return page;
    }

}
