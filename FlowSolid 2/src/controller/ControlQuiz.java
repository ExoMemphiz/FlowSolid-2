package controller;

import controller.ControlPairs;
import controller.interfaces.QuizControlInterface;

public class ControlQuiz extends ControlPairs implements QuizControlInterface{
    
    /**
    * This method returns a list of selectable games.
    * Pre: 
    * Post: 
    * Returns a list of names of selectable games 
    */
    public String[] getGameNames() {
        String strAr[] = {""}; // TEMP
        return strAr;
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