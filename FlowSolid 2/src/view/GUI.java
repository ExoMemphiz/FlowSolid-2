/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControlPairs;
import controller.WordPairControlInterface;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Chris
 */
public class GUI extends javax.swing.JFrame {

    WordPairControlInterface control;

    /**
     * Creates new form GUI
     */
    public GUI(WordPairControlInterface control) {
        this.control = control;
        initComponents();
        setVisible(true);
        setLocationMiddle();
    }

    public void setLocationMiddle() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDanish = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEnglish = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonCheckAnswer = new javax.swing.JButton();
        jTextFieldResult = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDictionaryInput = new javax.swing.JTextField();
        jTextFieldDictionaryOutput = new javax.swing.JTextField();
        jButtonDictionaryLookUp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAddDanish = new javax.swing.JTextField();
        jTextFieldAddEnglish = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonAddPair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Language Learner");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 304, 38));

        jLabel5.setText("Danish");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, -1));

        jTextFieldDanish.setEditable(false);
        jPanel1.add(jTextFieldDanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 68, 128, -1));

        jLabel6.setText("English");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 50, -1));

        jTextFieldEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnglishActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 102, 128, -1));

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 67, 79, -1));

        jButtonCheckAnswer.setText("Check");
        jButtonCheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCheckAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 101, 79, -1));

        jTextFieldResult.setEditable(false);
        jPanel1.add(jTextFieldResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 142, 128, -1));

        jLabel7.setText("Result");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 144, 50, -1));

        jTabbedPane1.addTab("Language learning", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Word dictionary");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 191, 30));
        jPanel4.add(jTextFieldDictionaryInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 78, 130, -1));

        jTextFieldDictionaryOutput.setEditable(false);
        jPanel4.add(jTextFieldDictionaryOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 109, 130, -1));

        jButtonDictionaryLookUp.setText("Look Up");
        jButtonDictionaryLookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDictionaryLookUpActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDictionaryLookUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 140, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Auto Detect Language");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 52, 130, -1));

        jTabbedPane1.addTab("Dictionary", jPanel4);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add pair");

        jLabel3.setText("Danish");

        jLabel4.setText("English");

        jButtonAddPair.setText("Add Pair");
        jButtonAddPair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddPair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAddEnglish)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddDanish))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAddDanish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAddEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddPair)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddPairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPairActionPerformed
        control.add(jTextFieldAddDanish.getText(), jTextFieldAddEnglish.getText());
        control.save(ControlPairs.FILE_PATH);
        control.load(ControlPairs.FILE_PATH);
        jTextFieldAddDanish.setText("");
        jTextFieldAddEnglish.setText("");
    }//GEN-LAST:event_jButtonAddPairActionPerformed

    private void jButtonCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckAnswerActionPerformed
        if (jButtonCheckAnswer.isEnabled()) {
            boolean answer = control.checkGuess(jTextFieldDanish.getText(), jTextFieldEnglish.getText());
            if (answer) {
                jTextFieldResult.setText("Correct answer!");
            } else {
                String answerText = control.lookup(jTextFieldDanish.getText());
                jTextFieldResult.setText("Wrong! Answer: " + answerText);
            }
            jButtonCheckAnswer.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonCheckAnswerActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        String question = control.getRandomQuestion();
        jButtonCheckAnswer.setEnabled(true);
        jTextFieldDanish.setText(question);
        jTextFieldResult.setText("");
        jTextFieldEnglish.setText("");
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonDictionaryLookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDictionaryLookUpActionPerformed
        String text = jTextFieldDictionaryInput.getText();
        String translated = control.lookup(text);
        if (translated == null) {
            translated = "Unknown word!";
        }
        jTextFieldDictionaryOutput.setText(translated);
    }//GEN-LAST:event_jButtonDictionaryLookUpActionPerformed

    private void jTextFieldEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnglishActionPerformed
        jButtonCheckAnswerActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldEnglishActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPair;
    private javax.swing.JButton jButtonCheckAnswer;
    private javax.swing.JButton jButtonDictionaryLookUp;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAddDanish;
    private javax.swing.JTextField jTextFieldAddEnglish;
    private javax.swing.JTextField jTextFieldDanish;
    private javax.swing.JTextField jTextFieldDictionaryInput;
    private javax.swing.JTextField jTextFieldDictionaryOutput;
    private javax.swing.JTextField jTextFieldEnglish;
    private javax.swing.JTextField jTextFieldResult;
    // End of variables declaration//GEN-END:variables
}
