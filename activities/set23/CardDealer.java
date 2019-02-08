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
public class CardDealer {
    
    //private static Card[] deckOfCards;
    private static Card[] dealt;
    
    public static void main(String args[]){
        
        DeckOfCards.buildDeck();
        System.out.println(DeckOfCards.showCard(0));
        System.out.println(DeckOfCards.showCard(1));
        shuffleCards();
        System.out.println(DeckOfCards.showCard(0));
        System.out.println(DeckOfCards.showCard(1));       

    }
    

    public static Card[] dealCards(){
        return dealt;
    }
    
    public static void shuffleCards(){
        Card temp = DeckOfCards.getCard(0);
        DeckOfCards.setCard(0, DeckOfCards.getCard(1));
        DeckOfCards.setCard(1, temp);
        
    }
    
    
    
    
    
}
