/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package minehunter;


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
public class MineHunterGrid extends JPanel implements ActionListener {
    
    private JButton[][] tiles;
    private JButton clicked;
    private int clickedX, clickedY, mineCount=0;
    private int gridDimensions;
    private Color[][] pictureColors;
    private MineHunterControls controls;
    private Color buttonColor = null;
    private boolean[][] mines;
    private boolean[][] locatedMines;
    private ImageIcon flag = new ImageIcon("images/flag.jpg");
    private Color[] buttonColors = {Color.WHITE, Color.GRAY, Color.GREEN, Color.YELLOW, Color.PINK, Color.BLUE, Color.RED, Color.BLACK};
    private ArrayList<Point> path = new ArrayList<Point>();
    
    public void doButtonAction(int i) {
        if(i == 0){
            resetGame();
        }else if(i == 1){
            showPath();
        } else if(i == 2){
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
    

    
    public MineHunterGrid(int d){
        
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

    public void showPath(){
        MineHunterPath newPath = new MineHunterPath(gridDimensions, mines);  
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
        //Developed in a previous lab
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
        //start for loop at 1, 0 is not a mine
        //end for loop at tiles.length-1, this last tile is not a mine
        for(int rows = 1; rows < tiles.length-1; rows++){
            for(int cols = 1; cols < tiles[rows].length-1;cols++){
                int percentMines = (int)(Math.random()*100);
                if(percentMines>80){
                      mines[rows][cols] = true;
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
        
        //developed in a previous lab
    }
    
    
    public void identifyMines(int MineX, int MineY){
        
        System.out.println("identify mine");
        if(!locatedMines[MineX][MineY]){
            tiles[MineX][MineY].setIcon(flag);
            locatedMines[MineX][MineY]=true;
        }else{
            tiles[MineX][MineY].setIcon(null);
            locatedMines[MineX][MineY]=false;
        }

    }
    
    private boolean isDone(){
        //Developed in a previous lab
        return true;
    }
    
    private class rightClickListener extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e) 
        {    // write here your event handling code
            if (e.getModifiers() == MouseEvent.BUTTON3_MASK)
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
