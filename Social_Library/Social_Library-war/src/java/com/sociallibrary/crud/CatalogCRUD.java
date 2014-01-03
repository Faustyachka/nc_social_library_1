package com.sociallibrary.crud;

import com.sociallibrary.Entities.Catalog;
import com.sociallibrary.EntitiesInterfaces.CatalogDAO;
import com.sociallibrary.EntitiesInterfaces.BookStatusDAO;
import com.sociallibrary.EntitiesInterfaces.LibraryDAO;
import com.sociallibrary.EntitiesInterfaces.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CatalogCRUD implements CatalogDAO {

    public void createCatalog(Catalog catalog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Catalog readCatalog(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCatalog(Catalog catalogOld, Catalog catalogNew) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteCatalog(Catalog catalog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
    public static final Logger log = Logger.getLogger(AuthorCRUD.class);
    private static final String selectQuery = "SELECT * FROM catalog WHERE id=?";
    private static final String deleteQuery = "DELETE FROM catalog WHERE id =?";
    private static final String insertCatalogQuery = "INSERT INTO catalog VALUES(catalog_id.nextval, ?, ?,?,?)";
    private static final String updateCatalogQuery = "UPDATE catalog SET users=?, book=?, event_time=?, status=?, WHERE id=?";

    
    public void createCatalog(Catalog catalog) {
        BasicConfigurator.configure();
        Connection conn = conn1.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement(insertCatalogQuery);

            pstmt.setLong(1, catalog.getUsers().getId());
            pstmt.setLong(2, catalog.getBook().getId());
            pstmt.setTimestamp(3, (Timestamp) catalog.getEventTime());
            pstmt.setShort(4, catalog.getStatus().getId());

            pstmt.executeUpdate();

            pstmt.close();
                conn.close();
        } catch (SQLException e) {
            while (e != null) {
                log.error("SQLException" + e);
            }
        }
    }

    public Catalog readCatalog(int id) {
        BasicConfigurator.configure();
        Catalog catalog = new Catalog();
        Connection conn = conn1.getConnection();
        UserDAO u = new OracleUsersDAO();
        LibraryDAO l = new OracleLibraryDAO();
        BookStatusDAO s = new BookStatusDAO();
        try {
            PreparedStatement stmt = conn.prepareStatement(selectQuery);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                catalog.setId(rs.getLong(1));
                catalog.setUsers(u.readUsers(rs.getInt(2)));
                catalog.setBook(l.readLibrary(rs.getInt(3)));
                catalog.setStatus(s.readBookStatus(rs.getInt(4)));
            }
            rs.close();
            stmt.close();
                conn.close();
        } catch (SQLException e) {
            while (e != null) {
                log.error("SQLException" + e);
            }
        }

        return catalog;
    }

    public void updateCatalog(Catalog catalogOld, Catalog catalogNew) {
        BasicConfigurator.configure();
        Connection conn = conn1.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement(updateCatalogQuery);
            pstmt.setLong(1, catalogOld.getUsers().getId());
            pstmt.setLong(2, catalogOld.getBook().getId());
            pstmt.setShort(3, catalogOld.getStatus().getId());
            pstmt.setLong(4, catalogOld.getId());

            pstmt.executeUpdate();

            pstmt.close();
                conn.close();
        } catch (SQLException e) {
            while (e != null) {
                log.error("SQLException" + e);
            }
        }
    }

    public void deleteCatalog(Catalog catalog) {
        BasicConfigurator.configure();
        Connection conn = conn1.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(deleteQuery);

            stmt.setLong(1, catalog.getId());

            stmt.executeUpdate();

            stmt.close();
                conn.close();
        } catch (SQLException e) {
            while (e != null) {
                log.error("SQLException" + e);
            }
        }
    }
     */
}
