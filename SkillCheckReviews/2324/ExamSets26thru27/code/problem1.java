import java.util.*;

public class problem1{

    private static List<String> listOfWords; 
    public static void main(String args[]){
        listOfWords = new ArrayList<String>();

        listOfWords.add("one");
        listOfWords.add("two");
        listOfWords.add("three");
        listOfWords.add("four");
        listOfWords.add("five");
        System.out.println(wordsWithCommas());
    }

 
    public static String wordsWithCommas() {   
        String result = "{"; 
 
        int sizeOfList = listOfWords.size(); 
 
        for (int k = 0; k < sizeOfList; k++)   {
        //for (int k = 0; k <= sizeOfList; k++)   {    //out of bounds as written 
          /* Modify the code */
          result = result + listOfWords.get(k);//need to get the value
            if(k != sizeOfList-1)
                 result = result + ", ";  

        }//end for 
        result = result + "}";   
        
        return result; 
    }//end method

}//end class