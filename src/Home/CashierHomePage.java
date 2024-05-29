/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import Order.OrderMgt;
import Order.OrderMgtCashier;
import Sales.SalesMgt7;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NM 2021
 */
public class CashierHomePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage3
     */
    public CashierHomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblhed3 = new javax.swing.JLabel();
        lblhedhom3 = new javax.swing.JLabel();
        btncancel3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnlogout3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnsupplier3 = new javax.swing.JButton();
        btnorder3 = new javax.swing.JButton();
        btnproduct4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        lblhed3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhed3.setForeground(new java.awt.Color(255, 255, 255));
        lblhed3.setText("The City Cafe - Kandy");

        lblhedhom3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblhedhom3.setForeground(new java.awt.Color(255, 255, 255));
        lblhedhom3.setText("Home Page");

        btncancel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncancel3.setText("X");
        btncancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(lblhedhom3)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(lblhed3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancel3)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhed3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhedhom3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 80));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        btnlogout3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout3.setText("Log Out");
        btnlogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(btnlogout3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlogout3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 730, 50));

        jPanel4.setBackground(new java.awt.Color(51, 0, 0, 160));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsupplier3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsupplier3.setForeground(new java.awt.Color(51, 0, 0));
        btnsupplier3.setText("Suppliers");
        btnsupplier3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupplier3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnsupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 55));

        btnorder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnorder3.setForeground(new java.awt.Color(51, 0, 0));
        btnorder3.setText("Order");
        btnorder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorder3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, 55));

        btnproduct4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnproduct4.setForeground(new java.awt.Color(51, 0, 0));
        btnproduct4.setText("Product");
        btnproduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproduct4ActionPerformed(evt);
            }
        });
        jPanel4.add(btnproduct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, 55));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 630, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafemgtsystem/coffee-starbucks-cup-drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 730, 470));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 680, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsupplier3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupplier3ActionPerformed
        //Suply.supplier sup = new Suply.supplier();
        //this.setVisible(false);
        //sup.setVisible(true);
        Suply.SupplyMgtCashier sup = new Suply.SupplyMgtCashier();
        this.setVisible(false);
        sup.setVisible(true);
    }//GEN-LAST:event_btnsupplier3ActionPerformed

    private void btnorder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorder3ActionPerformed
//        Order.OrderMgt6 ord = new Order.OrderMgt6();
        dispose();
        new OrderMgtCashier().setVisible(true);
//        this.setVisible(false);
//        ord.setVisible(true);
    }//GEN-LAST:event_btnorder3ActionPerformed

    private void btncancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel3ActionPerformed
        Home.CashierHomePage cls = new Home.CashierHomePage();
        this.setVisible(false);
        cls.setVisible(false);
    }//GEN-LAST:event_btncancel3ActionPerformed
//private JFrame frame;
    private void btnlogout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout3ActionPerformed
        // TODO add your handling code here:
        login.login1 lo = new login.login1();
        this.setVisible(false);
        lo.setVisible(true);
        /* frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","MYSQL Connector",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    {
        System.exit(0);
        }
         */
    }//GEN-LAST:event_btnlogout3ActionPerformed

    private void btnproduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproduct4ActionPerformed
        Product.ProductMgtCashier Pro = new Product.ProductMgtCashier();
        this.setVisible(false);
        Pro.setVisible(true);
    }//GEN-LAST:event_btnproduct4ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel3;
    private javax.swing.JButton btnlogout3;
    private javax.swing.JButton btnorder3;
    private javax.swing.JButton btnproduct4;
    private javax.swing.JButton btnsupplier3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblhed3;
    private javax.swing.JLabel lblhedhom3;
    // End of variables declaration//GEN-END:variables
}
