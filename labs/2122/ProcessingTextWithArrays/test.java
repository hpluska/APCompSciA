import java.util.Scanner;

public class test{
    public static void main(String text[]){

        System.out.println(text[0]);
        String words[]  = text[0].split(" ");
        int wordCount = 0;


        Scanner sc = new Scanner(text[0]);

        while(sc.hasNext()){
            wordCount++;
            String word = sc.next();
        }
        
        System.out.println(wordCount);

        // int wordCount = 0;
        // int letterCount[] = new int[26];
        // Scanner sc = new Scanner(text[0]);
        // while(sc.hasNext()){
        //     String word = sc.next();
        //     for(int i = 0; i < word.length(); i++){
        //         letterCount[word.charAt(i) - 65]++;
        //     }
        //     wordCount++;
        // }
        // System.out.println(wordCount);

        // String words[] = text[0].split(" ");
        // System.out.println(words.length);

        // if(text.length < 1){
        //     System.out.println("please provide some text USAGE: java processText 'your text'");
        //     System.exit(0);
        // }
        // Scanner sc = new Scanner(text[0]);
        // int wordCount = 0;
        // while(sc.hasNext()){
        //     wordCount++;
        //     System.out.println(sc.next());
        // }

 




    }
}