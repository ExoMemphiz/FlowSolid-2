package model;

import javax.swing.JOptionPane;

public class Player {
    
    private String name;
    private int points;
    
    public Player(String name) {
        this.name = name;
    }
    
    public void setGuiName(int num){
        this.name = JOptionPane.showInputDialog("Name of player " + num + "?");
    }
    
    public void addPoint() {
        points++;
    }
    
    public void subtractPoint() {
        points--;
    }
    
    public void addPoints(int p) {
        points += p;
    }
    
}