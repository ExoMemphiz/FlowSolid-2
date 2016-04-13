/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.GUI;
import controller.ControlPairs;
import java.io.IOException;
import model.Game;
import view.MenuGUI;

/**
 *
 * @author Chris
 */
public class FlowSolid {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ControlQuiz quiz = new ControlQuiz();
        MenuGUI gui = new MenuGUI(quiz);
        //ControlQuiz faggot = new ControlQuiz();
        //Game gamerino = new Game("faggot", "faggot", "faggot", "faggot");
        //faggot.addGame(gamerino.toString());
    }
    
}