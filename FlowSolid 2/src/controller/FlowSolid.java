package controller;

import java.io.IOException;
import view.MenuGUI;

public class FlowSolid {

    public static void main(String[] args) throws IOException {
        ControlQuiz quiz = new ControlQuiz();
        MenuGUI gui = new MenuGUI(quiz);
    }
    
}