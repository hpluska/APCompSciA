import java.util.*;

public class Driver {
    public static void main(String args[]){
   
        /*
        Delimiters d = new Delimiters("(", ")");
        //below creates an array and populates it for testing purposes

        String tokens[] = new String[11];
        tokens[0] = "(";//open delimiter
        tokens[1] = "stuff";
        tokens[2] = ")";//close delimiter
        tokens[3] = "more stuff";
        tokens[4] = "(";//open delimiter
        tokens[5] = "more and more stuff";
        tokens[6] = "(";//open delimiter
        tokens[7] = "more and more and more stuff";
        tokens[8] = ")";//close delimiter
        tokens[9] = "more and more and more and more stuff";
        tokens[10] = ")";//close delimiter

        ArrayList<String> tokenList = d.getDelimitersList(tokens);
        for(String s: tokenList){
            System.out.print(s);
        }

        System.out.println(d.isBalanced(tokenList));
        */

        LightBoard lb = new LightBoard(10, 10);
        System.out.println(lb.evaluateLight(0, 1));

    }
    
}
