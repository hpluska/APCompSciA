/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minehunter;

import javax.swing.JButton;

/**
 *
 * @author pluska
 */
public interface MineHunterInterface {
    
    /**
    * Sets the mines on the grid.  Wherever a mind occurs on the grid
    * the mines array will be set to true
    * @param percent mines on the grid
    */
    void makeMines(int percent);
    
    /**
    * Displays the mines on the grid.  If there is a mine
    * the background of the button will be red
    * the flag icon will appear.  Use .setIcon(flag) to show 
    * the flag
    */
    void showMines();
    
    /**
    * Checks the mines array to see if a mine is set at the 
    * x and y location of the clicked button.  I a mine is 
    * set showMines() will be called and all the buttons will appear
    * to indicate that the player has lost
    * @param mineX the x location of the button clicked
    * @param mineY the y location of the button clicked
    */
    void checkForMine(int mineX, int mineY);
    
     /**
     * Counts the number of mines surrounding the clicked button
     * Depending on the number of mines located, the button clicked will be set to
     * a different color in the buttonColors array
     * @param xLoc x location of button clicked
     * @param yLoc y location of button clicked
     */
    void paintTiles(int xLoc, int yLoc);
    
    /**
     * Checks if all the mines have been located.  
     * If all the mines have been located in the mines array, 
     * returns true, otherwise, returns false
    */
    boolean isDone();
    
    /**
     * Resets the game
     */
    void resetGame();
    
    /**
     * resets the game if the reset button is clicked
     * @param i indicates whether to reset game
     */
    void doButtonAction(int i);
    
    
    /**
    * Sets the rightClicked Button with a flag
    * If a mine is found by the player
    * @param MineX
    * @param MineY 
    */
    void identifyMines(int mineX, int mineY);
    
    /**
     * Locates the button that is clicked on the grid
     * locates the x and y location of the button clicked
     * @param b the button clicked
     */
    void locateClicked(JButton b);
}
