/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package minehunter;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class MineHunter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame frame = new JFrame("Mine Walker");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      if(args.length < 1){
	  	     frame.getContentPane().add(new MineHunterPane());
      }else{
        frame.getContentPane().add(new MineHunterPane(args[0], args[1]);
      }
		  frame.pack();
		  frame.setVisible(true);
    }
    
}
