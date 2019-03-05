/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridmaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pluska
 */
public class Grid extends JPanel {
    
    private JButton[][] tiles;
    private int gridDimensions;
    
    public Grid(int d){
        gridDimensions = d;
        tiles = new JButton[gridDimensions][gridDimensions];
        setLayout(new GridLayout(gridDimensions, gridDimensions));
        setPreferredSize(new Dimension(500,500));
        
        for(int row = 0; row < tiles.length; row++){
            
            for(int col = 0; col < tiles[row].length; col++){
                tiles[row][col] = new JButton();
                add(tiles[row][col]);
            }
        }
        
    }
    
    public void colorAllButtons(Color c){
        for(int row = 0; row < tiles.length; row++){
            
            for(int col = 0; col < tiles[row].length; col++){
                tiles[row][col].setBackground(c);
            }
        } 
        
    }

    
    
}
