/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import user_classes.Connection_provider;
import user_classes.DbOperation;
public class ForgetPassward extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPassward
     */
    public ForgetPassward() {
        initComponents();
        securityTxt.setEditable(false);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        securityTxt = new javax.swing.JTextField();
        answerTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        searchCustomerBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        passwardTxt = new javax.swing.JPasswordField();
        confirmTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("confirm password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("userName");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 125, 120, 30));

        userNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 289, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Answer");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Your security question");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 167, 270, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("New password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 247, 180, 30));

        securityTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        securityTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(securityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 310, -1));

        answerTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answerTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(answerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 289, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Forget passward?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 102, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 372, -1, -1));

        signUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 102, 102));
        signUpBtn.setText("Sign up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 372, -1, -1));

        searchCustomerBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchCustomerBtn.setForeground(new java.awt.Color(255, 102, 102));
        searchCustomerBtn.setText("search ");
        searchCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 102, 102));
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 372, -1, -1));

        passwardTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(passwardTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 280, 30));

        confirmTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(confirmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 272, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try{
        Connection con = Connection_provider.getCon();
        ResultSet rs = DbOperation.getData("select* from customer where userName='" + userNameTxt.getText() +"' and securityQuestion = '" + securityTxt.getText() +"' and answer= '"+ answerTxt.getText() + "'");
        
        if(userNameTxt.getText().isEmpty() || securityTxt.getText().isEmpty() || answerTxt.getText().isEmpty() || passwardTxt.getText().isEmpty()|| confirmTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information!!!");
        }else if(!passwardTxt.getText().equals(confirmTxt.getText())){
           JOptionPane.showMessageDialog(this, "passward mismatch");
       }else if(rs.next()){
           PreparedStatement pst = con.prepareStatement("update customer set password = ? where userName = '" + userNameTxt.getText()+ "'");
           pst.setString(1, passwardTxt.getText());
           int row = pst.executeUpdate();
           con.close();
           JOptionPane.showMessageDialog(this, "password updated");
       }
       else{
           JOptionPane.showMessageDialog(this, "Wrong information");
       }
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        new Login().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void searchCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerBtnActionPerformed
        if(userNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter user name!!!");
        }else{
        try{
           ResultSet rs1 =DbOperation.getData("select* from customer where userName= '" + userNameTxt.getText() + "'");
                    if(rs1.next()){
                        String question = rs1.getString("securityQuestion");
                        securityTxt.setText(question);
                    }else{
                        JOptionPane.showMessageDialog(this, "wrong user name!!!");
                    }       
                
           
        }catch(Exception e){
          
        }
        }
    }//GEN-LAST:event_searchCustomerBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        userNameTxt.setText("");
        securityTxt.setText("");
        answerTxt.setText("");
        passwardTxt.setText("");
        confirmTxt.setText("");
        
    }//GEN-LAST:event_ClearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ForgetPassward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField answerTxt;
    private javax.swing.JPasswordField confirmTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwardTxt;
    private javax.swing.JButton searchCustomerBtn;
    private javax.swing.JTextField securityTxt;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
