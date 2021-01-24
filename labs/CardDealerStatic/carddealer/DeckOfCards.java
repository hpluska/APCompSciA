
/**
 * Models a standard Deck of Cards
 * @author Pluska
 */
public class DeckOfCards {
    
    private static Card cards[];
    private static Card cardDeal[];
    private static final int DECKSIZE = 52;
    private static int nextCardIndex = 0;
    private static int cardsLeft = 52;

    private static String[] suiteNames = {
        //The symbols for the suites do 
        //not display properly in the windows console
        " of spades " + '\u2660', 
        " of diamonds " + '\u2666', 
        " of clubs " + '\u2663', 
        " of hearts " + '\u2764'
        
    };
    private static String[] values = {
        "ace", //0
        "two", //1
        "three", //2
        "four", //3
        "five", //4
        "six", //5
        "seven", //6
        "eight", //7
        "nine", //8
        "ten", //9
        "jack", //10
        "queen", //11
        "king"//12
    };
    
    /**
     * Creates a sorted deck of 52 cards
     * DO NOT EDIT
     */
    public static void buildDeck(){
        nextCardIndex = 0;
        cardsLeft = 52;
        cards = new Card[DECKSIZE];//creates an array of cards
        int cardValueIndex = 0;

        for(int s = 0; s < suiteNames.length; s++){
            for(int v = 0; v < values.length; v++){
                //creates a card object at each index of cards
                cards[cardValueIndex] = new Card(values[v], suiteNames[s], v);
            cardValueIndex++;
            }
        }
    }

    /**
     * DO NOT EDIT
     * Returns the next Card in the deck
     * @return
     */
    public static Card nextCard(){
        nextCardIndex++;
        cardsLeft--;
        return cards[nextCardIndex-1];
    }

    /**
     * DO NOT EDIT
     * Deals a set of cards of a specified length
     * @param dealSize
     * @return
     */
    public static Card[] dealCards(int dealSize){
        cardDeal = new Card[dealSize];
        for(int c = 0; c < dealSize;c++){
            cardDeal[c] = nextCard();
        }
       return cardDeal;
    }

    /**
     * Challenge 1: Complete the swapCards method
     * Swaps two cards in the cards array at the specified indices
     * @param i1 index of card1
     * @param i2 index of card2
     */
    public static void swapCards(int i1, int i2){

    }

    /**
     * Challenge 2: Complete the shuffleCards method
     * shuffles the cards in the cards array
     */
    public static void shuffleCards(){

    }

    /**
     * Challenge 3: Complete the getOutOfCards method
     * Checks if there are any more cards left in the deck
     * @return
     */
    public static int getCardsLeft(){
        return cardsLeft;
    }
    
}