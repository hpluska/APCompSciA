public class Caesar{
    public static void main(String args[]){

        String word = "VAMPIRE";
        int shift = 7;
        if(shift < 0){
            shift = 26 - shift%26;
        }
        String result = "";

        for(int i = 0; i < word.length(); i++){

            int let = word.charAt(i) + shift;
            int encryptedAscii = ((let - 65)%26) + 65;
            char encryptedLet = (char) encryptedAscii;
            result = result + encryptedLet;
       
       }
       System.out.println(result);
    }
}