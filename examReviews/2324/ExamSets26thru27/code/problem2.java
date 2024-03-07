import java.util.ArrayList;

public class problem2 {

    public static void main(String args[]){
        ArrayList<String> someList = new ArrayList<String>();
        //{bat   dog   cat   sat   rat   rat  rat}

        someList.add("bat");
        someList.add("dog");
        someList.add("cat");
        someList.add("sat");
        someList.add("rat");
        someList.add("rat");
        someList.add("rat");

        removeWord(someList, "rat");

        for(int i = 0; i < someList.size(); i++){
            System.out.println(someList.get(i));
        }
    }


    /** @param wordList an ArrayList of String objects
    *  @param word the word to be removed
    *  Postcondition:  All occurrences of word have been removed from
    *  wordList.
    */
    public static ArrayList<String> removeWord(ArrayList<String> wordList, String word){
        for(int i = 0; i < wordList.size();i++){
            if(wordList.get(i).equals(word)){
                wordList.remove(i);
                //i--;
            }
        }
    return wordList;
    }     

}
