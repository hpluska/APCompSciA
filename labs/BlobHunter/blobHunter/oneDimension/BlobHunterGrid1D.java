/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter1d;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author timberlinepluska
 */
public class BlobHunterGrid1D extends JPanel implements ActionListener, BlobHunterInterface {
    
    private JButton[] tiles;
    private JButton clicked;
    private int clickedX, clickedY, mineCount=0, percentMines;
    private int delay = 1000; //in ms
    private int gridDimensions;
    private Color buttonColor = null;
    private boolean[] mines;
    private boolean[] visited;
    private boolean[] locatedMines;
    //TODO: Specify the path to the flag icon 
    private ImageIcon flag = new ImageIcon("/home/timberlinepluska/Desktop/MineHunter_1/src/images/flag.jpg"); 
   
    
    public BlobHunterGrid1D(int d, int p){
        //Initializes the size of the grid to the users specifications
        gridDimensions = d;
        //Initializes the percentage of mines to the users specifications
        percentMines = p;
        //Initializes tiles to a new array of JButtons.
        //DO NOT EDIT
        tiles = new JButton[gridDimensions];
        
        //Initializes the mines array to a new boolean array 
        mines = new boolean[gridDimensions];
        
        //Initializes the visited array to a new boolean array
        visited = new boolean[gridDimensions];

        //Calls the makeMines method
        //You can comment this line out for testing purposes
        // DO NOT EDIT
        makeMines(p);
        
        //Sets the layout of the JPanel and builds the grid of buttons
        //Each button is assigned an ActionListener
        //DO NOT EDIT
        setLayout(new GridLayout(1, gridDimensions));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            
         	tiles[i] = new JButton();       
         	tiles[i].addActionListener(this);
         	add(tiles[i]);
            
        }
    }

   /**
    * Sets the mines on the grid.  Wherever a mind occurs on the grid
    * the mines array will be set to true
    * @param percent mines on the grid
    */
    public void makeMines(int percent){
        
        for(int rows = 0; rows < tiles.length; rows++){
            
                int percentMines = (int)(Math.random()*100);
                if(percentMines>(100-percent)){
                      mines[rows] = true;
                }
        }
    }
    
   /**
    * Displays the mines on the grid.  If there is a mine
    * the background of the button will be red
    * the flag icon will appear. 
    * Use .setBackground(Color.RED) to set the color
    * Use .setIcon(flag) to show 
    * the flag
    */
    public void showMines(){
        
        for(int rows = 0; rows < tiles.length; rows++){

                if(mines[rows]){
                    tiles[rows].setBackground(Color.RED);
                    tiles[rows].setIcon(flag);
                }

        }
        
    }
    
   /**
    * Checks the mines array to see if a mine is set at the 
    * x and y location of the clicked button.  I a mine is 
    * set showMines() will be called and all the buttons will appear
    * to indicate that the player has lost
    * @param mineX the x location of the button clicked
    */
    public void checkForMine(int mineX){
         
        if(mines[mineX]){
            //System.out.println("You lose");
            showMines();
        }
        
    }

    /**
     * TODO:  Write the getBlob method for 1 Dimension
     * The getBlob method gets the safe buttons (that is buttons
     * that do not have mines).  The getBlob method will recursively
     * search for safe buttons for every button clicked.
     * @param b the button clicked 
     */
    public void getBlob(int b) {
  
    } 

    /**
     * DO NOT EDIT
     * Locates the button that is clicked on the grid
     * locates the x location of the button clicked
     * @param c the button clicked
     */
    public void locateClicked(JButton c){
        
        for(int rows = 0; rows < tiles.length; rows++){

                if(c == tiles[rows]){
                
                clicked = c;
                clickedX = rows;
                }
        }
        
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        checkForMine(clickedX);
        getBlob(clickedX);
        
    } 
}
