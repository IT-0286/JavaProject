/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.LoginController;
import Model.HomeTable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dunus
 */
public class EmployeeController {
    
    public List<HomeTable> loadData(){
        List<HomeTable> list = new ArrayList<HomeTable>();
        try {
            String query = "select * from employee";
            PreparedStatement ps = LoginController.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                int id = rs.getInt("Id");
                String firstName = rs.getString("First Name");
                String lastName = rs.getString("Last Name");
                String telephone = rs.getString("Telephone");
                String city = rs.getString("City");
                String address = rs.getString("Address");
                String gender = rs.getString("Gender");
                
                HomeTable bean = new HomeTable(id, firstName, lastName, telephone, city, address, gender);
                list.add(bean);

            }
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    
    public void insert(HomeTable homeBean){
        
        try {
            String query = "insert into employee values (null , ? , ? , ? , ? , ? , ?)";
            PreparedStatement ps = LoginController.con.prepareStatement(query);
            ps.setString(1, homeBean.getFirstName());
            ps.setString(2, homeBean.getLastName());
            ps.setString(3, homeBean.getTelephone());
            ps.setString(4, homeBean.getCity());
            ps.setString(5, homeBean.getAddress());
            ps.setString(6, homeBean.getGender());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted");
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
        // create method for get data on click in jtable
    
    public HomeTable returnAllDataToTesxtFields(int id){
        HomeTable bean = null;
        
        try {
                String query = "select * from employee where Id = "+id;
                PreparedStatement ps = LoginController.con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int ids = rs.getInt("Id");
                    String firstName = rs.getString("First Name");
                    String lastName = rs.getString("Last Name");
                    String telephone = rs.getString("Telephone");
                    String city = rs.getString("City");
                    String address = rs.getString("Address");
                    String gender = rs.getString("Gender");
                    bean = new HomeTable(ids, firstName, lastName, telephone, city, address, gender);   
                
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
        
    }

    //create method for update
    public void updateDate(HomeTable bean){
        try {
            String query = "UPDATE employee SET FirstName = ?, LastName = ?, Telephone = ?, City = ?, Address = ?, Gender = ? WHERE Id = ?";
            PreparedStatement ps = LoginController.con.prepareStatement(query);
            ps.setString(1, bean.getFirstName());
            ps.setString(2, bean.getLastName());
            ps.setString(3, bean.getTelephone());
            ps.setString(4, bean.getCity());
            ps.setString(5, bean.getAddress());
            ps.setString(6, bean.getGender());
            ps.setInt(7, bean.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A Recode had been update");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //delete method create here
    
        public void deleteRecord(int id){
            try {
                String query = "delete from employee where Id = ?";
                PreparedStatement ps = LoginController.con.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been delete");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
                
            }
        }

    public void update(HomeTable homeBean) {
    try {
        String query = "UPDATE employee SET FirstName = ?, LastName = ?, Telephone = ?, City = ?, Address = ?, Gender = ? WHERE Id = ?";
        PreparedStatement ps = LoginController.con.prepareStatement(query);
        ps.setString(1, homeBean.getFirstName());
        ps.setString(2, homeBean.getLastName());
        ps.setString(3, homeBean.getTelephone());
        ps.setString(4, homeBean.getCity());
        ps.setString(5, homeBean.getAddress());
        ps.setString(6, homeBean.getGender());
        ps.setInt(7, homeBean.getId());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Record updated successfully");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error updating record: " + e.getMessage());
    }
}
    
    
    
    
    
}
