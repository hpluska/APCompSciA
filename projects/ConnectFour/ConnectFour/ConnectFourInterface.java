/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfourstudent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pluska
 */
public interface ConnectFourInterface {
    
    /**
     * Starts a new game without resetting the game stats
     */
    void startGame();

    
    /**
     * Drops a disk to the lower most location of a given column
     * @param col is the selected column the disk is dropped
     * @param player is the player dropping the disk
     */
    void dropDisk(int col, int player);
    
    /**
     * Switches the current player 
     */
    void switchPlayer();
    
    /**
     * Checks for a winner after each disk is dropped
     */
    void checkWinner();
    
    /**
     * Checks if the grid is full and there are no more 
     * possible moves
     * @return true if the grid is full
     */
    boolean isFull();
    
    /**
     * Displays the number of wins for each player
     * This continues until the program is terminated
     */
    void showStats();
    
    /**
     * resets the playing grid for new game
     * without resetting the game stats
     */
    void resetGame();
    
    /**
     * locates the button clicked on the grid
     * @param c the button clicked
     */
    void locateClicked(JButton c);
}
