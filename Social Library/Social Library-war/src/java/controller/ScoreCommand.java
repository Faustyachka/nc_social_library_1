/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author П
 */
class ScoreCommand implements Command {
    
  

    public ScoreCommand () {
    }

    

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page=null;
            
        //session bean (busines logic)!
               
        
         page= ConfigurationManager.SCORE_PAGE;
        return page;
    }
    
}