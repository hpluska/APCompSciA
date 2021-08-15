/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package gridmaker;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author pluska
 */
public class GridMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grid buttonGrid = new Grid(20);
        buttonGrid.colorAllButtons(Color.red);
        JFrame gridFrame = new JFrame("grid");
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridFrame.getContentPane().add(buttonGrid);
        gridFrame.pack();
        gridFrame.setVisible(true);
    }
    
}
