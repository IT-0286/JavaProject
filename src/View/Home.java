/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.HomeTable;
import Control.EmployeeController;
import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dunus
 */
public class Home extends javax.swing.JFrame {

    /** Creates new form HomeJFrame */
    public Home() {
        initComponents();
        this.setResizable(false); 
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("25694.png")));
       // not work icon
       loadTabel();
    }

        public void loadAllDataIntoTable(List<HomeTable> list){
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            
            for (HomeTable Bean : list) {
                Vector v = new Vector();
                v.add(Bean.getId());
                v.add(Bean.getFirstName());
                v.add(Bean.getLastName());
                v.add(Bean.getTelephone());
                v.add(Bean.getCity());
                v.add(Bean.getAddress());
                v.add(Bean.getGender());
                
                dtm.addRow(v);
               
           }
        }
        
        public void loadTabel(){
            EmployeeController bal = new EmployeeController();
            List list = bal.loadData();
            loadAllDataIntoTable(list);
            
        }
        
        
        //creatre a METHOD HERE
        // Call this method on clear button
            public void clearTextFieldData(){
                jTextFieldFirstName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldTelephone.setText("");
                jTextFieldCity.setText("");
                jTextAreaAddress.setText("");
            }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldCity = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jTextFieldTelephone = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 400));
        setSize(new java.awt.Dimension(1000, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Telephone");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("First Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Last Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("City");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Address");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextFieldFirstName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel4.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jTextFieldLastName.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel4.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 230, 30));

        jTextFieldCity.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel4.add(jTextFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, 30));

        jComboBoxGender.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel4.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 100, 30));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 230, 80));

        jTextFieldTelephone.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel4.add(jTextFieldTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, 30));

        jButtonUpdate.setBackground(new java.awt.Color(255, 102, 153));
        jButtonUpdate.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, 60));

        jButtonInsert.setBackground(new java.awt.Color(255, 102, 153));
        jButtonInsert.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 100, 60));

        jButtonDelete.setBackground(new java.awt.Color(255, 102, 153));
        jButtonDelete.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 100, 60));

        jButtonClear.setBackground(new java.awt.Color(255, 102, 153));
        jButtonClear.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 100, 60));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel2.setText("Emloyee Data Base Solution");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 650, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 680, 50));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -80, 1000, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 490, 320));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Telephone", "City", "Address", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 470, 220));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Emloyee Data Base Solution");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 510, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 690, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/Backgroundresize.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
    
            clearTextFieldData();
                
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed

          
           String firstName = jTextFieldFirstName.getText();
           String lastname = jTextFieldLastName.getText();
           String telephone = jTextFieldTelephone.getText();
           String city = jTextFieldCity.getText();
           String address = jTextAreaAddress.getText();
           String gender = (String) jComboBoxGender.getSelectedItem();
           
           
        // TODO add your handling code here:
        
        HomeTable homeBean = new HomeTable(0, firstName, lastname, telephone, city, address, gender);
        
        EmployeeController homeObj = new EmployeeController();
        homeObj.insert(homeBean);
        loadTabel();
        
    }//GEN-LAST:event_jButtonInsertActionPerformed
     int id = 0; 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            
            JOptionPane.showMessageDialog(null, "Please select any record from table fro update or delete");
  
        } else {
            id = (int) jTable1.getValueAt(row, 0);
            EmployeeController bal = new EmployeeController();
            HomeTable bean = bal.returnAllDataToTesxtFields(id);
            jTextFieldFirstName.setText(bean.getFirstName());
            jTextFieldLastName.setText(bean.getLastName());
            jTextFieldTelephone.setText(bean.getTelephone());
            jTextFieldCity.setText(bean.getCity());
            jTextAreaAddress.setText(bean.getAddress());
            jComboBoxGender.setSelectedItem(bean.getGender());
            
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
           
           int id = getSelectedEmployeeId();
           String firstName = jTextFieldFirstName.getText();
           String lastname = jTextFieldLastName.getText();
           String telephone = jTextFieldTelephone.getText();
           String city = jTextFieldCity.getText();
           String address = jTextAreaAddress.getText();
           String gender = (String) jComboBoxGender.getSelectedItem();
           
           HomeTable bean = new HomeTable(id, firstName, lastname, telephone, city, address, gender);
           EmployeeController bal = new EmployeeController();
           bal.update(bean);
           loadTabel(); //after update reload jtable again
           
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

            EmployeeController bal = new EmployeeController();
            bal.deleteRecord(id);
            loadTabel(); //after deleting recode reload again jtable mean refresh table
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldTelephone;
    // End of variables declaration//GEN-END:variables

    private int getSelectedEmployeeId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
