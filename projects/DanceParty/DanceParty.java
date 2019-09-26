
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
        private final int DELAY = 200; //milliseconds
        /**
         * Constants to set the initial width and height of the screen
         */
        private final int INIT_WIDTH = 600; // width of the screen
	private final int INIT_HEIGHT = 600;// height of screen
	Graphics2D g;
        
        private int x, y, count=0, xDelta = 1, xEyes=1, xEyesDelta=1, offSet = 40, yDelta = 10, yMouth = 50;
        int offSetAngle = 0;
        int offSetAngle2 = 0;

	/**
	 * Draws a filled bouncy ball that stays within the bounds of the screen.
	 *
	 * @param g Graphics context
	 */
	public void paintComponent(Graphics g0)
	{
		
            count++;
            x += xDelta;
            if(x > 300){
                xDelta*=-1;
            }
            if(x < 100){
                xDelta*=-1;
            }
            
            g = (Graphics2D) g0;
            g.setColor(Color.YELLOW);
            g.fillRect(0,0, getWidth(), getHeight());
            
            //draws the name of the dancer
            g.setColor(Color.BLUE);
            g.setFont(new Font("Helvetica", Font.BOLD, 24));
            g.drawString(name, getWidth()/2-100, 50);
            
            //draws the body
            g.setColor(Color.green);
            g.fillOval(x, y, 200, 300);
            
            //draws an eye with a pupil that moves back and forth
            xEyes+=xEyesDelta;
            if(xEyes==15){xEyesDelta *= -1;}
            if(xEyes==0){xEyesDelta *= -1;}
            g.setStroke(new BasicStroke(10));
            g.setColor(Color.black);
            g.drawOval(x+90,178,35,10);
            g.setColor(Color.white);
            g.drawOval(x+95+xEyes, 180, 5, 5);
            
            //draws the horns
            g.setColor(Color.black);
            int x1[]={55+x, 55+x, 65+x};
            int y1[]={105, 80, 90};
            g.drawPolygon( x1, y1, 3);
            int x2[]={145+x, 135+x,145+x};
            int y2[]={80, 90,105};
            g.drawPolygon( x2, y2, 3);
            
            //draws the mouth
            g.setColor(Color.black);
            if(count > 100){
            yMouth += yDelta;
            }
            g.fillOval(80+x, 310, 50, yMouth);
                if(yMouth> 70)
                    yDelta *= -1;
                if(yMouth < 60)
                    yDelta *= -1;
            g.setColor(Color.red);
            g.fillOval(83+x, 335, 44, 14); 
            
            //draws teeth
            g.setColor(Color.WHITE);
            g.fillRect(99+x, 310, 10, 12);
            g.setStroke(new BasicStroke(1));
            g.setColor(Color.black);
            g.drawLine(104+x,310,104+x,322);
            
            //draws arms
            g.setStroke(new BasicStroke(10));
            
            if(count >50){
            
            g.drawLine(205+x, 250, x+250, 250);
            g.drawLine(255+x, 250, x+255+(int)(Math.sin(Math.toRadians(offSetAngle+=20))*50), 250+(int)(Math.cos(Math.toRadians(offSetAngle+=20))*50));
            g.drawLine(x-55, 250, x-5, 250);
            g.drawLine(-55+x, 250, x+(-55)+(int)(Math.sin(Math.toRadians(offSetAngle2-=20))*50), 250+(int)(Math.cos(Math.toRadians(offSetAngle2-=20))*50));
            }else{
            g.drawLine(205+x,250,300+x,250);
            g.drawLine(-95+x,250,-5+x,250);
            }
            
            //draws legs
            g.setColor(Color.BLACK);
            g.setStroke(new BasicStroke(10));
            g.drawLine(75+x, 400, 75+x, 450);
            g.drawLine(125+x, 400, 125+x, 450);
            if(count>50){
                if(count%4==0){
                    g.drawLine(75+x, 450, 100+x, 450);
                    g.drawLine(125+x, 450, 150+x, 450);
                }else{
                    g.drawLine(75+x, 450, 50+x, 450);
                    g.drawLine(125+x, 450, 100+x, 450);
                }
            }else{
 
                g.drawLine(75+x, 450, 50+x, 450);
                g.drawLine(125+x, 450, 100+x, 450);
            }
            
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
                x = 175;
                y = 100;
		startAnimation();
	}
        
         /**
         * Plays the song indicated by the fileName.  
         */
        public static void playMusic(){
        //TODO: Change the path to the correct path on your computer
        String fileName = "/home/fred/Desktop/TimberlineCS/RandomJavaProjects/NetbeansProjects/DanceParty/src/danceparty/MakeSomeNoise.au";
        
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
		JFrame frame = new JFrame ("Bouncy Ball");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new DanceParty());
		frame.pack();
		frame.setVisible(true);
                playMusic();
	}
}
