/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package storemgt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class DatabaseConnection {
    private static final String connectionUrl = "jdbc:sqlserver://localhost\\asen:1433;"
                + "databaseName=store;"
                + "user=asen;"
                + "password=newasen;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(connectionUrl);        
    }
}
