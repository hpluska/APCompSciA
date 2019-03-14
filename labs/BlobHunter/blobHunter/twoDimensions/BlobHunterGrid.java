/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter;



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
public class BlobHunterGrid extends JPanel implements ActionListener, BlobHunterInterface {
    
    private JButton[][] tiles;
    private JButton clicked;
    private int clickedX, clickedY, mineCount=0, percentMines;
    private int delay = 1000; //in ms
    private int gridDimensions;
    private Color buttonColor = null;
    private boolean[][] mines;
    private boolean[][] visited;
    private boolean[][] locatedMines;
    //TODO: Specify the path to the flag icon 
    private ImageIcon flag = new ImageIcon("/home/timberlinepluska/Desktop/MineHunter_1/src/images/flag.jpg"); 
    
    private Color[] buttonColors = {Color.WHITE, Color.GRAY, Color.GREEN, Color.YELLOW, Color.PINK, Color.BLUE, Color.RED, Color.BLACK};

    public BlobHunterGrid(int d, int p){
        //Initializes the size of the grid to the users specifications
        gridDimensions = d;
        //Initializes the percentage of mines to the users specifications
        percentMines = p;
        //Initializes tiles to a new 2D array of JButtons.
        //DO NOT EDIT
        tiles = new JButton[gridDimensions][gridDimensions];
        
        //Initializes the mines 2D array to a new boolean 2D array 
        //the number of rows in this array is equal to the gridDimensions
        //the number of cols in this array is equal to the gridDimenstions
        mines = new boolean[gridDimensions][gridDimensions];
        
        //Initializes the visited 2D array to a new boolean 2D array 
        //the number of rows in this array is equal to the gridDimensions
        //the number of cols in this array is equal to the gridDimenstions
        visited = new boolean[gridDimensions][gridDimensions];
        
        //The mines located by the user
        //DO NOT EDIT
        locatedMines = new boolean[gridDimensions][gridDimensions];

        //Calls the makeMines method
        //You can comment this line out for testing purposes
        // DO NOT EDIT
        makeMines(p);
        
        //Sets the layout of the JPanel and builds the grid of buttons
        //Each button is assigned an ActionListener
        //Each button is assigned a rightClickListener
        //DO NOT EDIT
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
         	add(tiles[i][j]);
            }
        }
    }

   /**
    * Sets the mines on the grid.  Wherever a mind occurs on the grid
    * the mines array will be set to true
    * @param percent mines on the grid
    */
    public void makeMines(int percent){
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length;cols++){
                int percentMines = (int)(Math.random()*100);
                if(percentMines>(100-percent)){
                      mines[rows][cols] = true;
                }
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
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(mines[rows][cols]){
                    tiles[rows][cols].setBackground(Color.RED);
                    tiles[rows][cols].setIcon(flag);
                }
            }
        }
        
    }
    
   /**
    * Checks the mines array to see if a mine is set at the 
    * x and y location of the clicked button.  I a mine is 
    * set showMines() will be called and all the buttons will appear
    * to indicate that the player has lost
    * @param mineX the x location of the button clicked
    * @param mineY the y location of the button clicked
    */
    public void checkForMine(int mineX, int mineY){
        
        
        if(mines[mineX][mineY]){
            //System.out.println("You lose");
            showMines();
        }
        
    }
    /**
     *  Write the getBlob method for a 2-dimensional grid
     */
    public void getBlob(int r, int c) {

    }  

    /**
     * DO NOT EDIT
     * Resets the game.  
     */
    public void resetGame(){
        for(int rows = 0; rows < mines.length; rows++){
            for(int cols = 0; cols < mines[rows].length; cols++){
                mines[rows][cols]=false;
                locatedMines[rows][cols]=false;
                tiles[rows][cols].setBackground(null);
                tiles[rows][cols].setIcon(null);
            }
        }
        
        makeMines(percentMines);
    }
    
    /**
     * DO NOT EDIT
     * resets the game if the reset button is clicked
     * @param i indicates whether to reset game
     */
    public void doButtonAction(int i) {
        if(i == 0){
            resetGame();
        }
    }
    
    /**
     * DO NOT EDIT
     * Sets the rightClicked Button with a flag
     * If a mine is found by the player
     * @param mineX
     * @param mineY 
     */
    public void identifyMines(int mineX, int mineY){
        if(!locatedMines[mineX][mineY]){
            tiles[mineX][mineY].setIcon(flag);
            locatedMines[mineX][mineY]=true;
        }else{
            tiles[mineX][mineY].setIcon(null);
            locatedMines[mineX][mineY]=false;
        }

    }
    
    /**
     * DO NOT EDIT
     * Locates the button that is clicked on the grid
     * locates the x and y location of the button clicked
     * @param c the button clicked
     */
    public void locateClicked(JButton c){
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(c == tiles[rows][cols]){
                
                clicked = c;
                clickedX = rows;
                clickedY = cols;

                }
            }
        }
        
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        checkForMine(clickedX, clickedY);
        getBlob(clickedX, clickedY);
        
    }
    
}
