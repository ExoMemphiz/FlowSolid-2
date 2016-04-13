
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        String path = "Games/" + this.gameName + ".txt";
        try {
            ArrayList<String> tempStrAr = FileHandler.readFile(path);
            for (String s : tempStrAr) {
                pairs.add(new WordPair(s));
            }
        } catch (Exception ex) {}
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
    
    public boolean hasQuestion(String question) {
        for (WordPair pair : pairs) {
            if (pair.getQuestion().equalsIgnoreCase(question)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        return gameName + "," + title+ "," + guiQuestion + "," + guiAnswer;
    }
    
}