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
public class DeckOfCards {
    
    private static Card cards[];
    private static final int DECKSIZE = 52;
    public static int nextCardIndex = 0;
    private static char[] suites = {
        (char)'\u2660', //spade
        (char)'\u2666', //diamond
        (char)'\u2663', //club
        (char)'\u2764'  //heart
    };
    private static String[] suiteNames = {
        " of spades ", 
        " of diamonds ", 
        " of clubs ", 
        " of hearts "
    };
    private static String[] values = {
        "ace", 
        "two", 
        "three", 
        "four", 
        "five", 
        "six", 
        "seven", 
        "eight", 
        "nine", 
        "ten", 
        "jack", 
        "queen", 
        "king"
    };
    
    public static void buildDeck(){
        
        cards = new Card[52];
        int cardValueIndex = 0;

        for(int s = 0; s < suites.length; s++){
            for(int v = 0; v < values.length; v++){
                cards[cardValueIndex] = new Card(values[v] + suiteNames[s], suites[s]);
            cardValueIndex++;
            }
        }
        
  
        
    }
    
    public static Card getCard(int index){
        return cards[index];
    }
    
    public static void setCard(int index1, Card c){
        cards[index1] = c;
    }
    
    public static String nextCard(){
        nextCardIndex++;
        return cards[nextCardIndex-1].getCard();
    }
    
    public static String showCard(int i){
        return cards[i].getCard();
    }

    
}
