public class WordManip {
    public static void main(String args[]){
        String word = "ABRACADABRA";
        String letter = "X";
        String result = "";
        for(int i = 0; i < word.length(); i++){
            if(word.substring(i, i + 1).equals(letter)){
                result += "";
            }else{
                result += word.substring(i, i + 1);
            }
        }

        System.out.println(result);
    }
}
