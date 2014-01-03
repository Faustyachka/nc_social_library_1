/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sociallibrary.EntitiesInterfaces;

import com.sociallibrary.Entities.*;

/**
 *
 * @author mazafaka
 */
public interface CatalogDAO {

     public void createCatalog(Catalog catalog);
     public Catalog readCatalog(int id);
     public void updateCatalog(Catalog catalogOld, Catalog catalogNew);
     public void deleteCatalog(Catalog catalog);

}