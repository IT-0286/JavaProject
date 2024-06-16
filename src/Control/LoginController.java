/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dunus
 */
public class LoginController {
    
    public static Connection con = null;
    
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3306/javaproject";
        String root = "root";
        String Pass = "";
        
        try {
            con = DriverManager.getConnection(url, root, Pass);
            
            if (con != null){
                JOptionPane.showConfirmDialog(null, "database has been successfully connected..");
            }
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error in database loading "+e);
        }
        
        
        
        
    }
    
}
