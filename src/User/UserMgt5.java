/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class UserMgt5 extends javax.swing.JFrame {

    
    public UserMgt5() {
        initComponents();
        ShowUser();
    }

    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblhed6 = new javax.swing.JLabel();
        lblprdcthed4 = new javax.swing.JLabel();
        btncancel6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnhome6 = new javax.swing.JButton();
        pnlorder6 = new javax.swing.JPanel();
        lblcatname4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnadd6 = new javax.swing.JButton();
        btnedit6 = new javax.swing.JButton();
        btnclr6 = new javax.swing.JButton();
        btndlt6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser5 = new javax.swing.JTable();
        lblupw5 = new javax.swing.JLabel();
        txtuserpw5 = new javax.swing.JTextField();
        lblopt = new javax.swing.JLabel();
        cmbOption = new javax.swing.JComboBox<>();
        lblopt1 = new javax.swing.JLabel();
        txtcntct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed6.setForeground(new java.awt.Color(255, 255, 255));
        lblhed6.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 30));

        lblprdcthed4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed4.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed4.setText("User Management");
        jPanel1.add(lblprdcthed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        btncancel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel6.setText("X");
        btncancel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel6ActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnhome6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhome6.setText("Home");
        btnhome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(btnhome6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome6)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 800, 40));

        pnlorder6.setBackground(new java.awt.Color(51, 0, 0, 160));

        lblcatname4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcatname4.setForeground(new java.awt.Color(255, 255, 255));
        lblcatname4.setText("User Name");

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Items List");

        btnadd6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd6.setText("Add");
        btnadd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd6ActionPerformed(evt);
            }
        });

        btnedit6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit6.setText("Edit");
        btnedit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit6ActionPerformed(evt);
            }
        });

        btnclr6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclr6.setText("Clear");
        btnclr6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclr6MouseClicked(evt);
            }
        });
        btnclr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclr6ActionPerformed(evt);
            }
        });

        btndlt6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndlt6.setText("Delete");
        btndlt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndlt6MouseClicked(evt);
            }
        });
        btndlt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlt6ActionPerformed(evt);
            }
        });

        tbluser5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbluser5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User_id", "Option", "User_name", "User_Pw", "contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbluser5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluser5MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbluser5);

        lblupw5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblupw5.setForeground(new java.awt.Color(255, 255, 255));
        lblupw5.setText("User Password");

        txtuserpw5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtuserpw5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserpw5ActionPerformed(evt);
            }
        });

        lblopt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblopt.setForeground(new java.awt.Color(255, 255, 255));
        lblopt.setText("Option");

        cmbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "cashier" }));

        lblopt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblopt1.setForeground(new java.awt.Color(255, 255, 255));
        lblopt1.setText("Contact");

        txtcntct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcntct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcntctActionPerformed(evt);
            }
        });
        txtcntct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcntctKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcntctKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlorder6Layout = new javax.swing.GroupLayout(pnlorder6);
        pnlorder6.setLayout(pnlorder6Layout);
        pnlorder6Layout.setHorizontalGroup(
            pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorder6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorder6Layout.createSequentialGroup()
                        .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlorder6Layout.createSequentialGroup()
                                .addComponent(btnadd6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnedit6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlorder6Layout.createSequentialGroup()
                                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblupw5)
                                    .addComponent(lblcatname4)
                                    .addComponent(lblopt)
                                    .addComponent(lblopt1))
                                .addGap(23, 23, 23)))
                        .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlorder6Layout.createSequentialGroup()
                                .addComponent(btndlt6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnclr6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbOption, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtuserpw5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(txtcntct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlorder6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(372, 372, 372)))
                .addComponent(jLabel10))
        );
        pnlorder6Layout.setVerticalGroup(
            pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorder6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcatname4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblupw5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuserpw5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblopt)
                    .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblopt1)
                    .addComponent(txtcntct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd6)
                    .addComponent(btnedit6)
                    .addComponent(btndlt6)
                    .addComponent(btnclr6))
                .addGroup(pnlorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorder6Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel10))
                    .addGroup(pnlorder6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(190, 190, 190))
        );

        getContentPane().add(pnlorder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 720, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs= null, rs1=null;
    Statement st = null, st1 = null;
    
    int unum;
    private void CountUser(){
        try{
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select Max (userid) from user");
            rs1.next();
            unum = rs1.getInt(1)+1;
        }catch (Exception e){
            
        }
    }
    
    int key =0;
    private void tbluser5MouseClicked(java.awt.event.MouseEvent evt) {                                      
        DefaultTableModel model = (DefaultTableModel) tbluser5.getModel();
        int MyIndex = tbluser5.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        
        txtName.setText(model.getValueAt(MyIndex, 2).toString());
        txtuserpw5.setText(model.getValueAt(MyIndex, 3).toString());
        txtcntct.setText(model.getValueAt(MyIndex, 4).toString());
        cmbOption.setSelectedItem(model.getValueAt(MyIndex, 1).toString());

    }  
    
    private void btnhome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome6ActionPerformed
        Home.homePage3 ho = new Home.homePage3 ();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome6ActionPerformed

    private void btncancel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel6ActionPerformed
        User.UserMgt5 cls = new User.UserMgt5();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancel6ActionPerformed

    private void txtuserpw5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserpw5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserpw5ActionPerformed

    private void btnadd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd6ActionPerformed

        if (txtName.getText().isEmpty() || txtuserpw5.getText().isEmpty() || cmbOption.getSelectedIndex()== -1 || txtcntct.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountUser();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                //valid
                Statement st = con.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery("select * from user where username = '" + txtName.getText() + "'");
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "user Already Exist!");
                }else{
                PreparedStatement add = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?)");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, unum);
                add.setString(2, cmbOption.getSelectedItem().toString());
                add.setString(3, txtName.getText());
                add.setString(4, txtuserpw5.getText());
                add.setString(5, txtcntct.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Added successfully !");
                txtName.setText("");
                txtuserpw5.setText("");
                cmbOption.setSelectedIndex(0);
                txtcntct.setText("");
                }
                con.close();
                ShowUser();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }  
    }//GEN-LAST:event_btnadd6ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    /*
    private void tbluser5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluser5MouseClicked
        
    }//GEN-LAST:event_tbluser5MouseClicked
*/
    private void btnedit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit6ActionPerformed
        if (txtName.getText().isEmpty() || txtuserpw5.getText().isEmpty() || cmbOption.getSelectedIndex()== -1 || txtcntct.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountUser();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE user SET option=?,username=?,password=?,contact=? WHERE userid=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                
                add.setString(1, cmbOption.getSelectedItem().toString());
                add.setString(2, txtName.getText());
                add.setString(3, txtuserpw5.getText());
                add.setString(4, txtcntct.getText());
                add.setInt(5, key);
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Edited successfully !");
                txtName.setText("");
                txtuserpw5.setText("");
                cmbOption.setSelectedIndex(0);
                txtcntct.setText("");
                con.close();
                ShowUser();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnedit6ActionPerformed

    private void btndlt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlt6ActionPerformed
        if (txtName.getText().isEmpty() || txtuserpw5.getText().isEmpty() || cmbOption.getSelectedIndex()== -1 || txtcntct.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountUser();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("DELETE FROM user WHERE userid = ?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, key);
                //add.setString(2, txtName.getText());
                //add.setString(3, txtuserpw5.getText());
                //add.setString(4, txtusercontact5.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "User Deleted successfully !");
                txtName.setText("");
                txtuserpw5.setText("");
                cmbOption.setSelectedIndex(0);
                txtcntct.setText("");
                con.close();
                ShowUser();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btndlt6ActionPerformed

    private void btnclr6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclr6MouseClicked
        txtName.setText("");
        txtuserpw5.setText("");
        cmbOption.setSelectedIndex(0);
        txtcntct.setText("");

    }//GEN-LAST:event_btnclr6MouseClicked

    private void btnclr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclr6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclr6ActionPerformed

    private void btndlt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndlt6MouseClicked
        
    }//GEN-LAST:event_btndlt6MouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        String PATTERN = "^[a-zA-Z0]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtName.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Incorrect Username!");
            txtName.setText("");
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtcntctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcntctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcntctActionPerformed

    private void txtcntctKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcntctKeyPressed
       String PATTERN = "^[0-9]{0,9}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtcntct.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Incorrect PhoneNumber!");
            txtcntct.setText("");
        }
    }//GEN-LAST:event_txtcntctKeyPressed

    private void txtcntctKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcntctKeyTyped
        
    }//GEN-LAST:event_txtcntctKeyTyped

    
    private void ShowUser()
    {
        try{
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                st = con.createStatement();
                rs = st.executeQuery("select * from user");  
                tbluser5.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            
        }
    }
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
            java.util.logging.Logger.getLogger(UserMgt5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMgt5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMgt5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMgt5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMgt5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd6;
    private javax.swing.JButton btncancel6;
    private javax.swing.JButton btnclr6;
    private javax.swing.JButton btndlt6;
    private javax.swing.JButton btnedit6;
    private javax.swing.JButton btnhome6;
    private javax.swing.JComboBox<String> cmbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcatname4;
    private javax.swing.JLabel lblhed6;
    private javax.swing.JLabel lblopt;
    private javax.swing.JLabel lblopt1;
    private javax.swing.JLabel lblprdcthed4;
    private javax.swing.JLabel lblupw5;
    private javax.swing.JPanel pnlorder6;
    private javax.swing.JTable tbluser5;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtcntct;
    private javax.swing.JTextField txtuserpw5;
    // End of variables declaration//GEN-END:variables
}
