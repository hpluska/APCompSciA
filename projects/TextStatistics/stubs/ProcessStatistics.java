
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
        
                File file = new File(args[0]);

                if(file.exists()){

                    TextStatistics ts = new TextStatistics(file);
                    
                }
    
    }
    
}
