
import java.io.File;

/**
 * @author Pluska
 */

public class ProcessStatistics{
    
    public static void main(String[] args){


        //TODO: Implementa an if statement to check if the array args is greater than 0
        //if it is, you can continue otherwise your program should close
        //and provide the user with a usage statement

        //The code below creates a new file object with with the first file in the 
        //args array.  You need to modify this code so that it processes all
        //files passed to the program.  You will need to implement a loop to do this. 
        
                File file = new File(args[0]);//args[0] is the first file

                //This checks to see if the file the user provided exists.  Add an
                //else clause to this statement so that if the file is not found
                //a meaningful message is printed
                if(file.exists()){

                    TextStatistics ts = new TextStatistics(file);

			        System.out.println(ts.getLineCount());
                    
                }
    
    }
    
}
