public class example{


    public static void main(String args[]){
        System.out.println(removeSpaces("taco cat"));
    }

    public static String removeSpaces(String phrase){
        String result = "";
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) != ' '){
                result+= phrase.charAt(i);
            }
        }
        return result;

    }
    public static String reversePhrase(String phrase){
        String result = "";
        for(int i = phrase.length() - 1; i >=0; i--){
            result += phrase.charAt(i);
        }
        return result;
    }

    

}