package model;

import javax.swing.JOptionPane;

public class Player {
    
    private String name;
    private int points = 0;
    
    public Player(String name) {
        this.name = name;
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
    
    public int getPoints(){
        return points;
    }
    
    public String getName(){
        return name;
    }
}