import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Animated program with a ball bouncing off the program boundaries
 * @author mvail
 * @author yourname
 */
@SuppressWarnings("serial")
public class BouncyBall extends JPanel
{
	private final int INIT_WIDTH = 600;
	private final int INIT_HEIGHT = 400;
	private final int DELAY = 60;       // milliseconds between Timer events

	private final int DELTA_RANGE = 20; // range for xDelta and yDelta
	private final int MAX_RADIUS = 20;  // maximum radius value
	private final int MIN_RADIUS = 5;   // minimum radius value

	private Random rand;                // random number generator
	private Color color;                // initial ball color

	private int x, y;                   // ball anchor point coordinates
	private int xDelta, yDelta;         // change in x and y from one step to the next

	private int radius = 10;            // ball radius
	private int rDelta = 1;             // change in radius from one step to the next

	/**
	 * Draws a filled bouncy ball that stays within the bounds of the screen.
	 *
	 * @param g Graphics context
	 */
	public void paintComponent(Graphics g)
	{
		int width = getWidth();
		int height = getHeight();

		// Clear canvas
		g.setColor(getBackground());
		g.fillRect(0, 0, width, height);

		// Calculate new x anchor point value
		x += xDelta;
		// TODO: needs more to stay in-bounds


		// Calculate new y anchor point value
		y += yDelta;
		// TODO: needs more to stay in-bounds
		if(y > height){
			yDelta*=-1;
		}
		if(x > width){
			xDelta*=-1;
		}
		if( y < 0){
			yDelta*=-1;
		}
		if(x < 0){
			xDelta*=-1;
		}


		// TODO: use rDelta, MIN_RADIUS, and MAX_RADIUS to increase/decrease oval radius.
		radius += rDelta;
		if (radius > MAX_RADIUS) {
			radius = MAX_RADIUS;
			rDelta *= -1;
		} else if (radius < MIN_RADIUS) {
			radius = MIN_RADIUS;
			rDelta *= -1;
		}

		
		


		// Paint the ball at the calculated anchor point
		g.setColor(color);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);

		// Makes the animation smoother
		Toolkit.getDefaultToolkit().sync();
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins.
	 * This method also sets up a Timer that will call paintComponent() 
	 * with frequency specified by the DELAY constant.
	 */
	public BouncyBall()
	{
		setPreferredSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
		this.setDoubleBuffered(true);
		setBackground(Color.black);

		 // Instantiate instance variable for reuse in paintComponent()
		rand = new Random();

		// Initialize ball color
		color = Color.RED;
		// TODO: replace with random starting color.

		// Initialize ball anchor point within panel bounds
		x = INIT_WIDTH / 2;
		y = INIT_HEIGHT / 2;
		// TODO: replace centered starting point with a random
		// position anywhere in-bounds - the ball should never
		// extend out of bounds, so you'll need to take RADIUS
		// into account


		// Initialize deltas for x and y
		xDelta = 5;
		yDelta = 5;
		// TODO: replace with random deltas from -DELTA_RANGE/2
		// to +DELTA_RANGE/2
		xDelta = (int)(Math.random()*(DELTA_RANGE/2-DELTA_RANGE/2)-DELTA_RANGE/2);
		yDelta = (int)(Math.random()*(DELTA_RANGE/2-DELTA_RANGE/2)-DELTA_RANGE/2);
		//Start the animation - DO NOT REMOVE
		startAnimation();
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
	 * Starting point for the BouncyBall program.
	 * DO NOT MODIFY.
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Bouncy Ball");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BouncyBall());
		frame.pack();
		frame.setVisible(true);
	}
}
