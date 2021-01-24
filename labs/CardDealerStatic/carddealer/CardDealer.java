import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Simulates a card dealer
 * @author Pluska
 */
public class CardDealer extends JPanel{
    
    private static final int DEALSIZE = 5;
    private static Card[] dealt;
    private static JButton[] cardButtons;
    private static String pathToCardImages = "images/";
    private static ImageIcon cardImageIcon;
    private static int suiteArray[] = new int[4];
    
    /**
     * This is the main method where you will call methods from
     * the DeckOfCards class.  
     * @param args
     */
    public static void main(String args[]){
        
        /*Notice, that we do not need to create
        an object of DeckOfCards to access buildDeck.  
        This is because the buildDeck method is static*/
        DeckOfCards.buildDeck();
        DeckOfCards.shuffleCards();
        
        /*
        Challenge 2: 
        We can also call dealCards in the same way, 
        because it too is static. 
        Add an if statement to check if there are enough cards to deal.  
        If there are not enough cards, 
        you must build a new deck, reshuffle the cards, and redeal*/
        dealt = DeckOfCards.dealCards(DEALSIZE);

        
        /*DO NOT EDIT*/
        displayCards();
      }

      /**
       * Challenge 3: Finish the CardDealer class by completing the methods
       * below
       */
      //getHighestCard
      //getLowestCard
      //sumDeal
      //getSuites
      //getValues

      /**
       * DO NOT EDIT ANYTHING BELOW
       * Creates the GUI to display the cards
       */
      public static void displayCards(){

        cardButtons = new JButton[DEALSIZE];

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(500,500));
        for (int c = 0; c < DEALSIZE; c++) {
            String cardImage = "card"+dealt[c].getSuite()+dealt[c].getFaceValue()+".png";
            String cardPath = pathToCardImages+cardImage;
            cardImageIcon = new ImageIcon(cardPath);
            cardButtons[c] = new JButton(cardImageIcon);
            cardButtons[c].setBackground(Color.black);
            cardButtons[c].setPreferredSize(new Dimension(50,68));
            panel.add(cardButtons[c]); 
        }
        JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        container.add(panel);
        JScrollPane scrollPane = new JScrollPane(container);
        f.getContentPane().add(scrollPane);
    
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
      }



    }
    
    
     
