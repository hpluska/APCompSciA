import java.util.Scanner;

public class main{
    public static void main(String args[]){

        /*Problem 1*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = sc.nextLine();
        int randLoc = (int)(Math.random()*word.length());
        String firstHalf = word.substring(0,randLoc);
        String secondHalf = word.substring(randLoc);
        String scrambledWord = (secondHalf+firstHalf).toUpperCase();
        System.out.println(scrambledWord);

        /*Problem 2*/
        System.out.println("Give me an integer (4 - 12)");
        int num1 = sc.nextInt();
        System.out.println("Give me another integer (4 - 12)");
        int num2 = sc.nextInt();
        int roll1 = (int)(Math.random()*num1+1);
        int roll2 = (int)(Math.random()*num2+1);

        System.out.println("You rolled " + roll1 + " and " + roll2);


    }
}