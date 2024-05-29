/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Category;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class CategoryMgt4 extends javax.swing.JFrame {

    public CategoryMgt4() {
        initComponents();
        CountCat();
        ShowCat();
    }

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;

    int cnum;

    private void CountCat() {
        try {
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select Max (catid) from category");
            rs1.next();
            cnum = rs1.getInt(1) + 1;
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblhed4 = new javax.swing.JLabel();
        lblprdcthed4 = new javax.swing.JLabel();
        btncancel4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnhome4 = new javax.swing.JButton();
        pnlcat4 = new javax.swing.JPanel();
        lblcatname4 = new javax.swing.JLabel();
        txtcatname4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnadd4 = new javax.swing.JButton();
        btnedit4 = new javax.swing.JButton();
        btnclr4 = new javax.swing.JButton();
        btndlt4 = new javax.swing.JButton();
        lblfltr2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategory4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed4.setForeground(new java.awt.Color(255, 255, 255));
        lblhed4.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 30));

        lblprdcthed4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed4.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed4.setText("Category Management");
        jPanel1.add(lblprdcthed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        btncancel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel4.setText("X");
        btncancel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel4ActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnhome4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhome4.setText("Home");
        btnhome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(btnhome4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, 50));

        pnlcat4.setBackground(new java.awt.Color(51, 0, 0, 160));
        pnlcat4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcatname4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcatname4.setForeground(new java.awt.Color(255, 255, 255));
        lblcatname4.setText("Category Name");
        pnlcat4.add(lblcatname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtcatname4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcatname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatname4ActionPerformed(evt);
            }
        });
        txtcatname4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcatname4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcatname4KeyTyped(evt);
            }
        });
        pnlcat4.add(txtcatname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Items List");
        pnlcat4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 206, -1, -1));

        btnadd4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd4.setText("Add");
        btnadd4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadd4MouseClicked(evt);
            }
        });
        btnadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd4ActionPerformed(evt);
            }
        });
        pnlcat4.add(btnadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 122, 90, -1));

        btnedit4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit4.setText("Edit");
        btnedit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnedit4MouseClicked(evt);
            }
        });
        btnedit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit4ActionPerformed(evt);
            }
        });
        pnlcat4.add(btnedit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 122, 90, -1));

        btnclr4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclr4.setText("Clear");
        btnclr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclr4ActionPerformed(evt);
            }
        });
        pnlcat4.add(btnclr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 122, 80, -1));

        btndlt4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndlt4.setText("Delete");
        btndlt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlt4ActionPerformed(evt);
            }
        });
        pnlcat4.add(btndlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 122, 90, -1));

        lblfltr2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblfltr2.setForeground(new java.awt.Color(255, 255, 255));
        lblfltr2.setText("Filter");
        pnlcat4.add(lblfltr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 249, -1, 28));

        tblcategory4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblcategory4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category_Id", "Cat_Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblcategory4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategory4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcategory4);

        pnlcat4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 469, 190));

        getContentPane().add(pnlcat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 720, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Category/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcatname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcatname4ActionPerformed

    private void btnhome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome4ActionPerformed
        Home.homePage3 ho = new Home.homePage3();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome4ActionPerformed

    private void btncancel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel4ActionPerformed
        Category.CategoryMgt4 cls = new Category.CategoryMgt4();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancel4ActionPerformed

    private void btnadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadd4MouseClicked
        if (txtcatname4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                CountCat();

                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
                
                Statement st = con.createStatement();
                ResultSet rs = (ResultSet) st.executeQuery("select * from category where catname = '" + txtcatname4.getText() + "'");
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Category Already Exist!");
                }else{
                
                    PreparedStatement add = con.prepareStatement("INSERT INTO category VALUES(?,?)");
                    //add.setString(1, code.getText().toString());
                    //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                    add.setInt(1, cnum);
                    add.setString(2, txtcatname4.getText());
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Category Added successfully !");
                    txtcatname4.setText("");

                    con.close();
                    ShowCat();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnadd4MouseClicked

    private void btnclr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclr4ActionPerformed

        txtcatname4.setText("");

    }//GEN-LAST:event_btnclr4ActionPerformed
    int key = 0;
    private void tblcategory4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategory4MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblcategory4.getModel();
        int MyIndex = tblcategory4.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        txtcatname4.setText(model.getValueAt(MyIndex, 1).toString());

    }//GEN-LAST:event_tblcategory4MouseClicked

    private void btnedit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnedit4MouseClicked
         if (txtcatname4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountCat();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("UPDATE category SET catname=? WHERE catid=?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(2, key);
                add.setString(1, txtcatname4.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Edited successfully !");
                txtcatname4.setText("");

                con.close();
                ShowCat();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnedit4MouseClicked

    private void btndlt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlt4ActionPerformed
        if (txtcatname4.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                CountCat();

                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/cafems","root","");
                PreparedStatement add = con.prepareStatement("DELETE FROM category WHERE catid = ?");
                //add.setString(1, code.getText().toString());
                //pst.setInt(1, Integer.valueOf(txtuserid6.getText()));
                add.setInt(1, key);
                //add.setString(2, txtName.getText());
                //add.setString(3, txtuserpw5.getText());
                //add.setString(4, txtusercontact5.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Deleted successfully !");
                txtcatname4.setText("");

                con.close();
                ShowCat();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btndlt4ActionPerformed

    private void txtcatname4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcatname4KeyPressed
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtcatname4.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Category Name!");
            txtcatname4.setText("");
        }
    }//GEN-LAST:event_txtcatname4KeyPressed

    private void btnedit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnedit4ActionPerformed

    private void btnadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd4ActionPerformed

    private void txtcatname4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcatname4KeyTyped
        
    }//GEN-LAST:event_txtcatname4KeyTyped

    private void ShowCat() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from category");
            tblcategory4.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryMgt4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd4;
    private javax.swing.JButton btncancel4;
    private javax.swing.JButton btnclr4;
    private javax.swing.JButton btndlt4;
    private javax.swing.JButton btnedit4;
    private javax.swing.JButton btnhome4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcatname4;
    private javax.swing.JLabel lblfltr2;
    private javax.swing.JLabel lblhed4;
    private javax.swing.JLabel lblprdcthed4;
    private javax.swing.JPanel pnlcat4;
    private javax.swing.JTable tblcategory4;
    private javax.swing.JTextField txtcatname4;
    // End of variables declaration//GEN-END:variables
}
