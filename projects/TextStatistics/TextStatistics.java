import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 *
 * @author Pluska
 */

public class TextStatistics implements TextStatisticsInterface{

    //Declare additional variables here
    private File textFile;
    private Scanner fileScan;
    private final String REGEX = "\\W+";
    private int lineCount, wordCount, charCount, letterCount[], wordLengthCount[];
    private double averageWordLength;
    private String results;
   

    public TextStatistics(File file) {
        
        textFile = file;

        try {
            /*The statement below creates a new scanner object and passes 
            the textFile you will analyze to it*/
            
            fileScan = new Scanner(textFile);
            
            /*The while loop below checks to see if there is a new line
            in the file.  And if there is assigns that line to the variable 
            line and counts it.  All the code requried to analyze the file
            will go below.*/
            while(fileScan.hasNextLine()){
                String line = fileScan.nextLine();

                lineCount++;
            }
		
  
        //DO NOT EDIT    
        } catch (FileNotFoundException ex) {

            System.out.println("File cannot be located.");
        }
    
    }
    //DO NOT EDIT
    @Override
    public int getLineCount() {

        return lineCount;
    }
    //DO NOT EDIT
    @Override
    public int getWordCount() {

        return wordCount;
    }
   //DO NOT EDIT
    @Override
    public int getCharCount() {

        return charCount;
    }
   //DO NOT EDIT
    @Override
    public int[] getLetterCount() {

        return letterCount;
    }
   //DO NOT EDIT
    @Override
    public int[] getWordLengthCount() {

        return wordLengthCount;
    }
   //DO NOT EDIT
    @Override
    public double getAverageWordLength() {

        return averageWordLength;
    }
    

    //TODO: Complete the toString method which prints out the results
    public String toString(){
	
  	return results;
    }
    
}
