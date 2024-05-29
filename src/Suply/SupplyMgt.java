/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Suply;
import Product.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;


public class SupplyMgt extends javax.swing.JFrame {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public SupplyMgt() {
        initComponents();
        SelectProd();
//        SelectBev();
        CountProd();
        CountBev();
//        GetCat();
        FilterProduct();
//        ShowBev();
    }
    
    Connection con = null;
    Statement st = null, st1=null;
    ResultSet rs = null, rs1=null;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblprice2 = new javax.swing.JLabel();
        lblpname2 = new javax.swing.JLabel();
        txtpqty2 = new javax.swing.JTextField();
        lblpqty2 = new javax.swing.JLabel();
        lblcat2 = new javax.swing.JLabel();
        txtpname2 = new javax.swing.JTextField();
        txtprice2 = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnedit2p = new javax.swing.JButton();
        btnclr2p = new javax.swing.JButton();
        btndlt2p = new javax.swing.JButton();
        menuDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduct2 = new javax.swing.JTable();
        lblprdctTbl = new javax.swing.JLabel();
        expDate = new com.toedter.calendar.JDateChooser();
        lblpname3 = new javax.swing.JLabel();
        cmbBeavrg = new javax.swing.JComboBox<>();
        lblcat3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblhed2 = new javax.swing.JLabel();
        lblprdcthed2 = new javax.swing.JLabel();
        btncancel2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnhome2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0, 160));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblprice2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblprice2.setForeground(new java.awt.Color(255, 255, 255));
        lblprice2.setText("Product Price");
        jPanel2.add(lblprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblpname2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpname2.setForeground(new java.awt.Color(255, 255, 255));
        lblpname2.setText("Size");
        jPanel2.add(lblpname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtpqty2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpqty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpqty2ActionPerformed(evt);
            }
        });
        txtpqty2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpqty2KeyPressed(evt);
            }
        });
        jPanel2.add(txtpqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, -1));

        lblpqty2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpqty2.setForeground(new java.awt.Color(255, 255, 255));
        lblpqty2.setText("Product Qty");
        jPanel2.add(lblpqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 22));

        lblcat2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcat2.setForeground(new java.awt.Color(255, 255, 255));
        lblcat2.setText("Manufuctured Date");
        jPanel2.add(lblcat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        txtpname2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpname2ActionPerformed(evt);
            }
        });
        txtpname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpname2KeyPressed(evt);
            }
        });
        jPanel2.add(txtpname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, -1));

        txtprice2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtprice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprice2ActionPerformed(evt);
            }
        });
        txtprice2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprice2KeyPressed(evt);
            }
        });
        jPanel2.add(txtprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, -1));

        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        btnedit2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit2p.setText("Edit");
        btnedit2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit2pActionPerformed(evt);
            }
        });
        jPanel2.add(btnedit2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, -1));

        btnclr2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclr2p.setText("Clear");
        btnclr2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclr2pActionPerformed(evt);
            }
        });
        jPanel2.add(btnclr2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 80, -1));

        btndlt2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndlt2p.setText("Delete");
        btndlt2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlt2pActionPerformed(evt);
            }
        });
        jPanel2.add(btndlt2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 90, -1));

        menuDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(menuDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));

        tblproduct2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblproduct2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod_Id", "Prod_Name", "Beverage", "Qty", "Price", "Exp. Date", "Menu. Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblproduct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblproduct2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproduct2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 460, 170));

        lblprdctTbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdctTbl.setForeground(new java.awt.Color(255, 255, 255));
        lblprdctTbl.setText("Soft Drinks");
        jPanel2.add(lblprdctTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        expDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 100, -1));

        lblpname3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpname3.setForeground(new java.awt.Color(255, 255, 255));
        lblpname3.setText("Product Name");
        jPanel2.add(lblpname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cmbBeavrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200 ml", "250 ml", "500 ml", "750 ml", "1000 ml", "2000 ml" }));
        cmbBeavrg.setToolTipText("");
        jPanel2.add(cmbBeavrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, -1));

        lblcat3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcat3.setForeground(new java.awt.Color(255, 255, 255));
        lblcat3.setText("Expired Date");
        jPanel2.add(lblcat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 820, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Product/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 460));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        lblhed2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed2.setForeground(new java.awt.Color(255, 255, 255));
        lblhed2.setText("The City Cafe - Kandy");

        lblprdcthed2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprdcthed2.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed2.setText("Supply Management");

        btncancel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel2.setText("X");
        btncancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(lblhed2)
                .addGap(274, 274, 274)
                .addComponent(btncancel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(lblprdcthed2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncancel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblhed2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblprdcthed2)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnhome2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhome2.setText("Home");
        btnhome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(btnhome2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 860, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int pnum;
    private void CountProd()
    
    {
        try{
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select Max (prodid) from product");
            rs1.next();
            pnum = rs1.getInt(1)+1;
        }catch (Exception e){
            
        }
    }
    
    int bnum;
    private void CountBev()
    
    {
        try{
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select Max (beverageId) from beverage");
            rs1.next();
            pnum = rs1.getInt(1)+1;
        }catch (Exception e){
            
        }
    }
    
    public void SelectProd(){
        try{
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafecms","root","");
           st = con.createStatement();
           rs = (ResultSet) st.executeQuery("select * from product");
           tblproduct2.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            
        }
    }
    
    
    
    private void txtpqty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpqty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpqty2ActionPerformed

    private void txtpname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpname2ActionPerformed

    private void txtprice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprice2ActionPerformed

    private void btnhome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome2ActionPerformed
        Home.homePage3 ho = new Home.homePage3 ();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome2ActionPerformed

    private void btncancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel2ActionPerformed
//        Product.SupplyMgt cls = new Product.SupplyMgt();
//        this.setVisible(false);
//        cls.setVisible(false);
    }//GEN-LAST:event_btncancel2ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        String formattedExpDate = "";
        
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || expDate.getDate() == null || menuDate.getDate() == null || cmbBeavrg.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                
                formattedExpDate = dateFormat.format(expDate.getDate());
                
                Statement st = con.createStatement();
                
                String SoftDrinkName = txtpname2.getText() + " - " + cmbBeavrg.getSelectedItem().toString();
                
                ResultSet rs = (ResultSet) st.executeQuery("select * from supply where prodname = '" + SoftDrinkName + "' AND expDate = '"+ formattedExpDate +"'");
                
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Product Already Exist!");
                }else{
                    
                        
                        
                    PreparedStatement add = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?,?,?)");
//                    add.setInt(1, pnum);
                    String formattedMenuDate = dateFormat.format(menuDate.getDate());

                    add.setInt(1, pnum);
                    add.setString(2, SoftDrinkName);
                    add.setInt(3, Integer.valueOf(txtpqty2.getText()));
                    add.setString(4, txtprice2.getText());
                    add.setString(5, "SoftDrink");
                    add.setString(6, formattedExpDate);
                    add.setString(7, formattedMenuDate);
                    
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Product Added successfully !");
                    txtpname2.setText("");
                    txtpqty2.setText("");
                    txtprice2.setText("");
                    con.close();
                    FilterProduct();

                    
                    
                    
                    
                    //ShowProduct();
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
                
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnedit2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit2pActionPerformed
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || expDate.getDate() == null || menuDate.getDate() == null || cmbBeavrg.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE product SET prodname=?,prodqty=?,price=?,expDate=?, menuDate=? WHERE prodid=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                
                String formattedExpDate = dateFormat.format(expDate.getDate());
                String formattedMnuDate = dateFormat.format(menuDate.getDate());
                String SoftDrinkName = txtpname2.getText() + " - " + cmbBeavrg.getSelectedItem().toString();
                
                add.setString(1, SoftDrinkName);
                add.setInt(2, Integer.valueOf(txtpqty2.getText()));
                add.setString(3, txtprice2.getText());
                add.setString(4, formattedExpDate);
                add.setString(5, formattedMnuDate);
                add.setInt(6, key);
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Edited successfully !");
                txtpname2.setText("");
                txtpqty2.setText("");
                txtprice2.setText("");
                con.close();
                FilterProduct();
                //ShowProduct();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnedit2pActionPerformed

    int key =0;
    private void tblproduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblproduct2MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblproduct2.getModel();
        int MyIndex = tblproduct2.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        
        String pValue = model.getValueAt(MyIndex, 1).toString();
        String[] pSplitValue = pValue.split(" - "); 
   
        String pName = pSplitValue[0];
        String pBevgr = pSplitValue[1];
        
        txtpname2.setText(pName);
        cmbBeavrg.setSelectedItem(pBevgr);
        
        txtpqty2.setText(model.getValueAt(MyIndex, 2).toString());
        txtprice2.setText(model.getValueAt(MyIndex, 3).toString());
        cmbBeavrg.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        
        try {
            expDate.setDate( dateFormat.parse(model.getValueAt(MyIndex, 5).toString()));
            menuDate.setDate( dateFormat.parse(model.getValueAt(MyIndex, 6).toString()));
        } catch (Exception e) {
        }
        

    }//GEN-LAST:event_tblproduct2MouseClicked

    
    
    private void btndlt2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlt2pActionPerformed
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || expDate.getDate() == null )
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("DELETE FROM product WHERE prodid = ?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, key);
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Deleted successfully !");
                txtpname2.setText("");
                txtpqty2.setText("");
                txtprice2.setText("");
                con.close();
                
//                ShowProduct();
                FilterProduct();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btndlt2pActionPerformed

    private void btnclr2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclr2pActionPerformed
        txtpname2.setText("");
        txtpqty2.setText("");
        txtprice2.setText("");
        cmbBeavrg.setSelectedIndex(0);
//        cmbcat2.setSelectedItem("");

    }//GEN-LAST:event_btnclr2pActionPerformed

    private void txtpname2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpname2KeyPressed
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpname2.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Product Name!");
            txtpname2.setText("");
        }
    }//GEN-LAST:event_txtpname2KeyPressed

    private void txtpqty2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpqty2KeyPressed
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpqty2.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Data!");
            txtpqty2.setText("");
        }
    }//GEN-LAST:event_txtpqty2KeyPressed

    private void txtprice2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprice2KeyPressed
        String PATTERN = "^[0-9]{0,9}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtprice2.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Data!");
            txtprice2.setText("");

        }
    }//GEN-LAST:event_txtprice2KeyPressed

    int key1 =0;
    private void ShowProduct()
    {
        try{
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                st = con.createStatement();
                rs = st.executeQuery("select * from product");  
                tblproduct2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
   
    
    private void FilterProduct()
    {
        try{
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                st = con.createStatement();
                rs = st.executeQuery("select * from product where category = 'SoftDrink' ");  
                tblproduct2.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(SupplyMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplyMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplyMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplyMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplyMgt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel2;
    private javax.swing.JButton btnclr2p;
    private javax.swing.JButton btndlt2p;
    private javax.swing.JButton btnedit2p;
    private javax.swing.JButton btnhome2;
    private javax.swing.JComboBox<String> cmbBeavrg;
    private com.toedter.calendar.JDateChooser expDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcat2;
    private javax.swing.JLabel lblcat3;
    private javax.swing.JLabel lblhed2;
    private javax.swing.JLabel lblpname2;
    private javax.swing.JLabel lblpname3;
    private javax.swing.JLabel lblpqty2;
    private javax.swing.JLabel lblprdctTbl;
    private javax.swing.JLabel lblprdcthed2;
    private javax.swing.JLabel lblprice2;
    private com.toedter.calendar.JDateChooser menuDate;
    private javax.swing.JTable tblproduct2;
    private javax.swing.JTextField txtpname2;
    private javax.swing.JTextField txtpqty2;
    private javax.swing.JTextField txtprice2;
    // End of variables declaration//GEN-END:variables

}
