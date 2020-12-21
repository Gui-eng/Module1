/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class dbConnection {
    public static Connection connect() throws ClassNotFoundException{
    Connection conn = null;
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String connectionURL = "jdbc:sqlserver://localhost:1433;databasename=Module1;user=admin;password=admin";
    try{
        conn = DriverManager.getConnection(connectionURL);
        System.out.println("Connected!");
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    
    }
    return conn;
    }
}
