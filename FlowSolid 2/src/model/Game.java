
package model;

import java.util.ArrayList;
import java.util.Random;


public class Game {
 
    private String gameName, title, guiQuestion, guiAnswer;
    private ArrayList<WordPair> pairs;
    Random rng;
    
    public Game(String gameName, String title, String question, String answer) {
        this.gameName = gameName;
        this.title = title;
        this.guiQuestion = question;
        this.guiAnswer = answer;
        rng = new Random();
        pairs = new ArrayList<WordPair>();
    }

    public Game(String line) {
        String[] split = line.split(",");
        this.gameName = split[0];
        this.title = split[1];
        this.guiQuestion = split[2];
        this.guiAnswer = split[3];
        rng = new Random();
        pairs = new ArrayList<WordPair>();
    }
    
    public void addWordPair(WordPair tempPair){
        pairs.add(tempPair);
    }
    
    public String getGameName() {
        return gameName;
    }

    public String getTitle() {
        return title;
    }

    public String getGuiQuestion() {
        return guiQuestion;
    }

    public String getGuiAnswer() {
        return guiAnswer;
    }
    
    public WordPair getRandomWordPair(){
        int generated = rng.nextInt(pairs.size());
        
        return pairs.get(generated);
    }
    
    public ArrayList<WordPair> getPairs(){
        return pairs;
    }
    
    public String toString(){
        return gameName + "," + title+ "," + guiQuestion + "," + guiAnswer;
    }
    
}