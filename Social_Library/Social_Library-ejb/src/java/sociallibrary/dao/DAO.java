/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.test
 */
package sociallibrary.dao;

import java.util.List;
import javax.servlet.ServletException;
import sociallibrary.dto.Role;
import sociallibrary.entyti.Catalog;
import sociallibrary.entyti.Library;
import sociallibrary.entyti.Users;
/**
 *
 * @author Cotil1ion
 */
public interface DAO {
    // public void insert(Role user);
    // public void update(Role user);
    // public void delete(int roleId); 
     public List<Role> getAllRole() throws ServletException;
     public Role readRole(int id) throws ServletException;
     public void createRole(Role role) throws ServletException;
     public void deleteRole(Role role) throws ServletException;
     public Role updateRole(Role role, String name) throws ServletException;
     public void createUsers(Users users) throws ServletException;
     public Users readUsers(int id) throws ServletException;
     public void updateUsers(Users usersOld, Users usersNew) throws ServletException;
     public void deleteUsers(Users users) throws ServletException;
     public void createLibrary(Library library) throws ServletException;
     public Library readLibrary(int id) throws ServletException;
     public void updateLibrary(Library libraryOld, Library libraryNew) throws ServletException;
     public void deleteLibrary(Library library) throws ServletException;
     public void createCatalog(Catalog catalog) throws ServletException;
}