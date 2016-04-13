/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.javafx.scene.control.SelectedCellsMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Player;
import controller.ControlQuiz;
import javax.swing.ComboBoxModel;
import javax.swing.UIManager;
import model.Game;
import model.WordPair;


public class MenuGUI extends javax.swing.JFrame {

    private ControlQuiz quiz;
    private ArrayList<Player> players;
    
    public MenuGUI(ControlQuiz quiz) {
        this.quiz = quiz;
        initComponents();
        setModel();
        setVisible(true);
        setLocationRelativeTo(null);
        players = new ArrayList<>();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex){}
    }

    public void setModel() {
        String[] strings = quiz.getGameNames();
        ComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(strings);
        jComboBoxGameType.setModel(model);
        jComboBoxGameTypeAdmin.setModel(model);
    }
    
    public void CallGameGUI(int difficulty) {
        new GameGUI(quiz, players, difficulty);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAdmin = new javax.swing.JDialog();
        jTabbedPaneAdmin = new javax.swing.JTabbedPane();
        jPanelNewQuiz = new javax.swing.JPanel();
        jTextFieldQuizName = new javax.swing.JTextField();
        jLabelQuizName = new javax.swing.JLabel();
        jButtonAddQuiz = new javax.swing.JButton();
        jLabelQuizName1 = new javax.swing.JLabel();
        jTextFieldQuizQuestion = new javax.swing.JTextField();
        jLabelQuizName2 = new javax.swing.JLabel();
        jTextFieldQuizAnswer = new javax.swing.JTextField();
        jPanelNewQuestions = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAddQuestion = new javax.swing.JTextField();
        jTextFieldAddAnswer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonAddPair = new javax.swing.JButton();
        jComboBoxGameTypeAdmin = new javax.swing.JComboBox<>();
        jLabelSelectGame = new javax.swing.JLabel();
        jLabelSuperSecret = new javax.swing.JLabel();
        jPanelMainMenu = new javax.swing.JPanel();
        jComboBoxGameType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldPlayerCount = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jSliderDifficulty = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jButtonSelectGame = new javax.swing.JButton();

        jDialogAdmin.setTitle("Admin Panel");
        jDialogAdmin.setMinimumSize(new java.awt.Dimension(422, 305));
        jDialogAdmin.setResizable(false);

        jLabelQuizName.setText("Quiz Name:");

        jButtonAddQuiz.setText("Add Quiz!");
        jButtonAddQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuizActionPerformed(evt);
            }
        });

        jLabelQuizName1.setText("Question Line:");

        jLabelQuizName2.setText("Answer Line:");

        javax.swing.GroupLayout jPanelNewQuizLayout = new javax.swing.GroupLayout(jPanelNewQuiz);
        jPanelNewQuiz.setLayout(jPanelNewQuizLayout);
        jPanelNewQuizLayout.setHorizontalGroup(
            jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                .addGroup(jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAddQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelNewQuizLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                                .addComponent(jLabelQuizName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuizQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                                .addComponent(jLabelQuizName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuizName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                                .addComponent(jLabelQuizName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuizAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelNewQuizLayout.setVerticalGroup(
            jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewQuizLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuizName)
                    .addComponent(jTextFieldQuizName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuizName1)
                    .addComponent(jTextFieldQuizQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuizName2)
                    .addComponent(jTextFieldQuizAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddQuiz)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Add new Quiz", jPanelNewQuiz);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add pair");

        jLabel5.setText("Question");

        jLabel6.setText("Answer");

        jButtonAddPair.setText("Add Pair");
        jButtonAddPair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNewQuestionsLayout = new javax.swing.GroupLayout(jPanelNewQuestions);
        jPanelNewQuestions.setLayout(jPanelNewQuestionsLayout);
        jPanelNewQuestionsLayout.setHorizontalGroup(
            jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewQuestionsLayout.createSequentialGroup()
                .addGroup(jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewQuestionsLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddPair, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelNewQuestionsLayout.createSequentialGroup()
                                .addGroup(jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jTextFieldAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelNewQuestionsLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanelNewQuestionsLayout.setVerticalGroup(
            jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewQuestionsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAddAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddPair)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Add Questions to Quiz", jPanelNewQuestions);

        jComboBoxGameTypeAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));

        jLabelSelectGame.setText("Select Game Mode:");

        jLabelSuperSecret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSuperSecret.setText("Super Secret Admin Panel |");

        javax.swing.GroupLayout jDialogAdminLayout = new javax.swing.GroupLayout(jDialogAdmin.getContentPane());
        jDialogAdmin.getContentPane().setLayout(jDialogAdminLayout);
        jDialogAdminLayout.setHorizontalGroup(
            jDialogAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdminLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelSuperSecret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelectGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxGameTypeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogAdminLayout.setVerticalGroup(
            jDialogAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdminLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDialogAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelectGame)
                    .addComponent(jLabelSuperSecret)
                    .addComponent(jComboBoxGameTypeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxGameType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));

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
            .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxGameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldPlayerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                        .addComponent(jButtonSelectGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanelMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSliderDifficulty, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
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
        quiz.selectGame(comboChoice);
        //Player creation
        try {
            int amountPlayers = Integer.parseInt(jFormattedTextFieldPlayerCount.getText());
            if ((difficulty == 2) && (amountPlayers == 1337)){
                showAdmin();
            }
          else if (amountPlayers > 0){
                for (int i = 0; i < amountPlayers; i++){ // No such thing as player 0 
                    String name = JOptionPane.showInputDialog("Name of player " + (i + 1) + "?");
                    if (name != null && !name.isEmpty() && !name.equals("")) {
                        Player tempPlayer = new Player(name);               
                        players.add(tempPlayer);
                        //Funktion med pass af arraylist af players + difficulty + spil valg
                    } else {
                        i--; // Hack til at tvinge folk til at indtaste et navn
                    }
                }
                try {
                    CallGameGUI(difficulty);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "No questions for selected game found!");
                    e.printStackTrace();
                }
           }
            else{
                JOptionPane.showMessageDialog(this, "Please enter a number greater than 0!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Please enter a valid number of players!");
        }
    }//GEN-LAST:event_jButtonSelectGameActionPerformed

    private void jButtonAddPairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPairActionPerformed
        String s = (String) jComboBoxGameTypeAdmin.getSelectedItem();
        quiz.selectGame(s);
        Game g = quiz.getSelectedGame();
        String question = jTextFieldAddQuestion.getText();
        String answer = jTextFieldAddAnswer.getText();
        if(g.hasQuestion(question)){
            JOptionPane.showMessageDialog(this, "Question already exists!");
        }
        else{
            WordPair wp = new WordPair(question,answer);
            g.addWordPair(wp);
            g.saveToText(wp);
            JOptionPane.showMessageDialog(this, "Added the question!");
            jTextFieldAddQuestion.setText("");
            jTextFieldAddAnswer.setText("");
        }
    }//GEN-LAST:event_jButtonAddPairActionPerformed

    private void jButtonAddQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuizActionPerformed
        String quizName = jTextFieldQuizName.getText();
        String quizAnswer = jTextFieldQuizAnswer.getText();
        String quizQuestion = jTextFieldQuizQuestion.getText(); 
        
        if (quizAnswer.equals("") || quizQuestion.equals("")){
            quizQuestion = "Question";
            quizAnswer = "Answer";
        }
        
        String totalQuiz = quizName + "," + quizName + "," + quizQuestion + "," + quizAnswer;
        for (String s : quiz.getGameNames()) {
            if(s.equalsIgnoreCase(quizName)){
                JOptionPane.showMessageDialog(this, "Quiz already exists!");
                return;
            }
        }
        quiz.addGame(totalQuiz);
        quiz.selectGame(quizName);
        Game g = quiz.getSelectedGame();
        String firstQuestion = JOptionPane.showInputDialog("Added a new Quiz!\nWhat's the first question?");
        String firstAnswer = JOptionPane.showInputDialog("What's the first answer?");
        WordPair wp = new WordPair(firstQuestion, firstAnswer);
        g.addWordPair(wp);
        g.saveToText(wp);
        setModel();
    }//GEN-LAST:event_jButtonAddQuizActionPerformed
    
    private void showAdmin(){
        jDialogAdmin.setVisible(true);
        jDialogAdmin.setLocationRelativeTo(this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPair;
    private javax.swing.JButton jButtonAddQuiz;
    private javax.swing.JButton jButtonSelectGame;
    private javax.swing.JComboBox<String> jComboBoxGameType;
    private javax.swing.JComboBox<String> jComboBoxGameTypeAdmin;
    private javax.swing.JDialog jDialogAdmin;
    private javax.swing.JFormattedTextField jFormattedTextFieldPlayerCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelQuizName;
    private javax.swing.JLabel jLabelQuizName1;
    private javax.swing.JLabel jLabelQuizName2;
    private javax.swing.JLabel jLabelSelectGame;
    private javax.swing.JLabel jLabelSuperSecret;
    private javax.swing.JPanel jPanelMainMenu;
    private javax.swing.JPanel jPanelNewQuestions;
    private javax.swing.JPanel jPanelNewQuiz;
    private javax.swing.JSlider jSliderDifficulty;
    private javax.swing.JTabbedPane jTabbedPaneAdmin;
    private javax.swing.JTextField jTextFieldAddAnswer;
    private javax.swing.JTextField jTextFieldAddQuestion;
    private javax.swing.JTextField jTextFieldQuizAnswer;
    private javax.swing.JTextField jTextFieldQuizName;
    private javax.swing.JTextField jTextFieldQuizQuestion;
    // End of variables declaration//GEN-END:variables
}
