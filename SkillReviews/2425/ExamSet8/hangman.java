public class hangman {
    public static void main(String args[]){
        String secret = "cat";
        String guess = "A";
        guess = guess.toLowerCase();
        String result = "";
        
        if(secret.substring(0, 1).equals(guess)){
            result = guess + "_"+ "_";
        }else if(secret.substring(1, 2).equals(guess)){
            result = "_" + guess + "_";
        }else if(secret.substring(2).equals(guess)){
            result = "_" + "_" + guess;
        }else{
            result = "_" + "_"+ "_"; 
        }
        System.out.println(result);
    }
}
