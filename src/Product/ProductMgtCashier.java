/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Product;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.Date; 


public class ProductMgtCashier extends javax.swing.JFrame {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    /** Creates new form ProductMgt2 */
    public ProductMgtCashier() {
        initComponents();
        SelectProd();
        SelectBev();
        CountProd();
        CountBev();
        GetCat();
        txtpname2.setEditable(false);
        txtprice2.setEditable(false);
        cmbcat2.setEditable(false);
        txtbvgname.setEditable(false);
        txtbvgprc.setEditable(false);
        FilterProduct();
        ShowBev();
        checkExp();
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
        btnadd2p = new javax.swing.JButton();
        btnedit2p = new javax.swing.JButton();
        btnclr2p = new javax.swing.JButton();
        btndlt2p = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduct2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbvg2 = new javax.swing.JTable();
        lblprdctTbl = new javax.swing.JLabel();
        lblbevTbl = new javax.swing.JLabel();
        btnclrbvg = new javax.swing.JButton();
        btnaddbvg = new javax.swing.JButton();
        btneditbvg = new javax.swing.JButton();
        btndltbvg = new javax.swing.JButton();
        jLabelbvgnm = new javax.swing.JLabel();
        jLabelbvgprice = new javax.swing.JLabel();
        cmbcat2 = new javax.swing.JComboBox<>();
        txtbvgprc = new javax.swing.JTextField();
        txtbvgname = new javax.swing.JTextField();
        menuDate = new com.toedter.calendar.JDateChooser();
        expDate = new com.toedter.calendar.JDateChooser();
        lblcat3 = new javax.swing.JLabel();
        lblcat4 = new javax.swing.JLabel();
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
        jPanel2.add(lblprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblpname2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpname2.setForeground(new java.awt.Color(255, 255, 255));
        lblpname2.setText("Product Name");
        jPanel2.add(lblpname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

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
        jPanel2.add(txtpqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, -1));

        lblpqty2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpqty2.setForeground(new java.awt.Color(255, 255, 255));
        lblpqty2.setText("Product Qty");
        jPanel2.add(lblpqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 22));

        lblcat2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcat2.setForeground(new java.awt.Color(255, 255, 255));
        lblcat2.setText("Category");
        jPanel2.add(lblcat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 22));

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
        jPanel2.add(txtprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, -1));

        btnadd2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd2p.setText("Add");
        btnadd2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd2pActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, -1));

        btnedit2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit2p.setText("Edit");
        btnedit2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit2pActionPerformed(evt);
            }
        });
        jPanel2.add(btnedit2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, -1));

        btnclr2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclr2p.setText("Clear");
        btnclr2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclr2pActionPerformed(evt);
            }
        });
        jPanel2.add(btnclr2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 80, -1));

        btndlt2p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndlt2p.setText("Delete");
        btndlt2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlt2pActionPerformed(evt);
            }
        });
        jPanel2.add(btndlt2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, -1));

        tblproduct2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblproduct2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prod_Id", "Prod_Name", "Qty", "Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 380, 170));

        tblbvg2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "bvgid", "bvgname", "bvgprice"
            }
        ));
        tblbvg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbvg2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbvg2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 390, 170));

        lblprdctTbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdctTbl.setForeground(new java.awt.Color(255, 255, 255));
        lblprdctTbl.setText("Products");
        jPanel2.add(lblprdctTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        lblbevTbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblbevTbl.setForeground(new java.awt.Color(255, 255, 255));
        lblbevTbl.setText("Beverages");
        jPanel2.add(lblbevTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        btnclrbvg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclrbvg.setText("Clear");
        btnclrbvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrbvgActionPerformed(evt);
            }
        });
        jPanel2.add(btnclrbvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 90, -1));

        btnaddbvg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddbvg.setText("Add");
        btnaddbvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddbvgActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddbvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 90, -1));

        btneditbvg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneditbvg.setText("Edit");
        btneditbvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditbvgActionPerformed(evt);
            }
        });
        jPanel2.add(btneditbvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 90, -1));

        btndltbvg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndltbvg.setText("Delete");
        btndltbvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltbvgActionPerformed(evt);
            }
        });
        jPanel2.add(btndltbvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 90, -1));

        jLabelbvgnm.setBackground(new java.awt.Color(0, 0, 0));
        jLabelbvgnm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelbvgnm.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbvgnm.setText("Beverage Name");
        jPanel2.add(jLabelbvgnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabelbvgprice.setBackground(new java.awt.Color(0, 0, 0));
        jLabelbvgprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelbvgprice.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbvgprice.setText("Beverage Price");
        jPanel2.add(jLabelbvgprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        cmbcat2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbcat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcat2ActionPerformed(evt);
            }
        });
        jPanel2.add(cmbcat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, -1));

        txtbvgprc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtbvgprc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbvgprcActionPerformed(evt);
            }
        });
        jPanel2.add(txtbvgprc, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 100, -1));

        txtbvgname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtbvgname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbvgnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtbvgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 100, -1));
        jPanel2.add(menuDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));
        jPanel2.add(expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 100, -1));

        lblcat3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcat3.setForeground(new java.awt.Color(255, 255, 255));
        lblcat3.setText("Expired Date");
        jPanel2.add(lblcat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        lblcat4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcat4.setForeground(new java.awt.Color(255, 255, 255));
        lblcat4.setText("Menufect.. Date");
        jPanel2.add(lblcat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 820, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Product/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 510));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        lblhed2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed2.setForeground(new java.awt.Color(255, 255, 255));
        lblhed2.setText("The City Cafe - Kandy");

        lblprdcthed2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed2.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed2.setText("Product Management");

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
                .addGap(290, 290, 290)
                .addComponent(lblhed2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(btncancel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblprdcthed2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhed2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel2))
                .addGap(0, 0, 0)
                .addComponent(lblprdcthed2))
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(btnhome2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 860, 50));

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
//            
           


           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafecms","root","");
//           st = con.createStatement();
           rs = (ResultSet) st.executeQuery("select * from product where expDate = 2023-09-01 ");

//            String sql = "SELECT * FROM product WHERE expDate < ?";

//            PreparedStatement preparedStatement = con.prepareStatement(sql);
      
 
            
//            preparedStatement.setDate(1, );

            // Execute the query
//            ResultSet resultSet = preparedStatement.executeQuery();
           
           tblproduct2.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            
        }
    }
    
    public void SelectBev(){
        try{
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafecms","root","");
           st = con.createStatement();
           rs = (ResultSet) st.executeQuery("select * from beverage");
           tblbvg2.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            
        }
    }
    
     private void GetCat(){
        try{
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
           st = con.createStatement();
           String query = "select * from category";
           rs = st.executeQuery(query);
           while(rs.next())
           {
               String MyCat = rs.getString("catname");
               cmbcat2.addItem(MyCat);
               
           }
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
        Home.CashierHomePage ho = new Home.CashierHomePage ();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome2ActionPerformed

    private void btncancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel2ActionPerformed
        Product.ProductMgtCashier cls = new Product.ProductMgtCashier();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancel2ActionPerformed

    private void btnadd2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd2pActionPerformed
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || cmbcat2.getSelectedIndex() == -1 || expDate.getDate() == null || menuDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                
                Statement st = con.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery("select * from product where prodname = '" + txtpname2.getText() + "'");
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Product Already Exist!");
                }else{
              
                    PreparedStatement add = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?,?,?)");
                    //add.setString(1, code.getText().toString());
                    //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                    String ExpDate = dateFormat.format(expDate.getDate());
                    String MenuDate = dateFormat.format(menuDate.getDate());
                    
                    add.setInt(1, pnum);
                    add.setString(2, txtpname2.getText());
                    add.setString(3, txtpqty2.getText());
                    add.setString(4, txtprice2.getText());
                    add.setString(5, cmbcat2.getSelectedItem().toString());
                    add.setString(6, ExpDate);
                    add.setString(7, MenuDate);
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
    }//GEN-LAST:event_btnadd2pActionPerformed

    private void btnedit2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit2pActionPerformed
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || cmbcat2.getSelectedIndex() == -1 || expDate.getDate() == null || menuDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE product SET prodname=?,prodqty=?,price=?,category=?,expDate=?,menuDate=? WHERE prodid=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                
                String ExpDate = dateFormat.format(expDate.getDate());
                String MenuDate = dateFormat.format(menuDate.getDate());
                
                add.setInt(7, key);
                add.setString(1, txtpname2.getText());
                add.setString(2, txtpqty2.getText());
                add.setString(3, txtprice2.getText());
                add.setString(4, cmbcat2.getSelectedItem().toString());
                add.setString(5, ExpDate);
                add.setString(6, MenuDate);
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
        txtpname2.setText(model.getValueAt(MyIndex, 1).toString());
        txtpqty2.setText(model.getValueAt(MyIndex, 2).toString());
        txtprice2.setText(model.getValueAt(MyIndex, 3).toString());
        cmbcat2.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
      
        
        try {
            expDate.setDate( dateFormat.parse(model.getValueAt(MyIndex, 5).toString()));
            menuDate.setDate( dateFormat.parse(model.getValueAt(MyIndex, 6).toString()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblproduct2MouseClicked

    
    
    private void btndlt2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlt2pActionPerformed
        if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || cmbcat2.getSelectedIndex() == -1 )
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
                
                ShowProduct();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btndlt2pActionPerformed

    private void btnclr2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclr2pActionPerformed
        txtpname2.setText("");
        txtpqty2.setText("");
        txtprice2.setText("");
        cmbcat2.setSelectedItem("");

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

    private void cmbcat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcat2ActionPerformed

    private void txtbvgnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbvgnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbvgnameActionPerformed

    private void btnaddbvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddbvgActionPerformed
        if (txtbvgname.getText().isEmpty() || txtbvgprc.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }else {
            try{
                CountBev();
                
                 con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                
                Statement st = con.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery("select * from beverage where bevName = '" + txtbvgname.getText() + "'");
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Beverage Already Exist!");
                }
                else{

                PreparedStatement add = con.prepareStatement("INSERT INTO beverage VALUES(?,?,?,?)");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, pnum);
                add.setString(2, txtbvgname.getText());
                add.setDouble(3, Double.parseDouble(txtbvgprc.getText()));
                add.setString(4, "beverage");
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Beverage Added successfully !");
                txtbvgname.setText("");
                txtbvgprc.setText("");
                }
                con.close();
                FilterProduct();
                ShowBev();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }                                        

   // private void btnedit2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       /* if (txtpname2.getText().isEmpty() || txtpqty2.getText().isEmpty() || txtprice2.getText().isEmpty() || cmbcat2.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountProd();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE product SET prodname=?,prodqty=?,price=?,category=?  WHERE prodid=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(5, key);
                add.setString(1, txtpname2.getText());
                add.setString(2, txtpqty2.getText());
                add.setString(3, txtprice2.getText());
                add.setString(4, cmbcat2.getSelectedItem().toString());
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
    }//GEN-LAST:event_btnaddbvgActionPerformed
*/
    int key1 =0;
    private void tblbvg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbvg2MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblbvg2.getModel();
        int MyIndex = tblbvg2.getSelectedRow();
        key1 = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtbvgname.setText(model.getValueAt(MyIndex, 1).toString());
        txtbvgprc.setText(model.getValueAt(MyIndex, 2).toString());
        
    }//GEN-LAST:event_tblbvg2MouseClicked

    private void btneditbvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditbvgActionPerformed
        if (txtbvgname.getText().isEmpty() || txtbvgprc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else {
            try{
                CountBev();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE beverage SET bevName=?,bevPrice=?  WHERE id=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(3, key1);
                add.setString(1, txtbvgname.getText());
                add.setDouble(2, Double.parseDouble(txtbvgprc.getText()));
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Beverage Edited successfully !");
                txtbvgname.setText("");
                txtbvgprc.setText("");
                
                con.close();
                FilterProduct();
                ShowBev();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btneditbvgActionPerformed

    private void btndltbvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltbvgActionPerformed
         if (txtbvgname.getText().isEmpty() || txtbvgprc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountBev();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("DELETE FROM beverage WHERE id = ?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, key1);
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Beverage Deleted successfully !");
                txtbvgname.setText("");
                txtbvgprc.setText("");
                
                con.close();
                
                ShowBev();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btndltbvgActionPerformed

    private void txtbvgprcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbvgprcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbvgprcActionPerformed

    private void btnclrbvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrbvgActionPerformed
       txtbvgname.setText("");
       txtbvgprc.setText("");
    }//GEN-LAST:event_btnclrbvgActionPerformed

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
    
    private void ShowBev()
    {
        try{
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                st = con.createStatement();
                rs = st.executeQuery("select * from beverage");  
                tblbvg2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            //JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void FilterProduct()
    {
        try{
            
              //  LocalDate currentDate = (LocalDate.now()).minusDays(0); 
               // Date cDate = Date.valueOf(currentDate);
                
                //System.out.println(cDate);
                
               // rs = (ResultSet) st.executeQuery("select * from product where expDate > '"+cDate+"' AND category <> 'SoftDrink'");
            
            
               // con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
               // st = con.createStatement();
//                rs = st.executeQuery("select * from product");  
               //tblproduct2.setModel(DbUtils.resultSetToTableModel(rs));
               
               rs = (ResultSet) st.executeQuery("select * from product where category <> 'SoftDrink'");
            
            
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                st = con.createStatement();
//                rs = st.executeQuery("select * from product");  
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
            java.util.logging.Logger.getLogger(ProductMgtCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductMgtCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductMgtCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductMgtCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductMgtCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd2p;
    private javax.swing.JButton btnaddbvg;
    private javax.swing.JButton btncancel2;
    private javax.swing.JButton btnclr2p;
    private javax.swing.JButton btnclrbvg;
    private javax.swing.JButton btndlt2p;
    private javax.swing.JButton btndltbvg;
    private javax.swing.JButton btnedit2p;
    private javax.swing.JButton btneditbvg;
    private javax.swing.JButton btnhome2;
    private javax.swing.JComboBox<String> cmbcat2;
    private com.toedter.calendar.JDateChooser expDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelbvgnm;
    private javax.swing.JLabel jLabelbvgprice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblbevTbl;
    private javax.swing.JLabel lblcat2;
    private javax.swing.JLabel lblcat3;
    private javax.swing.JLabel lblcat4;
    private javax.swing.JLabel lblhed2;
    private javax.swing.JLabel lblpname2;
    private javax.swing.JLabel lblpqty2;
    private javax.swing.JLabel lblprdctTbl;
    private javax.swing.JLabel lblprdcthed2;
    private javax.swing.JLabel lblprice2;
    private com.toedter.calendar.JDateChooser menuDate;
    private javax.swing.JTable tblbvg2;
    private javax.swing.JTable tblproduct2;
    private javax.swing.JTextField txtbvgname;
    private javax.swing.JTextField txtbvgprc;
    private javax.swing.JTextField txtpname2;
    private javax.swing.JTextField txtpqty2;
    private javax.swing.JTextField txtprice2;
    // End of variables declaration//GEN-END:variables

}
