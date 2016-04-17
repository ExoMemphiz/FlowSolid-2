package controller;

import controller.interfaces.WordPairControlInterface;
import model.FileHandler;
import model.WordPair;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Constants;

/**
 * This class holds an older version of the WordPairControlInterface, and we use it to extend our new Control class, ControlQuiz.
 */
@Deprecated
public class ControlPairs implements WordPairControlInterface {

    private ArrayList<WordPair> pairs = new ArrayList<>();
    private ArrayList<WordPair> newlyAdded = new ArrayList<>();
    private Random r;
    private int successRate, totalGuesses;
    
    public ControlPairs(boolean loadFromFile) {
        if (loadFromFile){
            load(Constants.PATH_GAME_LINES);
        }
        r = new Random();
    }
    public ControlPairs() {
        r = new Random();
        load(Constants.PATH_GAME_LINES);
    }
    
    @Override
    public void add(String question, String answer) {
        String data = question + "," + answer;
        String testLookup = lookup(question);
        if (testLookup != null) {
            JOptionPane.showMessageDialog(null, "Already added " + question + ". The added answer is " + testLookup);
            return;
        }
        WordPair pair = new WordPair(data);
        pairs.add(pair);
        newlyAdded.add(pair);
    }

    @Override
    public int size() {
        return pairs.size();
    }
    
    @Override
    public String getRandomQuestion() {
        int random = r.nextInt(pairs.size());
        WordPair pair = pairs.get(random);
        return pair.getQuestion();
    }

    @Override
    public boolean checkGuess(String question, String guess) {
        totalGuesses++;
        for (WordPair pair : pairs) {
            if (pair.getQuestion().equals(question)) {
                if (pair.getAnswer().equals(guess)) {
                    successRate++;
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String lookup(String question) {
        for (WordPair pair : pairs) {
            if (pair.isPartOf(question)) {
                return pair.getEquivalent(question);
            }
        }
        return null;
    }

    @Override
    public boolean load(String filename) {
        ArrayList<String> readFile = null;
        try {
            readFile = FileHandler.readFile(Constants.PATH_GAME_LINES);
            for (String s : readFile) {
                if (s != null && !s.isEmpty() && s.contains(",")) {
                    pairs.add(new WordPair(s));
                }
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ControlPairs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean save(String filename) {
        try {
            FileHandler.saveFile(filename, newlyAdded);
            newlyAdded.clear();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void clear() {
        pairs.clear();
    }
    
}