/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Pluska
 */
public class CardPanel extends JPanel implements ActionListener {
    private int dealSize;
    private JButton clicked;
    private Card clickedCard;
    private JButton[] cardButtons;
    private Card cardArray[];
    private String pathToCardImages="C:\\Users\\HP Sprout\\Desktop\\NetbeansProjects\\CardCounter\\src\\images\\";
    ImageIcon cardImageIcon;

    /**
     *
     * @param d
     */
    public CardPanel(){
        
        dealSize = 10;
        CardCounter myDeal = new CardCounter(dealSize);
        cardArray = myDeal.getDealtCards();
	
		
	//DO NOT EDIT
        showCards(cardArray);
    }
	
	//DO NOT EDIT ANYTHING BELOW 
    
    /**
     * Displays the dealt cards as buttons
     * @param cardArray the dealt cards
     */
    public void showCards(Card[] cardArray){

        cardButtons = new JButton[dealSize];
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(500,500));
        
        for(int c = 0; c < cardArray.length;c++){
            String cardImage = "card"+cardArray[c].getSuite()+cardArray[c].getFaceValue()+".png";
            String cardPath = pathToCardImages+cardImage;
            cardImageIcon = new ImageIcon(cardPath);
            cardButtons[c] = new JButton(cardImageIcon);
            cardButtons[c].setBackground(Color.black);
            cardButtons[c].setPreferredSize(new Dimension(50,68));
            cardButtons[c].addActionListener(this);
            add(cardButtons[c]); 
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        
        
    }
    /**
     * Locates the button clicked and corresponding card
     * @param b is the card button clicked
     */    
    public void locateClicked(JButton b){
        /*Implementation not shown*/
    }
    
}
