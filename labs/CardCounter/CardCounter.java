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
public class CardCounter extends CardDealer {
    
    public CardCounter(int d){
        super(d);
        
    }
    //Write a method called show deal
    public void showDeal(){
        
        for(int i = 0; i < dealCards().length;i++){
            System.out.println(dealCards().toString());
            
        }
    }
    
    //Write a method that finds the number of aces, twos, threes, etc
    
    
    
    //Write a method that finds the number of each suite
    
    
    
    //Write a method that prints the dealt hand backwards
    
    
    //
    
}
