/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfourstudent;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Pluska
 * Creates a connect four playing grid
 * for a two person game.  Evaluates the winner of each game
 * and keeps track of corresponding game stats. 
 */
public class ConnectFourGrid extends JPanel implements ActionListener, ConnectFourInterface{
    
    private JButton[][] tiles;
    private int[][] disks;
    private JButton clicked;
    private int clickedCol;
    private int currentPlayer, playerOneWins = 0, playerTwoWins = 0;
    private int gridDimensions;
    private Color buttonColor = null;
    private Font f;

    /**
     * constructor which creates the playing grid
     * @param d
     */
    public ConnectFourGrid(int d){
        gridDimensions = d;       
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(600, 600));
        f = new Font("Calibri",Font.BOLD,25);
        tiles = new JButton[gridDimensions][gridDimensions];
        
        /**
         * Creates a new button at [0,0] on the grid
         * TODO:  Populate row [0] with buttons.  These buttons control 
         * the dropping of the disks
         */
        tiles[0][0] = new JButton();
        tiles[0][0].setFont(f);
        tiles[0][0].setText("GO");
        tiles[0][0].setForeground(Color.WHITE);
        tiles[0][0].addActionListener(this);
        add(tiles[0][0]);
        
        /**
         * Creates a button at [1,0] on the grid
         * TODO:  Create the grid by filling it with 
         * more buttons.  
         */
        tiles[1][0] = new JButton();       
        add(tiles[1][0]);
        
        //Once the grid is populated start the game
        startGame(); 
        
    }
    
    /**
     * Starts a new game without resetting the game stats
     * TODO: initialize the disks array. This array will be used 
     * to keep track of the disks that are added to the grid
     * TODO: implement additional logic as needed. 
     */
    public void startGame(){

    }


    /**
     * Drops a disk to the lower most location of a given column
     * @param col is the selected column the disk is dropped
     * @param player is the player dropping the disk
     * TODO: Complete the dropDisk method
     */
    public void dropDisk(int col, int player){
 
    }
    
    /**
     * Switches the current player 
     * TODO:  Complete the switchPlayer method
     */
    public void switchPlayer(){

    }
    
    /**
     * Checks for a winner after each disk is dropped.  An win occurs
     * if there are four across in the horizontal, vertical, or diagonal direction
     * TODO: Complete the checkWinner method
     */
    public void checkWinner(){

    }
    
    /**
     * Checks if the grid is full and there are no more 
     * possible moves
     * @return true if the grid is full
     * TODO: Complete the isFull method
     */
    public boolean isFull(){
        return false; 
    }
    
    /**
     * Displays the number of wins for each player
     * This continues until the program is terminated
     * TODO: Complete the showStats method such that correct stats appear in the popup window
     * after each round is complete
     */
    public void showStats(){
        
        JOptionPane stats = new JOptionPane();
        stats.showMessageDialog(null, "Player " + currentPlayer + " Wins!" + "\n" +
                "Player 1: " + playerOneWins + "\n" + "Player 2: " + playerTwoWins);
    }
    
    /**
     * resets the playing grid for new game
     * without resetting the game stats
     * TODO: Complete the resetGame method
     */
    public void resetGame(){
 
    }

    /**
     * Locates which button in the top row is clicked
     * @param c the button clicked
     * TODO:  Complete the locateClicked button method
     * clickedCol should be assigned an integer value 0 thru 6, depending
     * on the button clicked in the first row
     */
    public void locateClicked(JButton c){
 
        if(c == tiles[0][0]){
            clicked = c;
            clickedCol = 0;
        }
    }
    
    /**
     * DO NOT EDIT ANYTHING BELOW 
     */
    
    
    /**
     * implements the action button clicked on ConnectFourLegend
     * @param i the action of the button.  Depending on the value a different action is invoked
     */
    public void doButtonAction(int i) {
        if(i == 0){
            resetGame();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        dropDisk(clickedCol, currentPlayer);
    }
    

    
}