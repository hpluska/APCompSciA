public class LightBoard
{
    /** 
     * The lights on the board, where true represents on and false represents off.
     * */
    private boolean[][] lights;

    /** Constructs a LightBoard object having numRows rows and numCols columns.
    * Precondition: numRows > 0, numCols > 0
    * Postcondition: each light has a 40% probability of being set to on.
    */
    public LightBoard(int numRows, int numCols)
    { 
        /* to be implemented in part (a) */ 
        lights = new boolean[numRows][numCols];

        for(int rows = 0; rows < lights.length; rows++){
            for(int cols = 0; cols < lights[rows].length; cols++){
                lights[rows][cols] = (Math.random()>=.6);
            }
        }
    }
 
    /** Evaluates a light in row index row and column index col and returns a status
    * as described in part (b).
    * Precondition: row and col are valid indexes in lights.
    */
    public boolean evaluateLight(int row, int col)
    { 
        /* to be implemented in part (b) */ 
        int count = 0;
        for(int r = 0; r < lights.length; r++){
            if(lights[r][col] == true){
                count++;
            }
        }
        if(lights[row][col] && count%2 == 0){
            return false;
        }
        if(!lights[row][col] && count%3 == 0){
            return true;
        }
        return lights[row][col];
    }
 
    // There may be additional instance variables, constructors, and methods not shown.
} 
