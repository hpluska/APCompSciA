import java.util.*;

public class Driver {
    public static void main(String args[]){
        //FrogSimulation f = new FrogSimulation(10, 5);
        //System.out.println(f.runSimulations(100));

        //String[] moreWords = {"the", "red", "fox", "the", "red"};
        //WordPairList wpl = new WordPairList(moreWords);
        //System.out.println(wpl.numMatches());

        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        System.out.println(sc1.isValid("happy$"));
        
    }
    
}
