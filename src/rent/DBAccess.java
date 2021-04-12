/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;
   

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBAccess {
    private static Connection conn = null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        if(conn == null){
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "");
        }
        return conn;
    }
    public static Connection getConn() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carshowroom", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return cn;
        }
    }

    public static void closeConn(Connection cn, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

