/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounterwithimages;

/**
 *
 * @author timberlinepluska
 */
public class Card {

    private String faceValue, suite;
    private int value;
    
    /**
     * Card Constructor
     * @param fv face value of the card, (e.g., king, one, two)
     * @param s suite of the card 
     * @param v value of the card (1-13)
     */
    public Card(String fv, String s, int v){
        suite = s;
        faceValue = fv;
        value = v;
    }
    
    /**
     * Gets the value of the card
     * @return value of card (1-13)
     */
    public int getValue(){
        return value;
    }
    
    public String getFaceValue(){
        
        switch(faceValue){
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            case "ten":
                return "10";
            case "jack":
                return "J";
            case "queen":
                return "Q";
            case "king":
                return "K";
            case "ace":
                return "A";
        }
        
        
        return "";
    }
    
    public String getSuite(){
        String tempSuiteArray[] = suite.split(" ");
        String firstLetter = tempSuiteArray[2].substring(0,1).toUpperCase();
        String everythingElse = tempSuiteArray[2].substring(1);
        return firstLetter+everythingElse;
    }
    
    public String getSuiteIcon(){
        String tempSuiteArray[] = suite.split(" ");
        return tempSuiteArray[3];
    }
    
    public String toString(){
        return faceValue+suite;
    }
}