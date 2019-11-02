public class test{

    public static void main(String args[]){

       
            for(int l = 35; l < 65; l++){

                char c = (char)l;
                System.out.println(c);
            }

            for(char l = '+'; l < '='; l++){

                int i = l;
                System.out.println(i);
            }

            String word = "tacocat1";
            String reverse = "";
            int lastChar = word.length()-1;
            String msg = "";
            while(lastChar >=0){
                if(word.charAt(lastChar) != word.charAt(word.length()-1-lastChar)){
                    msg = "NO!";
                    break;
                }else{
                    msg = "Palindrome!";
                }
                lastChar--;
            }
            System.out.println(msg);
    }
}