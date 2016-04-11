/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Player;
import controller.ControlQuiz;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ViktorKim
 */
public class MenuGUI extends javax.swing.JFrame {

    private ControlQuiz quiz;
    
    /**
     * Creates new form MenuFrame
     */
    public MenuGUI(ControlQuiz quiz) {
        this.quiz = quiz;
        initComponents();
        setModel();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void setModel() {
        String[] strings = quiz.getGameNames();
        ComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(strings);
        jComboBoxGameType.setModel(model);
    }
    
    public void CallGameGUI() {
        new GameGUI(quiz);
        dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMainMenu = new javax.swing.JPanel();
        jComboBoxGameType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldPlayerCount = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jSliderDifficulty = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jButtonSelectGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxGameType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Translation", "Music", "Programming", "Gaming" }));

        jLabel1.setText("Game Type:");

        jFormattedTextFieldPlayerCount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setText("Player Count:");

        jSliderDifficulty.setMajorTickSpacing(1);
        jSliderDifficulty.setMaximum(5);
        jSliderDifficulty.setMinimum(1);
        jSliderDifficulty.setMinorTickSpacing(1);
        jSliderDifficulty.setPaintLabels(true);
        jSliderDifficulty.setPaintTicks(true);
        jSliderDifficulty.setSnapToTicks(true);
        jSliderDifficulty.setValue(3);

        jLabel3.setText("Difficulty Slider (5 hardest):");

        jButtonSelectGame.setText("Select Game");
        jButtonSelectGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainMenuLayout = new javax.swing.GroupLayout(jPanelMainMenu);
        jPanelMainMenu.setLayout(jPanelMainMenuLayout);
        jPanelMainMenuLayout.setHorizontalGroup(
            jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(88, 88, 88))
            .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxGameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldPlayerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderDifficulty, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jButtonSelectGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanelMainMenuLayout.setVerticalGroup(
            jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPlayerCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelectGame)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelectGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectGameActionPerformed
        //Combo box stuff
        int difficulty = jSliderDifficulty.getValue();
        String comboChoice = "" + jComboBoxGameType.getSelectedItem();
        
        //Player creation
        ArrayList<Player> players = new ArrayList<>();
        int amountPlayers = 0;
        try {
            amountPlayers = Integer.parseInt(jFormattedTextFieldPlayerCount.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number of players!");
        }
        for (int i = 0; i < amountPlayers; i++){ // No such thing as player 0 
            String name = JOptionPane.showInputDialog("Name of player " + i + "?");
            Player tempPlayer = new Player(name);               
            players.add(tempPlayer);
            //Funktion med pass af arraylist af players + difficulty + spil valg
        }
    }//GEN-LAST:event_jButtonSelectGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelectGame;
    private javax.swing.JComboBox<String> jComboBoxGameType;
    private javax.swing.JFormattedTextField jFormattedTextFieldPlayerCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelMainMenu;
    private javax.swing.JSlider jSliderDifficulty;
    // End of variables declaration//GEN-END:variables
}
