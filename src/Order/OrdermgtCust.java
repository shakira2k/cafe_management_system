/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Order;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class OrdermgtCust extends javax.swing.JFrame {

    public OrdermgtCust() {
        initComponents();
        ShowProduct();
        Connect();
//        update();
    }
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    DefaultTableModel df;

    public void Connect() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            //st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update() {
        try {
            newqty = (availqty - Integer.valueOf(txtpqty6cust.getText()));
            con = DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            String qry = ("UPDATE product SET prodqty=" + newqty + " WHERE prodid=" + pid);
            Statement add = con.createStatement();
            add.executeUpdate(qry);
            
            DefaultTableModel model = (DefaultTableModel) tblprod6cst.getModel();
            int MyIndex = tblprod6cst.getSelectedRow();
            pid = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
            ShowProduct();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Yes");
        }
    }
    
    

    private void ShowProduct() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from product");
            tblprod6cst.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnlogoutcust = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblhed6 = new javax.swing.JLabel();
        lblprdcthed5 = new javax.swing.JLabel();
        btncancel6 = new javax.swing.JButton();
        btncancelord = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelpnm6 = new javax.swing.JLabel();
        jLabelpqty6 = new javax.swing.JLabel();
        txtpnamecust = new javax.swing.JTextField();
        txtpqty6cust = new javax.swing.JTextField();
        addbillcust = new javax.swing.JButton();
        clrcust = new javax.swing.JButton();
        lblprdcthed6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblprod6cst = new javax.swing.JTable();
        btnprint6cst = new javax.swing.JButton();
        lblrscst = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxtcst = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnlogoutcust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogoutcust.setText("Logout");
        btnlogoutcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutcustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(btnlogoutcust, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlogoutcust)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 800, 50));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed6.setForeground(new java.awt.Color(255, 255, 255));
        lblhed6.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 30));

        lblprdcthed5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed5.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed5.setText("Cashier Billing Point");
        jPanel1.add(lblprdcthed5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        btncancel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel6.setText("X");
        jPanel1.add(btncancel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        btncancelord.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancelord.setText("X");
        btncancelord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelordMouseClicked(evt);
            }
        });
        btncancelord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelordActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelord, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0,250));

        jLabelpnm6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelpnm6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpnm6.setText("Product Name");

        jLabelpqty6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelpqty6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpqty6.setText("Quantity");

        txtpnamecust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpnamecust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpnamecustKeyPressed(evt);
            }
        });

        txtpqty6cust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpqty6cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpqty6custActionPerformed(evt);
            }
        });
        txtpqty6cust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpqty6custKeyPressed(evt);
            }
        });

        addbillcust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbillcust.setText("Add To Bill");
        addbillcust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbillcustMouseClicked(evt);
            }
        });
        addbillcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbillcustActionPerformed(evt);
            }
        });

        clrcust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clrcust.setText("Clear");
        clrcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrcustActionPerformed(evt);
            }
        });

        lblprdcthed6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed6.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed6.setText("Product List");

        tblprod6cst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "prodid", "prodname", "prodqty", "prodprice", "category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblprod6cst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprod6cstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblprod6cst);

        btnprint6cst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnprint6cst.setText("Print");
        btnprint6cst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprint6cstMouseClicked(evt);
            }
        });
        btnprint6cst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprint6cstActionPerformed(evt);
            }
        });

        lblrscst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrscst.setForeground(new java.awt.Color(255, 255, 255));
        lblrscst.setText("Rs.");

        BillTxtcst.setColumns(20);
        BillTxtcst.setRows(5);
        jScrollPane2.setViewportView(BillTxtcst);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(lblprdcthed6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelpqty6)
                                    .addComponent(addbillcust, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelpnm6)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpnamecust, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpqty6cust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrcust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblrscst)
                    .addComponent(btnprint6cst))
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblprdcthed6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpnamecust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelpnm6))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpqty6cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelpqty6))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbillcust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrcust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(lblrscst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btnprint6cst)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutcustActionPerformed
        login.login1 lo = new login.login1();
        this.setVisible(false);
        lo.setVisible(true);
    }//GEN-LAST:event_btnlogoutcustActionPerformed

    private void txtpnamecustKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnamecustKeyPressed
        String PATTERN = "^[a-zA-Z0]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpnamecust.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid Product Name!");
            txtpnamecust.setText("");
        }
    }//GEN-LAST:event_txtpnamecustKeyPressed

    private void txtpqty6custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpqty6custActionPerformed

    }//GEN-LAST:event_txtpqty6custActionPerformed

    private void txtpqty6custKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpqty6custKeyPressed
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpqty6cust.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity!");
            txtpqty6cust.setText("");

        }
    }//GEN-LAST:event_txtpqty6custKeyPressed

    Double uprice, prodtot = 0.00, grdtot = 0.00;
    int availqty;
    int pid;
    int newqty;
    
    int i = 0;
    private void addbillcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbillcustMouseClicked
        if (txtpnamecust.getText().isEmpty() || txtpqty6cust.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else if (availqty < Integer.parseInt(txtpqty6cust.getText())) {
            JOptionPane.showMessageDialog(this, "Not Available At The Moment!");
            
            txtpnamecust.setText("");
            txtpqty6cust.setText("");
        } else {

            i++;
            prodtot = uprice * Double.valueOf(txtpqty6cust.getText());
            grdtot = grdtot + prodtot;
            if (i == 1) {
                BillTxtcst.setText(BillTxtcst.getText() + "            ******* The City Cafe - Kandy *******\n" + "               We Create Delicious Memories       \n" + "                    www.citycafekandy.com      \n\n" + "ID       PRODUCT           PRICE       QTY       TOTAL\n" + i + "        " + txtpnamecust.getText() + "          " + uprice + "          " + txtpqty6cust.getText() + "          " + prodtot + "\n");
            } else {
                BillTxtcst.setText(BillTxtcst.getText() + i + "        " + txtpnamecust.getText() + "          " + uprice + "          " + txtpqty6cust.getText() + "          " + prodtot + "\n");

            }
            lblrscst.setText("Rs." + grdtot);
            JOptionPane.showMessageDialog(this, "Order Added to the Bill Successfully!");
            //            update();

        }
    }//GEN-LAST:event_addbillcustMouseClicked

    private void addbillcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbillcustActionPerformed

        update();
    }//GEN-LAST:event_addbillcustActionPerformed

    private void clrcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrcustActionPerformed

        txtpqty6cust.setText("");
        BillTxtcst.setText("");
    }//GEN-LAST:event_clrcustActionPerformed

    private void tblprod6cstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprod6cstMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblprod6cst.getModel();
        int MyIndex = tblprod6cst.getSelectedRow();
        //key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtpnamecust.setText((model.getValueAt(MyIndex, 1)).toString());
        pid = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        availqty = Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        //txtuserpw5.setText(model.getValueAt(MyIndex, 2).toString());
        uprice = Double.valueOf(model.getValueAt(MyIndex, 3).toString());
        //        newqty = (availqty - Integer.valueOf(txtpqty6.getText()));

        //        prodtot = uprice * Integer.valueOf(txtpqty6.getText());

        //update();
    }//GEN-LAST:event_tblprod6cstMouseClicked

    private void btnprint6cstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprint6cstMouseClicked
        try {
            BillTxtcst.print();
        } catch (PrinterException e) {

        }
    }//GEN-LAST:event_btnprint6cstMouseClicked

    private void btnprint6cstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprint6cstActionPerformed

    }//GEN-LAST:event_btnprint6cstActionPerformed

    private void btncancelordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelordActionPerformed
        User.UserMgt5 cls = new User.UserMgt5();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancelordActionPerformed

    private void btncancelordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelordMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncancelordMouseClicked

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
            java.util.logging.Logger.getLogger(OrdermgtCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdermgtCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdermgtCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdermgtCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdermgtCust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BillTxtcst;
    private javax.swing.JButton addbillcust;
    private javax.swing.JButton btncancel6;
    private javax.swing.JButton btncancelord;
    private javax.swing.JButton btnlogoutcust;
    private javax.swing.JButton btnprint6cst;
    private javax.swing.JButton clrcust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelpnm6;
    private javax.swing.JLabel jLabelpqty6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblhed6;
    private javax.swing.JLabel lblprdcthed5;
    private javax.swing.JLabel lblprdcthed6;
    private javax.swing.JLabel lblrscst;
    private javax.swing.JTable tblprod6cst;
    private javax.swing.JTextField txtpnamecust;
    private javax.swing.JTextField txtpqty6cust;
    // End of variables declaration//GEN-END:variables

   
}
