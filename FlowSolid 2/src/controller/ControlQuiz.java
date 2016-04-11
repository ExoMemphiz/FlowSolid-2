package controller;

import controller.ControlPairs;
import controller.interfaces.QuizControlInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Constants;

public class ControlQuiz extends ControlPairs implements QuizControlInterface{
    
    ArrayList<String> gameNames = null;
    
    /**
    * This method returns a list of selectable games.
    * Pre: 
    * Post: 
    * Returns a list of names of selectable games 
    */
    public String[] getGameNames() {
        if (gameNames == null) {
            try {
                gameNames = model.FileHandler.readFile(Constants.PATH_GAME_NAMES);
            } catch (IOException ex) {
                Logger.getLogger(ControlQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return gameNames.stream().toArray(String[]::new);
    }


    /**
    * This method is used to select a game and mark it as the selected one. 
    * It should be called when the user has made a choise
    * about what game he wants.
    * Pre: The name passed corresponds to a selectable game
    * Post: The existing collection of word pairs is cleared.
    */
    public void selectGame(String gameName) {
        
    }


    /**
    * This method returns the name of the currently selected game.
    * Pre: 
    * Post: Returns the name of the game presently selected. If no game is selected it returns null.
    */
    public String getSelectedGameName() {
        String name = "";
        
        return name;
    }


      /**
       * This method must add a new game to the existing collection of games.
       * Pre: 
       * Post: A new game is added to the existing collection of games
       */
    public void addGame(String gameName) {
        
    }

}