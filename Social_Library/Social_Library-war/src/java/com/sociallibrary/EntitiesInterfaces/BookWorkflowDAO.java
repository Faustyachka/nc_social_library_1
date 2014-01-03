/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sociallibrary.EntitiesInterfaces;
import com.sociallibrary.Entities.*;
/**
 *
 * @author Назар
 */
public interface BookWorkflowDAO {

    public void createBookWorkflow(BookWorkflow bookWorkflow);
     public BookWorkflow readBookWorkflow(int id);
     public void updateBookWorkflow(BookWorkflow bookWorkflow);
     public void deleteBookWorkflow(int id);

}
