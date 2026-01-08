/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * For-Loop Practice
 * @author hpluska
 * @author yourname
 */
@SuppressWarnings("serial")
public class ForLoops extends JPanel
{
        /**
         * Constants to set the initial width and height of the screen
         */
        private final int INIT_WIDTH = 600; // width of the screen
	private final int INIT_HEIGHT = 600;// height of screen
	Graphics2D g;
        /**
	* Some variables to get you started.  
	* 
	*/
        private int x = 0, y = 0, step=10;

	/**
	 * @param g Graphics context
	 */
	public void paintComponent(Graphics g0)
	{
	    //Creates a 2D graphics variable
            //DO NOT MODIFY
	    g = (Graphics2D) g0;
		
	    //Creates a yellow rectangle that fills the screen 
            g.setColor(Color.YELLOW);
            g.fillRect(0,0, getWidth(), getHeight());

	    //Draws blue rectangles across the top of the screen
            g.setColor(Color.BLUE);
	    	System.out.println(getWidth());
			for(int rows = 0; rows < getHeight();rows+=step){
				for(int cols = 0; cols< rows;cols+=step){
		
					if(cols%20 == 0){
				
						g.fillRect(cols,rows, step, step);
					}
				}
			}
					
				
            
	    
	
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins.
	 */
	public ForLoops()
	{
		setPreferredSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
		this.setDoubleBuffered(true);
		setBackground(Color.black);
	}
        
        
	/**
	 * Starting point for the DanceParty program.
	 * DO NOT MODIFY.
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("For Loops");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ForLoops());
		frame.pack();
		frame.setVisible(true);
                frame.setBackground(Color.BLACK);
                
	}
}

