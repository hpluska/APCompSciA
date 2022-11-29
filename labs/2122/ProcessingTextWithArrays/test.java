import java.util.Scanner;

public class test{
    public static void main(String text[]){
        int wordCount = 0;
        Scanner sc = new Scanner(text[0]);
        while(sc.hasNext()){
            String temp = sc.next();
            wordCount++;
        }
        System.out.println(wordCount);
    }
}