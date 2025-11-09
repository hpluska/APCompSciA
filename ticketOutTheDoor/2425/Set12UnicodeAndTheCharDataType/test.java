public class test{

    public static void main(String args[]){

        //char i = (char)999999999;
        // for(char i = 0;i < 4000; i++){
        //     System.out.println(i);
        // }

        // for(char i = '+'; i < '='; i++){
        //     System.out.print(i + " ");
        // }
// System.out.println();
//         for(int j = 30; j < 65; j++){
//             System.out.print((char)j + " ");
//         }

//         String word = "WOW";

//         int j = 0;
        
//         String result = "Palindrome";
        
    
//         for(int i = word.length()-1; i > 0; i--){
        
//             if(word.charAt(i) != word.charAt(j)){
        
//                  result = "Not a palindrome";
        
//              }
        
//         j++;
        
//         }
        
//         System.out.println(result);

        String word2 = "Code is Cool!";
        for(int i = 0; i < word2.length() - 1; i++){

            if(word2.charAt(i)  >= 65 && word2.charAt(i) <=90){
       
                          System.out.print((char) (word2.charAt(i) + 32));
       
           }else{
       
                System.out.print(word2.charAt(i));
           }
       
       
       
       
       
//        }



    }
}
