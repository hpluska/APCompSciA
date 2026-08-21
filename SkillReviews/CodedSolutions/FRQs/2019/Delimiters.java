import java.util.*;

public class Delimiters
{
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
    * close delimiter.
    * Precondition: open and close are non-empty strings.
    */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    { 
            ArrayList<String> delimiters = new ArrayList<String>();
            /* to be implemented in part (a) */ 
            for(int i = 0; i < tokens.length; i++){
                if(i%2 == 0){
                    delimiters.add(tokens[i]);
                }

            }
        return delimiters;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
    * Precondition: delimiters contains only valid open and close delimiters.
    */
    public boolean isBalanced(ArrayList<String> delimiters)
    { 
        /* to be implemented in part (b) */ 
        int openCount = 0;
        int closeCount = 0;
        for(String d: delimiters){
            if(d.equals(openDel)){
                openCount++;
            }
            if(d.equals(closeDel)){
                closeCount++;
            }
        }

        return (openCount == closeCount);
    }
    // There may be instance variables, constructors, and methods that are not shown.
} 
