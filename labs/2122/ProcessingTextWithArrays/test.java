import java.util.Scanner;

public class test{
    public static void main(String text[]){

        if(text.length < 1){
            System.out.println("please provide some text USAGE: java processText 'your text'");
            System.exit(0);
        }
        Scanner sc = new Scanner(text[0]);
        int wordCount = 0;
        while(sc.hasNext()){
            wordCount++;
            System.out.println(sc.next());
        }

 




    }
}