/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter1d;

import javax.swing.JButton;

/**
 *
 * @author pluska
 */
public interface BlobHunterInterface {
    
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
    */
    void checkForMine(int mineX);
    
  
    /**
     * Locates the button that is clicked on the grid
     * locates the x location of the button clicked
     * @param b the button clicked
     */
    void locateClicked(JButton b);
}
