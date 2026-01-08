public class Caesar{
    public static void main(String args[]){

        String word = "CODE";
        int shift = 30;
        String encrypted = ""; 
        
        int letter = 0; 
        
        while(letter < word.length()){ 
        
             int let = word.charAt(letter);
             char temp = (char)(((let - 65 + shift)%26)+65);       
             encrypted += temp;        
             letter++; 
        
        }

        System.out.println(encrypted);















    //     if(shift < 0){
    //         shift = 26 - shift%26;
    //     }
    //     String result = "";

    //     for(int i = 0; i < word.length(); i++){

    //         int let = word.charAt(i) + shift;
    //         int encryptedAscii = ((let - 65)%26) + 65;
    //         char encryptedLet = (char) encryptedAscii;
    //         result = result + encryptedLet;
       
    //    }
    //    System.out.println(result);
    }
}