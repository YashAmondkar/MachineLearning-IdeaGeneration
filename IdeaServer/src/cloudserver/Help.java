/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudserver;

public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 184, 225));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(204, 153, 255));
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jTextPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(51, 0, 102));
        jTextPane1.setText("\tSystem is based on IDEA GENERATION ALGORITHM\n\n\tAn idea is a collection of thoughts, plan and images that flash through the brain. The factors such as stress, need, etc. influence the idea generation. If we consider the brain to be a machine present in our body, then thinking in the reverse way we can imply that a machine can also generate ideas.\n\tMachines are meant to serve the users. Developing such an algorithm, which helps machine in generating its own sets of ideas, would give the machine’s “mind map”. Idea generation by machines will help it to serve any application defined by the users. Let the ideas be the selected set stored in a “Database” and the storage top the database in a selection from a “Trained Network”. Later, these ideas may be retrieved from the database as per the query for an application like thematic color for background, filling up blank space, Cryptography, etc. In final stages, the algorithm may use a trained network such as the “Neural network” which can be implemented to generate the final idea.\n\tMachines have the ability to generate output set for given input set. Machines have now evolved with time from listeners and implementers to learners and selectors. Artificial intelligence is advancing as an integral field in computer science. It revolutionizes on the machine’s ability to serve its master. Machines which once performed the primitive tasks of movement in unique direction, to the age of computers, where they provided source to automated labor work with satellites monitoring earth and robots landing on moon and collecting samples. Now comes the age where logic of permutation and combination can be applied for the machine to come out on a complete set of output, along with ability to perform the task of selection via trained   networks, which learn and select on the laterally correct input to give a final selected output.\n\tThe Melody Music Generator (MMG) aims to generate various music compositions using Idea Generation Algorithm based system. The system shall generate various musical compositions for given input set fed in mutually to the system. The output of the system shall be directly available to the user for use and shall be stored into a database for future use and reference. The system shall be used as a backend application and provides wide opportunities for its users and developers to explore new horizons. The use of neural networks enhances the system feasibility. The system involves parallel processing units which make it more suitable to the present and advanced technologies.\n\n\nTeam Structure:\n\n   TEAM MEMBER\t      PHONE\t                        E-MAIL\n\nMrs. U. JOGALEKAR\t+91 9422620388\taj_usha7@yahoo.co.in \n\nAKSHAY DHONDKAR\t+91 9890 977821\takkyrocks11@gmail.com\n\nSAHIL BHANGE\t+91 9096 834875\tsahilbhange@gmail.com\n\nYASH AMONDKAR\t+91 9096 804540\tyash1861991@gmail.com\n\nSANKET CHAKANE\t+91 9561 808308\tSanket.chakane@gmail.com\n\n\n\n");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 70, 470, 350);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudserver/z_Buttons_back.jpg"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 500, 139, 61);

        jTextPane2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTextPane2.setText("Computer Department,\nSmt. Kashibai Navale College Of Engineering,\nUniversity of Pune.");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 440, 304, 59);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel1.setText("MELODY MUSIC COMPOSITION SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 416, 33);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 56, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudserver/vintage-music-frame-powerpoint-template.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 792, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminArea admin = new AdminArea();
        admin.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
