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
public class CardCounterDriver {
    
    public static void main(String args[]){
        CardCounter myGame = new CardCounter(10);
        Card dealtCards[] = myGame.dealCards();
        
        for(int i = 0; i < dealtCards.length;i++){
            System.out.println(dealtCards[i].toString());
        }
    }
    
}
