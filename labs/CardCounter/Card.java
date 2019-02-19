/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardDealer;

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
    
    public String toString(){
        return faceValue+suite;
    }
}