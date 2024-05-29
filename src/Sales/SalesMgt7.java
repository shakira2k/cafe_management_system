/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class SalesMgt7 extends javax.swing.JFrame {

    public SalesMgt7() {
        initComponents();
        updateTables();
    }

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;

    public void updateTables() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cafems", "root", "");
            st = con.createStatement();
            rs = (ResultSet) st.executeQuery("select * from sales where category = 'beverage' ORDER BY id");
            

            ordbeverage.setModel(DbUtils.resultSetToTableModel(rs));
            

            st1 = con.createStatement();
            rs1 = (ResultSet) st1.executeQuery("select * from sales where category <> 'beverage' ORDER BY id");
            ordfoods.setModel(DbUtils.resultSetToTableModel(rs1));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelbev7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordbeverage = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordfoods = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblhed7 = new javax.swing.JLabel();
        lblprdcthed4 = new javax.swing.JLabel();
        btncancel7 = new javax.swing.JButton();
        jLabelfood7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnhome7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelbev7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelbev7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelbev7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelbev7.setText("Sold Beverage List");
        getContentPane().add(jLabelbev7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        ordbeverage.setBackground(new java.awt.Color(255, 204, 204));
        ordbeverage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "bevid", "bname", "bamount", "date"
            }
        ));
        ordbeverage.setSelectionBackground(new java.awt.Color(102, 0, 0));
        ordbeverage.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(ordbeverage);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 400));

        ordfoods.setBackground(new java.awt.Color(255, 204, 204));
        ordfoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "foodid", "fname", "famount", "fdate"
            }
        ));
        ordfoods.setSelectionBackground(new java.awt.Color(102, 0, 0));
        ordfoods.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(ordfoods);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 380, 400));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhed7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed7.setForeground(new java.awt.Color(255, 255, 255));
        lblhed7.setText("The City Cafe - Kandy");
        jPanel1.add(lblhed7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 30));

        lblprdcthed4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblprdcthed4.setForeground(new java.awt.Color(255, 255, 255));
        lblprdcthed4.setText("Sales Management");
        jPanel1.add(lblprdcthed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        btncancel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel7.setText("X");
        btncancel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel7ActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabelfood7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelfood7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelfood7.setText("Sold Food List");
        getContentPane().add(jLabelfood7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        btnhome7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhome7.setText("Home");
        btnhome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(btnhome7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhome7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 800, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sales/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome7ActionPerformed
        Home.homePage3 ho = new Home.homePage3();
        this.setVisible(false);
        ho.setVisible(true);
    }//GEN-LAST:event_btnhome7ActionPerformed

    private void btncancel7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel7ActionPerformed
        Sales.SalesMgt7 cls = new Sales.SalesMgt7();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancel7ActionPerformed

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
            java.util.logging.Logger.getLogger(SalesMgt7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesMgt7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesMgt7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesMgt7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesMgt7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel7;
    private javax.swing.JButton btnhome7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelbev7;
    private javax.swing.JLabel jLabelfood7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblhed7;
    private javax.swing.JLabel lblprdcthed4;
    private javax.swing.JTable ordbeverage;
    private javax.swing.JTable ordfoods;
    // End of variables declaration//GEN-END:variables
}
