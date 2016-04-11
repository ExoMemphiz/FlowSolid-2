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
    private double difficulty;
    
    //Example line: "Hest,Horse"
    public WordPair(String line) {
        String[] splits = line.split(",");
        question = splits[0];
        answer = splits[1];
        difficulty = (splits.length > 2 ? Double.parseDouble(splits[2]) : calculateDifficulty());
    }
    
    public WordPair(String danish, String english) {
        this.question = danish;
        this.answer = english;
    }

    /**
     * @param value 
     * -1 is the minimum amount of characters in a word, 25 is the maximum numbers of characters.
     * @return Normalized range from 0.0 to 1.0
     */
    private double normalize(double value) {
	return (value - 1) / (25 - 1);
    }
    
    private double calculateDifficulty() {
        DecimalFormat format = new DecimalFormat("#.##");
        double normalized = normalize(question.length() + answer.length());
        String formatted = format.format(normalized).replaceAll(",", ".");
        return Double.parseDouble(formatted);
    }
    
    public String getDanish() {
        return question;
    }

    public String getEnglish() {
        return answer;
    }

    public double getDifficulty() {
        return difficulty;
    }
    
    @Override
    public String toString() {
        return question + "," + answer + "," + difficulty;
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