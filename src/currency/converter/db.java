/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currency.converter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class db {
    public static Connection db_config() {
        //declare the method name db_config
        Connection conn = null;
        //create variable to hold the connection to the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //holds the msql driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/currency", "root", "1927__sid");
            //establish connection to msql database
            return conn;
            //If everything went well in establishing the connection, it returns the conn object
        } catch (ClassNotFoundException | SQLException e) {
            //If error occurs
            JOptionPane.showMessageDialog(null, e);
            //displays a graphical message box showing information about the error
            return null;
            //returns null to indicate that the connection could not be established
        }
    }
    
}
