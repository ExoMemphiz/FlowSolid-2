
package model;

public class Player 
{
    private String name;
    private int points;
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public void addPoints(int p)
    {
        points += p;
    }
    
    
}
