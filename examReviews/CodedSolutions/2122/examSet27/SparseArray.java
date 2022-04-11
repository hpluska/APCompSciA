import java.util.ArrayList;

public class SparseArray {   
    /** The number of rows and columns in the sparse array. */   
    private int numRows;   
    private int numCols; 
    /** The list of entries representing the non-zero elements of the 
     *  sparse array. Entries are stored in the list in no particular order.
     *  Each non-zero element is represented by exactly one entry in 
     *  the list.     
    */   
    private ArrayList<SparseArrayEntry> entries;   
    /** Constructs an empty SparseArray. */   
    public SparseArray()   {  
              entries = new ArrayList<SparseArrayEntry>();  
    } 
    /**
     * Added so we can access the array
     * @return
     */
    public ArrayList<SparseArrayEntry> getSparseArray(){
        return entries;
    }
    /**
     * Added method so we can add entries
     * @param row
     * @param col
     * @param val
     */
    public void addEntry(int row, int col, int val){
        entries.add(new SparseArrayEntry(row, col, val));
    }
     
    /** Returns the number of rows in the sparse array. */   
    public int getNumRows()   {  
        return numRows;  
    } 
     
    /** Returns the number of columns in the sparse array. */   
    public int getNumCols()   {  
        return numCols;  
    } 
     
    /** Returns the value of the element at row index row and column 
     *  index col in the sparse array.
     *  Precondition:  0 ≤ row < getNumRows()    
     *  0 ≤ col < getNumCols()     
    */   
         public int getValueAt(int row, int col)   {  
              /* implementation not shown */ 
              return 0; 
         } 
    
    /** Returns the col in which the first instance of an element is found 
     *  Precondition:  0 ≤ col < getNumCols()    
     *  0 ≤ col < getNumCols()     
    */   
    public int findCol(int value)   {  
              /* to be implemented in part (a) */  
        for(int e = 0; e < entries.size();e++){
            if(entries.get(e).getValue() == value){
                return entries.get(e).getCol();
            }
        }
    return 0; 
    }
    /** Removes the row from the sparse array.     
     *  Precondition:  0 ≤ row < getNumRows()     
     */   
         public void removeRow(int row)   {  
              /* to be implemented in part (b) */  
              //First lets remove the entries that correspond to the current row
              for(int e = 0; e < entries.size(); e++){
                if(entries.get(e).getRow() == row){
                      entries.remove(e);
                      e--;
                }  
              }

              //now we will update the entries with a row greater than the current row
              for(int e = 0; e < entries.size(); e++){
                if(entries.get(e).getRow() > row){
                    entries.set(e, new SparseArrayEntry(entries.get(e).getRow()-1, entries.get(e).getCol(), entries.get(e).getValue()));
                }  
              }
              
              
         } 
    // There may be instance variables, constructors, and methods that are not shown. 
    } 
    
