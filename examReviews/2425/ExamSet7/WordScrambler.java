import java.util.Scanner;

public class WordScrambler{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word.");
        String word = input.next();
        int randPos = (int)(Math.random() * word.length());
        String scrambledWord = (word.substring(randPos) + word.substring(0, randPos)).toUpperCase();
        System.out.println(scrambledWord);
    }
}