/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.LoginController;
import Model.SignupTable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dunus
 */
public class SignupController {
    
    public void insertDataSignup(SignupTable beanObj){
        try {
            //create query  for 
            String query = "insert into signup values(null,?,?,?)";
            PreparedStatement ps = LoginController.con.prepareStatement(query);
            
            ps.setString(1, beanObj.getFullName()); //get full name from class witch
            ps.setString(2, beanObj.getEmail());
            ps.setString(3, beanObj.getPass());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You have signup successfully , now go login");            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    
    public boolean checkLogin(String email, String pass){
        boolean b = false;
        try {
            String query = "select Email, Password from signup where Email = '"+email+"' AND Password = '"+pass+"'";
            Statement st = LoginController.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                b = true;
                
            } else{
                JOptionPane.showMessageDialog(null, "Invalid email or password try again..");
            }
            
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return b;
    }
    
}
