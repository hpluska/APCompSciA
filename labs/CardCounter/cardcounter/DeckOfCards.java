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
public class DeckOfCards {
    
    private Card cards[];
    private final int DECKSIZE = 52;
    public int nextCardIndex = 0;
    private String[] suiteNames = {
        " of spades " + '\u2660', 
        " of diamonds " + '\u2666', 
        " of clubs " + '\u2663', 
        " of hearts " + '\u2764'
    };
    private String[] values = {
        "ace", //1 or
        "two", //2
        "three", //3
        "four", //4
        "five", //4
        "six", //5
        "seven", //6
        "eight", //7
        "nine", //8
        "ten", //9
        "jack", //10
        "queen", //11
        "king"//13
    };
    
    /**
     * Creates a sorted deck of 52 cards
     */
    public void buildDeck(){
        
        cards = new Card[DECKSIZE];
        int cardValueIndex = 0;

        for(int s = 0; s < suiteNames.length; s++){
            for(int v = 0; v < values.length; v++){
                cards[cardValueIndex] = new Card(values[v], suiteNames[s], v);
            cardValueIndex++;
            }
        }
    }
    
    /**
     * gets the numeric value of the card
     * @param Card - the Card object we want the value to retreive
     * @return
     */
    public int getValue(Card c){
        return c.getValue();
    }
	
	  /**
     * gets the symbol of the suite of the card
     * @param Card - the Card object we want the suite to retreive
     * @return
     */
	public char getSuite(Card c){
        
        String suite = c.toString();
        return suite.charAt(suite.length() - 1);
    }
    
    /**
     * Returns the Card at a specified index in the deck
     * @param index - location of card
     * @return
     */
    public Card getCard(int index){
        return cards[index];
    }
    
    /**
     * Sets the card at a given index to a different Card
     * @param index1 - the location of the card to be set
     * @param c - the Card we want to place at the location
     */
    public void setCard(int index1, Card c){
        cards[index1] = c;
    }
    
    /**
     * Returns the next Card in the deck
     * @return
     */
    public Card nextCard(){
        nextCardIndex++;
        return cards[nextCardIndex-1];
    }
    
    /**
     * Shows the card at a specified location 
     * @param index - the location of the card in the deck
     * @return
     */
    public String showCard(int index){
        return cards[index].toString();
    }

    /**
     *
     * @return the size of the deck
     */
    public int deckSize(){
        return DECKSIZE;
    }
	 /**
     *
     * @return an array of card values
     */
	public String[] getCardValues(){
        return values;
    }
    
	 /**
     *
     * @return an array of suite symbols
     */
    public char[] getSuiteValues(){
        char suites[] = new char[4];
        for(int i = 0; i < suiteNames.length;i++)
            suites[i] = suiteNames[i].charAt(suiteNames[i].length() - 1);
        return suites;
    }
    
}