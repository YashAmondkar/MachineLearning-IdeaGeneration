/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginFrame.java
 *
 * Created on May 11, 2013, 11:31:20 PM
 */

package cloudserver;

import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    /** Creates new form LoginFrame */
    public LoginFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Login Name    :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 210, 130, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password   :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 270, 100, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 220, 150, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudserver/z_Buttons_login.jpg"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 32, 32)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 380, 131, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudserver/z_Buttons_cancel.jpg"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 380, 130, 50);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(410, 270, 150, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudserver/x_Login-800.600.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel4.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -40, 840, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextField1.setText(" ");
        jPasswordField1.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName = jTextField1.getText();
        String password = jPasswordField1.getText();
        String [] arg = null ;
        if("admin".equalsIgnoreCase(userName) && "admin123".equalsIgnoreCase(password))
        {
           JOptionPane.showMessageDialog(null,"Successfully Login", "Login",JOptionPane.INFORMATION_MESSAGE);
           AdminArea area = new AdminArea();
           area.show();
           this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Login Error ,Please Login Again", "Login",JOptionPane.INFORMATION_MESSAGE);
            LoginFrame login = new LoginFrame();
            login.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
