/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CHRIS
 */
public class Game {
 
    private String gameName, title, question, answer;
    
    public Game(String gameName, String title, String question, String answer) {
        this.gameName = gameName;
        this.title = title;
        this.question = question;
        this.answer = answer;
    }

    public Game(String line) {
        String[] split = line.split(",");
        this.gameName = split[0];
        this.title = split[1];
        this.question = split[2];
        this.answer = split[3];
    }
    
    public String getGameName() {
        return gameName;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    
}