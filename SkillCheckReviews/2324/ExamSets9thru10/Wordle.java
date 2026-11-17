public class Wordle {

    public static void main(String args[]) {
        String word = "EARTH";
        String guess = "AMPLE";
        String result = "";
        for (int i = 0; i < guess.length(); i++) {
  
            String temp = guess.substring(i, i + 1);
            boolean found = false;

            for (int j = 0; j < word.length(); j++) {

                if(temp.equals(word.substring(j, j + 1))){
                    found = true;
                }
            }
            //if the temp letter is in the same position in the guess
            //we got the letter
            if(temp.equals(word.substring(i, i + 1))){
                result += temp;
            //if the found is true, the letter is in the word, but wrong location
            }else if(found){
                result += "*";
            //otherwise the letter is not in the word
            }else{
                result += "_";
            }
            //reset false and keep checking
            found = false;
        }
        System.out.println(result);
    }
}
