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

//TODO: implement the TextStatisticsInterface
public class TextStatistics implements TextStatisticsInterface{

    //Declare additional variables here
    private File textFile;
    private Scanner fileScan;
    //Be mindful of these when counting the words and their lengths
    //They should not be included as words or counted in the length of the word
    private final String REGEX = "\\W+";
    private int lineCount, wordCount, charCount, letterCount[], wordLengthCount[];
    private double averageWordLength;
    private String results;
   
z

    public TextStatistics(File file) {
        
        textFile = file;

        try {

            fileScan = new Scanner(textFile);
            
            while(fileScan.hasNextLine()){
                String line = fileScan.nextLine();

                lineCount++;
            }
		
  
            
        } catch (FileNotFoundException ex) {

            System.out.println("File cannot be located.");
        }
    
    }
    
    @Override
    public int getLineCount() {

        return lineCount;
    }

    @Override
    public int getWordCount() {

        return wordCount;
    }

    @Override
    public int getCharCount() {

        return charCount;
    }

    @Override
    public int[] getLetterCount() {

        return letterCount;
    }

    @Override
    public int[] getWordLengthCount() {

        return wordLengthCount;
    }

    @Override
    public double getAverageWordLength() {

        return averageWordLength;
    }
    

    //TODO: Complete the toString method which prints out the results
    public String toString(){
	
  	return results;
    }
    
}
