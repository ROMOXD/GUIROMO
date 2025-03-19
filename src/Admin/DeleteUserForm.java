/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import RCoordinator.RCPage;
import Staff.FDSPage;
import config.Session;
import config.dbConnector;
import hbsguiromo.LoginPage;
import static hbsguiromo.RegistrationForm.email;
import static hbsguiromo.RegistrationForm.username;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Kevin Romo
 */
public class DeleteUserForm extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUserForm
     */
    public DeleteUserForm() {
        initComponents();
        this.setResizable(false);
    }
    
    public boolean duplicateCheck(){
    
    dbConnector dbc = new dbConnector();
    
    try{
    String query = "SELECT * FROM tbl_user WHERE u_usern = '" +un.getText()+ "' OR u_email = '" +em.getText()+"'";
    ResultSet resultSet = dbc.getData(query);
    
    
    if(resultSet.next()){
    email=resultSet.getString("u_email");
    
    if(email.equals(em.getText())){
    JOptionPane.showMessageDialog(null, "Email Already Existed!");
    em.setText("");
    }
    
    username=resultSet.getString("u_usern");
    
    if(username.equals(un.getText())){
    JOptionPane.showMessageDialog(null, "Username Already Existed!");
    un.setText("");
    }
    return true;
    }else{
    return false;
    }
    
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
    
    
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
        jLabel1 = new javax.swing.JLabel();
        ag = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bk = new javax.swing.JButton();
        rg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        at = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ps = new javax.swing.JPasswordField();
        fn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        st = new javax.swing.JComboBox<>();
        user_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Type:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 465, 100, 30));

        ag.setEnabled(false);
        ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActionPerformed(evt);
            }
        });
        ag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agKeyTyped(evt);
            }
        });
        jPanel1.add(ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 365, 130, 30));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lastname:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 155, -1, 30));

        bk.setBackground(new java.awt.Color(255, 255, 255));
        bk.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        bk.setText("Back");
        bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkActionPerformed(evt);
            }
        });
        jPanel1.add(bk, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 405, 150, 40));

        rg.setBackground(new java.awt.Color(255, 255, 255));
        rg.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        rg.setText("Delete");
        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });
        rg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rgKeyTyped(evt);
            }
        });
        jPanel1.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 405, 150, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DELETE USER FORM");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 0, 234, 60));

        em.setForeground(new java.awt.Color(255, 255, 255));
        em.setEnabled(false);
        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emKeyTyped(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 195, 320, 30));

        un.setForeground(new java.awt.Color(255, 255, 255));
        un.setEnabled(false);
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 275, 320, 30));

        ln.setForeground(new java.awt.Color(255, 255, 255));
        ln.setEnabled(false);
        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnKeyTyped(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 155, 320, 30));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 235, -1, 30));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Firstname:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 115, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 275, -1, 30));

        gd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gd.setEnabled(false);
        gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdActionPerformed(evt);
            }
        });
        jPanel1.add(gd, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 365, 130, 30));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 365, -1, 30));

        cn.setForeground(new java.awt.Color(255, 255, 255));
        cn.setEnabled(false);
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnKeyTyped(evt);
            }
        });
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 235, 320, 30));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 195, -1, 30));

        at.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front Desk Staff", "Room Coordinator", "Hotel Manager ^Admin^" }));
        at.setEnabled(false);
        jPanel1.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 467, 121, 30));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 315, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 365, -1, 30));

        ps.setForeground(new java.awt.Color(255, 255, 255));
        ps.setEnabled(false);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 315, 320, 30));

        fn.setForeground(new java.awt.Color(255, 255, 255));
        fn.setEnabled(false);
        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnKeyTyped(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 115, 320, 30));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 470, -1, -1));

        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        st.setEnabled(false);
        jPanel1.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 463, 112, 33));

        user_id.setEnabled(false);
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 72, 320, 30));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 72, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();

    if(sess.getUid() == 0){
        JOptionPane.showMessageDialog(null, "No Shortcut Allowed you Muffin!, Login First! ;)");
        LoginPage mpg = new LoginPage();
        mpg.setVisible(true);
    this.dispose();
    }
    
    }//GEN-LAST:event_formWindowActivated

    private void agActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agActionPerformed

    private void agKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();

        }
    }//GEN-LAST:event_agKeyTyped

    private void bkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkActionPerformed
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed

        dbConnector dbc = new dbConnector();

        if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
            cn.getText().isEmpty() || un.getText().isEmpty() || ps.getPassword().length == 0 ||
            ag.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        String password = new String(ps.getPassword());

        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
            ps.setText("");
            return;
        }

        String email = em.getText();
        if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Email must end with @gmail.com");
            return;
        }

        if (duplicateCheck()) {
            System.out.println("Duplicate Exist");
            return;
        }

        if (dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_cnum, u_usern, u_pass, u_gen, u_age, u_type, u_status) "
            + "VALUES ('" + fn.getText() + "', '" + ln.getText() + "', '" + email + "', '" + cn.getText() + "', '"
            + un.getText() + "', '" + password + "', '" + gd.getSelectedItem() + "', '" + ag.getText() + "', '"
            + at.getSelectedItem() + "', 'Inactive')")) {

        JOptionPane.showMessageDialog(null, "Added Successfully!");
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Adding User Failed. Please try again.");
        }
    }//GEN-LAST:event_rgActionPerformed

    private void rgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyTyped
        String accountType = (String) at.getSelectedItem(); // Get selected account type

        if (accountType == null || accountType.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an account type first.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }

        switch (accountType) {
            case "Front Desk Staff":
            FDSPage fds = new FDSPage();
            fds.setVisible(true);
            this.dispose();
            break;
            case "Room Coordinator":
            RCPage rcp = new RCPage();
            rcp.setVisible(true);
            this.dispose();
            break;
            case "Hotel Manger(Admin)":
            HMPage hmp = new HMPage();
            hmp.setVisible(true);
            this.dispose();
            break;
            default:
            JOptionPane.showMessageDialog(this, "Invalid account type.", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }
    }//GEN-LAST:event_rgKeyTyped

    private void emKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emKeyTyped

    private void lnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_lnKeyTyped

    private void gdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void cnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();

        }
    }//GEN-LAST:event_cnKeyTyped

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void fnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_fnKeyTyped

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
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ag;
    public javax.swing.JComboBox<String> at;
    private javax.swing.JButton bk;
    public javax.swing.JTextField cn;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JComboBox<String> gd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField ps;
    private javax.swing.JButton rg;
    public javax.swing.JComboBox<String> st;
    public javax.swing.JTextField un;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}
