/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author Chris
 */
public class WordPair {
 
    private final String question, answer;
    
    //Example line: "Hest,Horse"
    public WordPair(String line) {
        String[] splits = line.split(",");
        question = splits[0];
        answer = splits[1];
    }
    
    public WordPair(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    
    @Override
    public String toString() {
        return question + "," + answer;
    }
 
    public boolean isEqual(String danish, String english) {
        return this.question.equalsIgnoreCase(danish) && this.answer.equalsIgnoreCase(english);
    }
    
    public boolean isPartOf(String word) {
        return answer.equalsIgnoreCase(word) || question.equalsIgnoreCase(word);
    }
    
    public String getEquivalent(String word) {
        if (isPartOf(word)) {
            if (word.equalsIgnoreCase(answer)) {
                return question;
            }
            return answer;
        }
        return null;
    }
    
}