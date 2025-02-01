/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemgt;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asenl
 */
public class trialconnection {
     
    public static void main(String[] args){
        
        String connectionUrl = "jdbc:sqlserver://localhost\\asen:1433;"
                + "databaseName=store;"
                + "user=asen;"
                + "password=newasen;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
    
    
    try (Connection connection = DriverManager.getConnection(connectionUrl);) {
        System.out.println("yoweli");
    } catch (SQLException ex) {
        Logger.getLogger(trialconnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
