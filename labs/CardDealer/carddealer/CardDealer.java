/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealernonstatic;

/**
 *
 * @author Pluska
 */
public class CardDealer extends DeckOfCards{
    
    private int dealSize;
    private Card[] dealt;

    /**
     *
     * @param args
     */
    public CardDealer(){
        super();
    }
    
    /**
     * TODO: Write the dealCards method
     * Deals a hand of cards of size DEALSIZE
     * @return dealt, an array of cards
     */
    public Card[] dealCards(int d){

        return dealt;
    }
    
    /**
    * TODO: Write the swapCards method that swaps 
    * the values of two cards in the deck.  
    * @param i location of first card
    * @param k location of second card
    */
    private void swapCards(int i, int k){

    }
    /**TODO:  Write the shuffleCards method.
     * The shuffle cards method, shuffles
     * the deckOfCards. Use the swapCards method you 
     * wrote above to complete the shuffleCards method.
     * 
     */
    public void shuffleCards(){
       
    }
    
    /**
     * TODO: Write the getHighestCard method
     * which finds the card with the highest value in a hand
     * @return the highest card in a dealt hand
     */
    public Card getHighestCard(){
        Card highest = dealt[0];
        return highest;
    }
    
    /**
     * TODO: Write a method called show sumDeal 
     * that returns the sum of all the cards dealt 
     * @return the sum of the dealt cards
    */
    public int sumDeal(){
    int sum = 0;
        return sum;
    }
    
    /**
     * TODO: Write a method called countValues that finds the 
     * number of aces, twos, threes, etc
     * @return an array of the stored values
     */
    public int[] countValues(){
    int values[] = new int[13];

        return values;
    }   
        
    /** TODO: Write a method called countSuites that finds 
     *  the number of cards in each suite. 
     * @return an array of the stored values
     */
    public int[] countSuites(){
    int values[] = new int[4];
        return values;
    }
             
    /** TODO: Write the locateCard method that locates
     *  Card c in a the dealt cards. 
     *  @return an the index of the card, if found, otherwise return -1
     */
    public int locateCard(Card c){
        return -1;
    }
    


}
