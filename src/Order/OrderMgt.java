
package Order;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class OrderMgt extends javax.swing.JFrame {

    public OrderMgt() {
        initComponents();
        ShowProduct();
        ShowBev();
        Connect();
        jScrollPane4.setVisible(false);
        updateBill.setEnabled(false);
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
            newqty = (availqty - Integer.valueOf(txtpqty6.getText()));
            con = DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            String qry = ("UPDATE product SET prodqty=" + newqty + " WHERE prodid=" + pid);
            Statement add = con.createStatement();
            add.executeUpdate(qry);
            
            DefaultTableModel model = (DefaultTableModel) tblprod6.getModel();
            int MyIndex = tblprod6.getSelectedRow();
            pid = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
            ShowProduct();
            //System.out.println("Here15");

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Yes");
        }
    }
    
    public void update2() {
        try {
            
            //con = DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            //String qry = ("SELECT * FROM beverage TABLE");
            //Statement add = con.createStatement();
            //add.executeUpdate(qry);
            DefaultTableModel model = (DefaultTableModel) tblbvgor.getModel();
            int MyIndex = tblbvgor.getSelectedRow();
            bid = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
            ShowBev();
            //System.out.println("Here15");

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Yes");
        }
    }

    private void ShowProduct() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from product where prodqty <> 0");
            tblprod6.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
    private void ShowBev() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from beverage");
            tblbvgor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblhed5 = new javax.swing.JLabel();
        lblprdcthed4 = new javax.swing.JLabel();
        btncancelord = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnhome5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnprint6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblbvgor1 = new javax.swing.JTable();
        jLabelpnm6 = new javax.swing.JLabel();
        jLabelpqty6 = new javax.swing.JLabel();
        txtpname6 = new javax.swing.JTextField();
        txtpqty6 = new javax.swing.JTextField();
        updateBill = new javax.swing.JButton();
        editBill = new javax.swing.JButton();
        addbill = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblprdcthed6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblprod6 = new javax.swing.JTable();
        lblrs = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblbvgor = new javax.swing.JTable();
        lblprdcthed7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed5.setForeground(new java.awt.Color(255, 255, 255));
        lblhed5.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 30));

        lblprdcthed4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed4.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed4.setText("Billing Point");
        jPanel1.add(lblprdcthed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

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
        jPanel1.add(btncancelord, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnhome5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhome5.setText("Home");
        btnhome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(btnhome5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(594, 594, 594))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1280, 50));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0,250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprint6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnprint6.setText("Print");
        btnprint6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprint6MouseClicked(evt);
            }
        });
        btnprint6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprint6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnprint6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 91, -1));

        tblbvgor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Price", "Qty", "Total", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblbvgor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbvgor1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblbvgor1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 500, 230));

        jLabelpnm6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelpnm6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpnm6.setText("Product Name");
        jPanel2.add(jLabelpnm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 97, -1, -1));

        jLabelpqty6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelpqty6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpqty6.setText("Quantity");
        jPanel2.add(jLabelpqty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtpname6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpname6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpname6KeyPressed(evt);
            }
        });
        jPanel2.add(txtpname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 98, 133, -1));

        txtpqty6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpqty6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpqty6ActionPerformed(evt);
            }
        });
        txtpqty6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpqty6KeyPressed(evt);
            }
        });
        jPanel2.add(txtpqty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 181, 133, -1));

        updateBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBill.setText("Update");
        updateBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBillMouseClicked(evt);
            }
        });
        updateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBillActionPerformed(evt);
            }
        });
        jPanel2.add(updateBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 112, 30));

        editBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBill.setText("Edit");
        editBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBillMouseClicked(evt);
            }
        });
        editBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBillActionPerformed(evt);
            }
        });
        jPanel2.add(editBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 112, 30));

        addbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbill.setText("Add To Bill");
        addbill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbillMouseClicked(evt);
            }
        });
        addbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbillActionPerformed(evt);
            }
        });
        jPanel2.add(addbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 112, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 112, 30));

        lblprdcthed6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed6.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed6.setText("Beverages");
        jPanel2.add(lblprdcthed6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        tblprod6.setModel(new javax.swing.table.DefaultTableModel(
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
        tblprod6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblprod6FocusGained(evt);
            }
        });
        tblprod6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprod6MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblprod6);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 500, 170));

        lblrs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrs.setForeground(new java.awt.Color(255, 255, 255));
        lblrs.setText("Rs.");
        jPanel2.add(lblrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        tblbvgor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bvgid", "bvgname", "bvgprice"
            }
        ));
        tblbvgor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblbvgorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblbvgorFocusLost(evt);
            }
        });
        tblbvgor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbvgorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblbvgor);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 500, 150));

        lblprdcthed7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed7.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed7.setText("Product List");
        jPanel2.add(lblprdcthed7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 890, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 910, 580));

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 370, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome5ActionPerformed
        Home.homePage3 ho = new Home.homePage3();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome5ActionPerformed


    private void btnprint6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprint6ActionPerformed

    }//GEN-LAST:event_btnprint6ActionPerformed

    private void btncancelordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelordActionPerformed
        User.UserMgt5 cls = new User.UserMgt5();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancelordActionPerformed

    private void btncancelordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelordMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncancelordMouseClicked

   
    private void addbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbillActionPerformed
//        update2();
//        update();
//        System.out.println(testRow);
    }//GEN-LAST:event_addbillActionPerformed

    int i = 0;
    Boolean isSelectedTable = false;
    private void addbillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbillMouseClicked
        
        if (txtpname6.getText().isEmpty() || txtpqty6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
            
            
        }else if (availqty < Integer.valueOf(txtpqty6.getText()) && !isSelectedTable) {
            JOptionPane.showMessageDialog(this, "Not Available At The Moment!");
            txtpname6.setText("");
            txtpqty6.setText("");
            }else if (0 >= Integer.parseInt(txtpqty6.getText()) ) {
            JOptionPane.showMessageDialog(this, "Quantity cannot be 0 value!");
            txtpqty6.setText("");
        } else {
           

            i++;
            prodtot = uprice * Double.valueOf(txtpqty6.getText());
            grdtot = grdtot + prodtot;
            
          
            int MyIndex;
            System.out.println(isSelectedTable);
            if(isSelectedTable){
                
                 System.out.println("Table B");
                if (i == 1) {
                    BillTxt.setText(BillTxt.getText() + "            ******* The City Cafe - Kandy *******\n" + "               We Create Delicious Memories       \n" + "                    www.citycafekandy.com      \n\n" + "ID       PRODUCT           PRICE       QTY       TOTAL\n" + i + "        " + txtpname6.getText() + "          " + uprice + "          " + txtpqty6.getText() + "          " + prodtot + "\n");
                } else {
                    BillTxt.setText(BillTxt.getText() + i + "        " + txtpname6.getText() + "          " + uprice + "          " + txtpqty6.getText() + "          " + prodtot + "\n");

                }
                
                DefaultTableModel model1 = (DefaultTableModel) tblbvgor.getModel();
                MyIndex = tblbvgor.getSelectedRow();
                items[i-1][0] = model1.getValueAt(MyIndex, 0).toString();
                items[i-1][1] = txtpname6.getText();
                items[i-1][2] = uprice.toString();
                items[i-1][3] = txtpqty6.getText();
                items[i-1][4] = prodtot.toString();
                items[i-1][5] = model1.getValueAt(MyIndex, 3).toString();
            }else{
                System.out.println("Table A");
                if (i == 1) {
                    BillTxt.setText(BillTxt.getText() + "            ******* The City Cafe - Kandy *******\n" + "               We Create Delicious Memories       \n" + "                    www.citycafekandy.com      \n\n" + "ID       PRODUCT           PRICE       QTY       TOTAL\n" + i + "        " + txtpname6.getText() + "          " + uprice + "          " + txtpqty6.getText() + "          " + prodtot + "\n");
                } else {
                    BillTxt.setText(BillTxt.getText() + i + "        " + txtpname6.getText() + "          " + uprice + "          " + txtpqty6.getText() + "          " + prodtot + "\n");

                }
                
                DefaultTableModel model = (DefaultTableModel) tblprod6.getModel();
                MyIndex = tblprod6.getSelectedRow();
                items[i-1][0] = model.getValueAt(MyIndex, 0).toString();//String.valueOf(i);
                items[i-1][1] = txtpname6.getText();
                items[i-1][2] = uprice.toString();
                items[i-1][3] = txtpqty6.getText();
                items[i-1][4] = prodtot.toString();
                items[i-1][5] = model.getValueAt(MyIndex, 4).toString();
            }
                
                
                     
            lblrs.setText("Rs." + grdtot);
            update2();
            update();
            JOptionPane.showMessageDialog(this, "Order Added to the Bill Successfully!");
//            update();

        }
    }//GEN-LAST:event_addbillMouseClicked

    Double uprice, prodtot = 0.00, grdtot = 0.00;
    
    int availqty;
    int pid;
    int newqty;
    String items[][] = new String[50][6];
//    String testRow;
    
    private void tblprod6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprod6MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblprod6.getModel();
        int MyIndex = tblprod6.getSelectedRow();
        //key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtpname6.setText((model.getValueAt(MyIndex, 1)).toString());
        pid = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        availqty = Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        //txtuserpw5.setText(model.getValueAt(MyIndex, 2).toString());
        uprice = Double.valueOf(model.getValueAt(MyIndex, 3).toString());
        isSelectedTable = false;
        
//        testRow = "First Table Row Selected";

    }//GEN-LAST:event_tblprod6MouseClicked

    
    
    private void txtpqty6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpqty6ActionPerformed

    }//GEN-LAST:event_txtpqty6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        txtpqty6.setText("");
        BillTxt.setText("");
        lblrs.setText("");
        grdtot = 0.0;
        i = 0;
        //newqty = (Integer.parseInt(txtpqty6.getText()) + availqty);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnprint6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprint6MouseClicked
        try {
             
              Statement stmt = (Statement) con.createStatement();
              
                //1 = Name
                //2 = price
                //3 = qty
                //4 = proToatal
                //5 = cat
                
                //Name , qty, Total, category, date
             
              LocalDate currentDate = (LocalDate.now()); 
              String query1;
              for(int j=0; j<items.length; j++){
                  if(items[j][0]==null){
                      break;
                  }
                   query1 = "INSERT INTO sales (proName, qty, totalAmount, category, soldDate) " + "VALUES ('"+items[j][1]+"', '"+items[j][3]+"', '"+items[j][4]+"', '"+items[j][5]+"', '"+currentDate+"')";
                   stmt.executeUpdate(query1);
              }
              
              
            
            
            
            BillTxt.print();
        } catch (PrinterException e) {

        } catch (SQLException ex) {
            Logger.getLogger(OrderMgt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprint6MouseClicked


    private void txtpname6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpname6KeyPressed
        String PATTERN = "^[a-zA-Z0]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpname6.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid Product Name!");
            txtpname6.setText("");
        }
    }//GEN-LAST:event_txtpname6KeyPressed

    private void txtpqty6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpqty6KeyPressed
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtpqty6.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity!");
            txtpqty6.setText("");

        }
    }//GEN-LAST:event_txtpqty6KeyPressed

    //Double upriceb;
    int bid;
    private void tblbvgorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbvgorMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblbvgor.getModel();
        int MyIndex = tblbvgor.getSelectedRow();
        //key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtpname6.setText((model.getValueAt(MyIndex, 1)).toString());
        bid = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        //availqty = //Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        //txtuserpw5.setText(model.getValueAt(MyIndex, 2).toString());
        uprice = Double.valueOf(model.getValueAt(MyIndex, 2).toString());
        isSelectedTable = true;
        
//        testRow = "second Table Row Selected";
    }//GEN-LAST:event_tblbvgorMouseClicked

    private void editBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editBillMouseClicked
   
    private void editBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBillActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblbvgor1.getModel();
        model.setNumRows(0);

        for (Object[] row : items) {
            boolean isEmptyRow = true;
            for (Object value : row) {
                if (value != null && !value.toString().isEmpty()) {
                    isEmptyRow = false;
                    break;
                }
            }
            if (!isEmptyRow) {
                model.addRow(row);
            }
        }

        
          jScrollPane4.setVisible(true);
          updateBill.setEnabled(true);
          addbill.setEnabled(false);
          jButton2.setEnabled(false);
          editBill.setEnabled(false);
          
    }//GEN-LAST:event_editBillActionPerformed

    private void tblbvgor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbvgor1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblbvgor1.getModel();
        int MyIndex = tblbvgor1.getSelectedRow();
        
        txtpname6.setText((model.getValueAt(MyIndex, 1)).toString());
        txtpqty6.setText((model.getValueAt(MyIndex, 3)).toString());
        

    }//GEN-LAST:event_tblbvgor1MouseClicked

    private void updateBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBillMouseClicked

    private void updateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBillActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tblbvgor1.getModel();
        int MyIndex = tblbvgor1.getSelectedRow();
        String proCat = model.getValueAt(MyIndex, 5).toString();
         if (txtpname6.getText().isEmpty() || txtpqty6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
            
        }else if (availqty < Integer.valueOf(txtpqty6.getText()) && (proCat != "beverage")) {
            JOptionPane.showMessageDialog(this, "Not Available At The Moment!");
//            txtpname6.setText("");
//            txtpqty6.setText("");
            
        } else {
            
            int oldQty = Integer.valueOf((model.getValueAt(MyIndex, 3)).toString());
            uprice = Double.valueOf((model.getValueAt(MyIndex, 2)).toString());
            int proID = Integer.valueOf((model.getValueAt(MyIndex, 0)).toString());
            String name = txtpname6.getText();
            int newQty = Integer.valueOf(txtpqty6.getText());
            grdtot = grdtot - (oldQty * uprice);
            prodtot = uprice * newQty;
            grdtot = grdtot + prodtot;
            items[MyIndex][3]= String.valueOf(newQty);
            items[MyIndex][4]= String.valueOf(prodtot);
            
              BillTxt.setText("""
                                          ******* The City Cafe - Kandy *******
                                             We Create Delicious Memories       
                                                  www.citycafekandy.com      
                              
                              ID       PRODUCT           PRICE       QTY       TOTAL
                              """);

                for(int b = 0; b<items.length; b++){
                    if(items[b][0] == null){
                        break;
                    }
                    BillTxt.setText(BillTxt.getText() + (b+1) + "        " + items[b][1] + "          " + items[b][2] + "          " + items[b][3] + "          " + items[b][4] + "\n");
                    //BillTxt.setText("        Thank You For Shopping With Us!") ;
                }
            
            if(proCat != "beverage"){
            
                int blncQty = 0;
                if(oldQty > newQty){
                    blncQty = oldQty - newQty;
                }else if(oldQty < newQty){

                }else{

                }

                try {

                    Statement add = con.createStatement();
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");

                    Statement st = con.createStatement();
                    ResultSet rs = (ResultSet) st.executeQuery("select * from product where prodid  = '" + proID + "'");
                        if (rs.next()) {
                            int tbleQty = rs.getInt("prodqty");
                            blncQty = (tbleQty + oldQty) - newQty;
                        }

                    String qry = ("UPDATE product SET prodqty=" + blncQty + " WHERE prodid  =" + proID);

                    add.executeUpdate(qry);

                    pid = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
                    ShowProduct();

                } catch (Exception e) {
        //            JOptionPane.showMessageDialog(this, "Yes");
                }
            }

                       
            lblrs.setText("Rs." + grdtot);

            JOptionPane.showMessageDialog(this, "Order Updated to the Bill Successfully!");

        }
       
        jScrollPane4.setVisible(false);
        updateBill.setEnabled(false);
        addbill.setEnabled(true);
        jButton2.setEnabled(true);
        editBill.setEnabled(true);
    }//GEN-LAST:event_updateBillActionPerformed

    private void tblbvgorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblbvgorFocusGained
//        isSelectedTable = true;
//        System.out.println("Selected");
    }//GEN-LAST:event_tblbvgorFocusGained

    private void tblbvgorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblbvgorFocusLost
//         isSelectedTable = false;
//         System.out.println("Not Selected");
    }//GEN-LAST:event_tblbvgorFocusLost

    private void tblprod6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblprod6FocusGained
//        isSelectedTable = false;
//        System.out.println("Not Selected");
    }//GEN-LAST:event_tblprod6FocusGained

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
            java.util.logging.Logger.getLogger(OrderMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderMgt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JButton addbill;
    private javax.swing.JButton btncancelord;
    private javax.swing.JButton btnhome5;
    private javax.swing.JButton btnprint6;
    private javax.swing.JButton editBill;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelpnm6;
    private javax.swing.JLabel jLabelpqty6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblhed5;
    private javax.swing.JLabel lblprdcthed4;
    private javax.swing.JLabel lblprdcthed6;
    private javax.swing.JLabel lblprdcthed7;
    private javax.swing.JLabel lblrs;
    private javax.swing.JTable tblbvgor;
    private javax.swing.JTable tblbvgor1;
    private javax.swing.JTable tblprod6;
    private javax.swing.JTextField txtpname6;
    private javax.swing.JTextField txtpqty6;
    private javax.swing.JButton updateBill;
    // End of variables declaration//GEN-END:variables
}
