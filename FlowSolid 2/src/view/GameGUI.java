/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ViktorKim
 */
public class GameGUI extends javax.swing.JFrame {

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
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

        jPanelLanguageLearning = new javax.swing.JPanel();
        jLabelGameTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDanish = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEnglish = new javax.swing.JTextField();
        jTextFieldResult = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Window");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLanguageLearning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGameTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGameTitle.setText("GAME TITLE HERE");
        jPanelLanguageLearning.add(jLabelGameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 304, 38));

        jLabel5.setText("Question:");
        jPanelLanguageLearning.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        jTextFieldDanish.setEditable(false);
        jPanelLanguageLearning.add(jTextFieldDanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, -1));

        jLabel6.setText("Answer:");
        jPanelLanguageLearning.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, -1));

        jTextFieldEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnglishActionPerformed(evt);
            }
        });
        jPanelLanguageLearning.add(jTextFieldEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 102, 190, -1));

        jTextFieldResult.setEditable(false);
        jPanelLanguageLearning.add(jTextFieldResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, -1));

        jLabel7.setText("Result:");
        jPanelLanguageLearning.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        jButton1.setText("jButton1");
        jPanelLanguageLearning.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jButton2.setText("jButton2");
        jPanelLanguageLearning.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Player Stats")));

        jLabel1.setText("Player bla");

        jTextField1.setText("tro på det");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jPanelLanguageLearning.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 220, 320));

        getContentPane().add(jPanelLanguageLearning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnglishActionPerformed
        
    }//GEN-LAST:event_jTextFieldEnglishActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelGameTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLanguageLearning;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDanish;
    private javax.swing.JTextField jTextFieldEnglish;
    private javax.swing.JTextField jTextFieldResult;
    // End of variables declaration//GEN-END:variables
}