/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class BlobHunter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                JFrame frame = new JFrame("Blob Hunter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.isResizable();
		frame.getContentPane().add(new BlobHunterPane());
		frame.pack();
		frame.setVisible(true);
    }
    
}
