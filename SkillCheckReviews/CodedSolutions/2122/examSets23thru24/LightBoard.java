public class LightBoard{
private boolean[][] lights; 
/** Constructs a LightBoard object having numRows rows and numCols columns 
 *  Precondition: numRows > 0, numCols > 0 
 *  Postcondition: each light has a 60% probability of being set to on  
 */ 
    public LightBoard(int numRows, int numCols) {    
        /* To be implemented in part (a)  */  
        lights = new boolean[numRows][numCols];
        for(int row = 0; row < lights.length; row++){
            for(int col = 0; col < lights[row].length; col++){
                lights[row][col] = (Math.random() > .4);
            }
        }  
    } 

    public boolean evaluateLight(int row, int col)  { 
        /* to be implemented in part (b) */ 
        int count = 0;
        for(int r = 0; r < lights.length; r++){
            if(lights[r][col]){
                count++;
            }
        }
        if(!lights[row][col] && count%2!=0){
            return false;
        }
        if(lights[row][col] && count%3 == 0){
            return true;
        }
        return lights[row][col];
    } 

    public boolean[][] getLights(){
        return lights;
    }
}