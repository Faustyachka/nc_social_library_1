/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author П
 */
public class ControllerServlet extends HttpServlet {

    RequestHandler requesthandler = RequestHandler.getInstance();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page =null;
         try {
            
             Command command= requesthandler.getCommand(request);
            page = command.execute(request, response);
            
             
         }catch(ServletException e){
             request.setAttribute("error", "Error!!!");
             page=ConfigurationManager.ERROR_PAGE;
         }
         catch(IOException e){
             
             request.setAttribute("error", "Error!!!");
             page=ConfigurationManager.ERROR_PAGE;
         }
        
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
         dispatcher.forward(request, response);
         
        
        
        
    }

   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "This is Controller";
    }
}