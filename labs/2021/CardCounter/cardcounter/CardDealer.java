/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounter;

/**
 *
 * @author Pluska
 */
public class CardDealer extends DeckOfCards{
    
    private static int dealSize;
    private static Card[] dealt;

    /**
     *
     * @param args
     */
    public CardDealer(int d){
        super();
        dealSize = d;
        dealt = new Card[dealSize];
        buildDeck();
        //shuffleCards();
        //dealCards();
    }
        
    /**
     * Deals a hand of cards of size DEALSIZE
     * @return dealt, an array of cards
     */
    public void dealCards(){
        
        for(int i = 0; i < dealSize; i++){
            dealt[i] = nextCard();
        }
    }
   

    private void swapCards(int i, int k){
        Card c1 = getCard(i);
        Card c2 = getCard(k);
        setCard(i, c2);
        setCard(k, c1);
    }

    private void shuffleCards(){
        for(int i = 0; i < deckSize(); i++){
            int k = (int)(Math.random()*deckSize());
            swapCards(i, k);
        }
    }
    
    public Card getHighestCard(Card[] d){
        Card highest = d[0];
        for(int i = 0; i < d.length;i++){
            if(d[i].getValue() > highest.getValue()){
                highest = d[i];
            }
        }
        return highest;
    }
    
    public Card[] getDealtCards(){
        return dealt;
    }
    
    
     
}
