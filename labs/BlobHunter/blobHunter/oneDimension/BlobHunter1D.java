/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter1d;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class BlobHunter1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                JFrame frame = new JFrame("Blob Hunter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(true);
		frame.getContentPane().add(new BlobHunterPane1D());
		frame.pack();
		frame.setVisible(true);
    }
    
}
