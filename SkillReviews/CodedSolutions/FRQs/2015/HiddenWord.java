public class HiddenWord
{
 private String word;
 public HiddenWord(String hWord)
 {
    word = hWord;
 }

 public String getHint(String guess){
    String hint = "";
    for (int i = 0; i < guess.length(); i++){
        if (guess.substring(i,i+1).equals(word.substring(i,i+1))){
            hint += guess.substring(i,i+1);
        } else if (word.indexOf(guess.substring(i,i+1))!= -1){
            hint += "+";
        } else {
            hint += "*";
        }
    }
 return hint;
 }


public String getHint2(String guess){
    String hint = "";
    boolean inWord = false;
    for (int i = 0; i < guess.length(); i++){
        if (guess.substring(i,i+1).equals(word.substring(i,i+1))){
            hint += guess.substring(i,i+1);
        } else{
            for(int j = 0; j < word.length(); j++){
                if(guess.substring(i, i+1).equals(word.substring(j, j+1))){
                    hint += "+";
                    inWord = true;
                }
            }
            if(!inWord){
                hint += "*";
            }
            
        }
        inWord = false; 
    }
 return hint;
 }
} 