
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
 * AP CS A Project 1: Dance Party
 * Animates a [put your description here]
 * @author hpluska
 * @author yourname
 */
@SuppressWarnings("serial")
public class DanceParty extends JPanel
{
        /**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
        private final int DELAY = 100; //milliseconds
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
        private int x, y, xDelta = 1, yDelta = 1, frameCount;

	/**
	 * Draws an avatar that dances to a song
	 *
	 * @param g Graphics context
	 */
	public void paintComponent(Graphics g0)
	{
	    //Creates a 2D graphics variable
            //DO NOT MODIFY
	    g = (Graphics2D) g0;


            /**
             * Below are just some examples of how you can draw stuff and get them moving
	     *
             */
		
	    //Counts the frames.  Useful for timing your movements.
            //for example, you could say if(frameCount == 50){do something}
	    frameCount++;

            //Increments x by xDelta
		 x += xDelta;
		 y += yDelta;
            
	    //Creates a yellow rectangle that fills the screen 
            g.setColor(Color.YELLOW);
            g.fillRect(0,0, getWidth(), getHeight());

	    //Creates a gray rectangle that moves across the screen
            //if the frameCount is greater than 50
       	    //if(frameCount > 50){
            	g.setColor(Color.PINK);
            	g.fillRect(x,y, 300, 200);
            //}
	    
            //draws the name of the dancer
            g.setColor(Color.BLUE);
            g.setFont(new Font("Helvetica", Font.BOLD, 24));
            g.drawString("My name is...", getWidth()/2-100, 50);
            
            //draws a green oval in the middle of the screen
            //notice the perspective from which the oval is drawn when you run the program
            g.setColor(Color.green);
            g.fillOval(getWidth()/2, getHeight()/2, 200, 300);
            

            //draws a polygon
	    //x1 is an array of x coordinates
	    //y1 is an array of y coordinates
            g.setColor(Color.black);
            int x1[]={55, 55, 65+x};
            int y1[]={105, 80, 90};
            g.fillPolygon( x1, y1, 3);

            //creates a stroke of width 10
            g.setStroke(new BasicStroke(10));

            //draws a black line
            g.setColor(Color.black);
            g.drawLine(104,310,104,350);
            
            // Makes the animation smoother
            Toolkit.getDefaultToolkit().sync();
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins.
	 * This method also sets up a Timer that will call paintComponent() 
	 * with frequency specified by the DELAY constant.
	 */
	public DanceParty()
	{
		setPreferredSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
		this.setDoubleBuffered(true);
		setBackground(Color.black);
		//TODO: Initialize x and y to what ever you want
                x = 0;
                y = INIT_HEIGHT/2;
		startAnimation();
	}
        
         /**
         * Plays the song indicated by the fileName.  
         */
        public static void playMusic(){
        //TODO: Change the path to the correct path on your computer
        String fileName = "MakeSomeNoise.au";
        
	/**
	 * DO NOT MODIFY
	 */
        try 
	    {
                
	    	File soundFile = new File(fileName).getAbsoluteFile();
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();  
	    } 
	    catch(Exception e) 
	    {
	        System.out.println("PlayMusic: Error with playing sound:" + e);
	        e.printStackTrace();
	    }
        }

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY.
	 */
	private void startAnimation() {
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				repaint();
			}
		};
		new Timer(DELAY, taskPerformer).start();
	}
        

	/**
	 * Starting point for the DanceParty program.
	 * DO NOT MODIFY.
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Dance Party");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new DanceParty());
		frame.pack();
		frame.setVisible(true);
                playMusic();
	}
}
