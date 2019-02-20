
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealer;

/**
 *
 * @author timberlinepluska
 */
public class CardDealer {
    
    private static final int DEALSIZE = 5;
    private static Card[] dealt = new Card[DEALSIZE];
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        
        DeckOfCards.buildDeck();

    }
    
    /**
     * Deals a hand of cards of size DEALSIZE
     * @return dealt, an array of cards
     */
    public static Card[] dealCards(){
        
        for(int i = 0; i < DEALSIZE; i++){
            dealt[i] = DeckOfCards.nextCard();
        }
        
        return dealt;
    }
     
}