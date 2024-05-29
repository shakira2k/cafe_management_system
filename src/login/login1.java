/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import Home.CashierHomePage;
import Home.homePage3;
import Order.OrderMgt;
import Order.OrdermgtCust;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class login1 extends javax.swing.JFrame {

    public login1() {
        initComponents();
        checkExp();
    }

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void checkExp(){
        LocalDate currentDate = (LocalDate.now()).minusDays(1); 
        Date cDate = Date.valueOf(currentDate);
        
        try {
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
            PreparedStatement add = con.prepareStatement("UPDATE product SET prodqty = ? WHERE expDate < ?");
            add.setInt(1, 0);
            add.setDate(2, cDate);
            add.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelhed = new javax.swing.JPanel();
        jLabelh1 = new javax.swing.JLabel();
        jLabelh2 = new javax.swing.JLabel();
        jLabelh3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblhed = new javax.swing.JLabel();
        lblprdcthed = new javax.swing.JLabel();
        lblpw = new javax.swing.JLabel();
        lblselectrole = new javax.swing.JLabel();
        btnclear1 = new javax.swing.JButton();
        btnlog1 = new javax.swing.JButton();
        pwd1 = new javax.swing.JPasswordField();
        lblun2 = new javax.swing.JLabel();
        txtunm = new javax.swing.JTextField();
        cmbselctrole = new javax.swing.JComboBox<>();
        jLabelbg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelhed.setBackground(new java.awt.Color(153, 51, 0));

        jLabelh1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabelh1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelh1.setText("We Create");

        jLabelh2.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabelh2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelh2.setText("Delicous");

        jLabelh3.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabelh3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelh3.setText("Memories !");

        javax.swing.GroupLayout jPanelhedLayout = new javax.swing.GroupLayout(jPanelhed);
        jPanelhed.setLayout(jPanelhedLayout);
        jPanelhedLayout.setHorizontalGroup(
            jPanelhedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelhedLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelhedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelh3)
                    .addGroup(jPanelhedLayout.createSequentialGroup()
                        .addGroup(jPanelhedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelh1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelhedLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelh2)))
                        .addGap(10, 10, 10)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelhedLayout.setVerticalGroup(
            jPanelhedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelhedLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabelh1)
                .addGap(18, 18, 18)
                .addComponent(jLabelh2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelh3)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelhed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 410));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed.setForeground(new java.awt.Color(255, 255, 255));
        lblhed.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        lblprdcthed.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed.setText("Login Management");
        jPanel1.add(lblprdcthed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblpw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpw.setForeground(new java.awt.Color(255, 255, 255));
        lblpw.setText("User Password");
        jPanel1.add(lblpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lblselectrole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblselectrole.setForeground(new java.awt.Color(255, 255, 255));
        lblselectrole.setText("Select Role");
        jPanel1.add(lblselectrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        btnclear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear1.setText("CLEAR");
        btnclear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclear1MouseClicked(evt);
            }
        });
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        btnlog1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlog1.setText("LOGIN");
        btnlog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlog1MouseClicked(evt);
            }
        });
        btnlog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlog1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        pwd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 140, -1));

        lblun2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblun2.setForeground(new java.awt.Color(255, 255, 255));
        lblun2.setText("User Name");
        jPanel1.add(lblun2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        txtunm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtunm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunmActionPerformed(evt);
            }
        });
        txtunm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtunmKeyPressed(evt);
            }
        });
        jPanel1.add(txtunm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 140, -1));

        cmbselctrole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbselctrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier" }));
        jPanel1.add(cmbselctrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 140, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 370));

        jLabelbg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/cup-coffee-with-leaf-design-it_1340-23640.jpg"))); // NOI18N
        jLabelbg1.setText("jLabel1");
        jPanel2.add(jLabelbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 490, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed

    }//GEN-LAST:event_btnclear1ActionPerformed

    private void btnlog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlog1ActionPerformed

        /* String userName = txtunm1.getText();
      String password = pwd1.getText();
      
      if(userName.equals("") && password.equals("")){
          JOptionPane.showMessageDialog(this, "Enter the UserName and Password");
      }
      else if(!(userName.equals("")) && password.equals("")){
          JOptionPane.showMessageDialog(this, "Enter the Password");
      }else if(userName.equals("") && !(password.equals(""))){
          JOptionPane.showMessageDialog(this, "Enter the Username");
      }else if(txtunm1.getText().equals("admin") && pwd1.getText().equals("1234")){
            
            Home.homePage3 ho = new Home.homePage3 ();
            this.setVisible(false);
            ho.setVisible(true);
      }*/
        String user = txtunm.getText();
        String pa = pwd1.getText();
        String op = cmbselctrole.getSelectedItem().toString();

        if (user.equals("") && pa.equals("") && op.equals("select")) {
            JOptionPane.showMessageDialog(this, "Please Enter UserName and Password");
        } else if (!(user.equals("")) && pa.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter the Password");
        } else if (user.equals("") && !(pa.equals(""))) {
            JOptionPane.showMessageDialog(this, "Please Enter the username");
        } else {

            try {
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery("select * from user where username = '" + user + "'");
                if (rs.next()) {
                    String userName = rs.getString("username");
                    String password = rs.getString("password");
                    String opt = rs.getString ("option");

                    if (op.equalsIgnoreCase("Admin")&& opt.equalsIgnoreCase("admin")&&(user.equals(userName)) && (pa.equals(password))){
                        System.out.println(userName + password);
                        dispose();
                        new homePage3().setVisible(true);
                    }
                    
                     if (op.equalsIgnoreCase("Cashier")&& opt.equalsIgnoreCase("cashier")&&(user.equals(userName)) && (pa.equals(password))){
                        System.out.println(userName + password);
                        dispose();
                        new CashierHomePage().setVisible(true);
//                        new OrderMgt().setVisible(true);
                    }
                     
                    else if ((user.equals(userName)) && (!pa.equals(password))) {
                        JOptionPane.showMessageDialog(this, "Password is Incorrect.");
                    } 
                        
                }
                    
                        else{
                    JOptionPane.showMessageDialog(this, "Username is Incorrect.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnlog1ActionPerformed

    private void btnlog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlog1MouseClicked

        
    }//GEN-LAST:event_btnlog1MouseClicked

    private void btnclear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclear1MouseClicked
        txtunm.setText("");
        pwd1.setText("");
    }//GEN-LAST:event_btnclear1MouseClicked

    private void txtunmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunmActionPerformed

    private void txtunmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunmKeyPressed
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtunm.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Username Name!");
            txtunm.setText("");
        }
    }//GEN-LAST:event_txtunmKeyPressed

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
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnlog1;
    private javax.swing.JComboBox<String> cmbselctrole;
    private javax.swing.JLabel jLabelbg1;
    private javax.swing.JLabel jLabelh1;
    private javax.swing.JLabel jLabelh2;
    private javax.swing.JLabel jLabelh3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelhed;
    private javax.swing.JLabel lblhed;
    private javax.swing.JLabel lblprdcthed;
    private javax.swing.JLabel lblpw;
    private javax.swing.JLabel lblselectrole;
    private javax.swing.JLabel lblun2;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JTextField txtunm;
    // End of variables declaration//GEN-END:variables
}
