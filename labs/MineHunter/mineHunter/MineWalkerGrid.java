/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package minewalker;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.console;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author timberlinepluska
 */
public class MineWalkerGrid extends JPanel implements ActionListener {
    
    private JButton[][] tiles;
    private JButton clicked;
    private int clickedX, clickedY, mineCount=0;
    private int gridDimensions;
    private Color[][] pictureColors;
    private MineWalkerControls controls;
    private Color buttonColor = null;
    private boolean[][] mines;
    private boolean[][] locatedMines;
    private ImageIcon flag = new ImageIcon("flag.jpg");
    private Color[] buttonColors = {Color.WHITE, Color.GRAY, Color.GREEN, Color.YELLOW, Color.PINK, Color.BLUE, Color.RED, Color.BLACK};
    //TODO: declare an arraylist
    private ArrayList<Point> path = new ArrayList<Point>();
    
    
    
    public void doButtonAction(int i) {
        if(i == 0){
            resetGame();
        }else if(i == 1){
            showPath();
        }else if(i == 2){
            showMines();
        }
    }
    
    
    
    private void resetGame(){
        for(int rows = 0; rows < mines.length; rows++){
            for(int cols = 0; cols < mines[rows].length; cols++){
                mines[rows][cols]=false;
                locatedMines[rows][cols]=false;
                tiles[rows][cols].setBackground(null);
                tiles[rows][cols].setIcon(null);
            }
        }
        
        makeMines();
    }
    

    
    public MineWalkerGrid(int d){
        
        gridDimensions = d;
        pictureColors = new Color[gridDimensions][gridDimensions];
        tiles = new JButton[gridDimensions][gridDimensions];
        locatedMines = new boolean[gridDimensions][gridDimensions];
        makeMines();
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(800, 800));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	tiles[i][j].addActionListener(this);
                tiles[i][j].addMouseListener(new rightClickListener());
         	add(tiles[i][j]);
            }
        }
    }
    /**
     * 
     */
    public void showPath(){
        MineWalkerPath newPath = new MineWalkerPath(gridDimensions, mines);
        
        this.path = newPath.getPath();
        
        for(Point p : path){
           tiles[p.x][p.y].setBackground(Color.BLACK);
        }
        
    }

    private void locateClicked(JButton c){
        
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
    
    private void paintTiles(int x, int y){
        if(x!=0){
            if(mines[x-1][y]){
                mineCount++;
            }
        }
        if(y!=0){
            if(mines[x][y-1] && y!=0){
                mineCount++;
            }
        }
        if(x!=gridDimensions-1){
            if(mines[x+1][y]){
                mineCount++;
            }
        }
        if(y!=gridDimensions-1){
            if(mines[x][y+1]){
                mineCount++;
            }
        }
        
        if(y!=0 && x!=0){
            if(mines[x-1][y-1]){
                mineCount++;
            }
        }
        
        if(x!=gridDimensions-1 && y!=gridDimensions-1){
            if(mines[x+1][y+1]){
                mineCount++;
            }
        }
        if(x!=gridDimensions-1 && y!=0){
            if(mines[x+1][y-1]){
                mineCount++;
            }
        }
        if(x!=0 && y!=gridDimensions-1){
            if(mines[x-1][y+1]){
                mineCount++;
            }
        }
        
        
        tiles[x][y].setBackground(buttonColors[mineCount]);
        mineCount = 0;
        
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        paintTiles(clickedX, clickedY);
        checkForMine(clickedX, clickedY);
        
    }
    
    public void makeMines(){
        mines = new boolean[gridDimensions][gridDimensions];
        //start for loop at 1 so 0, 0 is not a mine
        //end for loop at tiles.length-1 is last tile is not a mine
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0 ; cols < tiles[rows].length;cols++){
                int percentMines = (int)(Math.random()*100);
                if(percentMines>80)  {
                        if(rows ==0 && cols==0 || 
                                rows == gridDimensions-1 && cols==gridDimensions-1){
                        }else{
                        
                            mines[rows][cols] = true;
                        }
                }
            }
         
        }

    }
    
    
    public void showMines(){
        
        for(int rows = 0; rows < tiles.length; rows++){
            for(int cols = 0; cols < tiles[rows].length; cols++){
                if(mines[rows][cols]){
                    tiles[rows][cols].setBackground(Color.RED);
                }
            }
        }
    }
    
    public void checkForMine(int MineX, int MineY){
        
        if(mines[MineX][MineY]){
            System.out.println("You lose");
            showMines();
        }
        System.out.println("Keep playing");
    }
    
    
    public void identifyMines(int MineX, int MineY){
        
  
        if(!locatedMines[MineX][MineY]){
            
            tiles[MineX][MineY].setIcon(flag);
            locatedMines[MineX][MineY]=true;
        }else{
            //System.out.println("identify mine");
            tiles[MineX][MineY].setIcon(null);
            locatedMines[MineX][MineY]=false;
        }

    }
    
    private boolean isDone(){
        for(int rows = 0; rows < mines.length; rows++){
            for(int cols = 0; cols < mines[rows].length; cols++){
                if(mines[rows][cols]!=locatedMines[rows][cols]){
                    return false;
                }
            }
        }
        return true;
    }
    
    private class rightClickListener extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e) 
        {    // write here your event handling code

      System.out.println(e.getModifiersEx());
            if (e.getModifiersEx() == 256)
            {

                //System.out.println(e.getSource());
                locateClicked((JButton) e.getSource());
                identifyMines(clickedX, clickedY);
                if(isDone()){
                   System.out.println("YOU WIN!"); 
                }
            }
        }
    } 
    
}
