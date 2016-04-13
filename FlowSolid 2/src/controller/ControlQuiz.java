package controller;

import controller.ControlPairs;
import controller.interfaces.QuizControlInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Constants;
import model.FileHandler;
import model.Game;
import model.WordPair;

public class ControlQuiz extends ControlPairs implements QuizControlInterface{ 
    
    private ArrayList<Game> games = null;
    private Game selectedGame;
    
    
    public ControlQuiz(){
        if (games == null) {
            try {
                games = new ArrayList<Game>();
                ArrayList<String> fileIn = model.FileHandler.readFile(Constants.PATH_GAME_NAMES);
                for (String s : fileIn) {
                    if (s != null && !s.isEmpty() && !s.equals("")){
                    games.add(new Game(s));
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ControlQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
    * This method returns a list of selectable games.
    * Pre: 
    * Post: 
    * Returns a list of names of selectable games 
    */
    public String[] getGameNames() {
        
        int arraySize = games.size();
        String[] gameNames = new String[arraySize];
        for (int i = 0; i < games.size(); i++) {
            Game g = games.get(i);
            gameNames[i] = g.getGameName();
        }
        return gameNames;
    }
    
    
    /**
    * This method is used to select a game and mark it as the selected one. 
    * It should be called when the user has made a choice
    * about what game he wants.
    * Pre: The name passed corresponds to a selectable game
    * Post: The existing collection of word pairs is cleared.
    */
    public void selectGame(String gameName) {
        for (Game game : games) {
            if (game.getGameName().equals(gameName)) {
                selectedGame = game;
                return;
            }
        }
    }


    /**
    * This method returns the name of the currently selected game.
    * Pre: 
    * Post: Returns the name of the game presently selected. If no game is selected it returns null.
    */
    public String getSelectedGameName() {
        return selectedGame.getGameName();
    }

    public Game getSelectedGame(){
        return selectedGame;
    }

      /**
       * This method must add a new game to the existing collection of games.
       * Pre: 
       * Post: A new game is added to the existing collection of games
       */
    public void addGame(String fullLine) {
        Game newGame = new Game(fullLine);
        games.add(newGame);
        FileHandler.appendToFile(Constants.PATH_GAME_NAMES, newGame.toString());
        String newPath = "Games/" + newGame.getGameName() + ".txt";
        FileHandler.saveFile(newPath, newGame.getPairs());
    }
    
    public void addQuestion(String fullLine)
    {
        WordPair newPair = new WordPair(fullLine);
        selectedGame.addWordPair(newPair);
        String newPath = "Games/" + selectedGame.getGameName() + ".txt";
        FileHandler.appendToFile(newPath, newPair.toString());
    }

    

}