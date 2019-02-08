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

    private String value;
    private char suite;
    
    public Card(String v, char s){
        suite = s;
        value = v;
    }
    
    public String getCard(){
        return value+suite;
    }
    
 
}
