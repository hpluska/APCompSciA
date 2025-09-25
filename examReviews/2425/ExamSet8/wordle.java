public class wordle {
    public static void main(String args[]){
        String secret = "cat";
        String guess = "AND";
        String guessFirst = guess.substring(0, 1).toLowerCase();

        String result = "";
        String first = secret.substring(0, 1);
        String second = secret.substring(1, 2);
        String third = secret.substring(2);

        if(guessFirst.equals(first)){
            result = guess;
        }else if(guessFirst.equals(second) || guessFirst.equals(third)){
            result = "*";
        }else{
            result = "_";
        }
        System.out.println(result);

    }
    
}
