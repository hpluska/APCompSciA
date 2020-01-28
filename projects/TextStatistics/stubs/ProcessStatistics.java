
import java.io.File;

/**
 *
 * 
 *
 *
 * @author Pluska
 */

public class ProcessStatistics{
    
    public static void main(String[] args){


		//if statement, is args.length > 0

		//while loop to check for all args
        
                File file = new File(args[0]);//replace 0 with variable

                if(file.exists()){

                    TextStatistics ts = new TextStatistics(file);

			        System.out.println(ts.getLineCount());
                    
                }
    
    }
    
}
