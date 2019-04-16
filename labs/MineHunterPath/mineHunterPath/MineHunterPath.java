/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minehunter;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author timberlinepluska
 */
public class MineHunterPath {
    
	private int gridDimensions;
	private Point start;
	private Point end;
	private Point current;
	private ArrayList<Point> path = new ArrayList<Point>();
	private boolean done;
        private boolean[][] mines;
        private int x, y;
        
        public MineHunterPath(int gridDimensions, boolean[][] mines){
            
            this.mines = mines;
            this.gridDimensions = gridDimensions;
            this.start = new Point(0,0);
            this.end = new Point(gridDimensions-1, gridDimensions-1);
            this.current = start;
            this.done = false;
            path.add(start);
          
        }
       
        /**
         * Adds the next available tile to the path ArrayList
         * step continues until isDone is true
         * If no tile is available, the grid will reset
         */
        private void step(){

        }
        /**
         * sets the grid back to the starting point and 
         * clears the path ArrayList
         */
        private void reset(){

        }
        /**
         * Randomly locates the next available tile in the right
         * or down position.
         * Tiles that contain Mines are not available
         * @return the next tile as a Point on the grid
         */
        private Point getNext(){
            
           
                return new Point(x,y);
            
        }
        /**
         * returns the path of points
         * @return 
         */
        public ArrayList<Point> getPath(){

            return path;
        }
        /**
         * checks if the end of the grid has been reached
         * @return whether or not the end is reached
         */
        private boolean isDone(){

            return false;
        }
        
        
    
}
