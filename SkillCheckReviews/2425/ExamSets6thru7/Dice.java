import java.util.Scanner;

public class Dice {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number");
        int num1 = input.nextInt();
        System.out.println("Type another number");
        int num2 = input.nextInt();

        int roll1 = (int)(Math.random()*num1 + 1);
        int roll2 = (int)(Math.random()*num2 + 1);
        boolean result = (roll1 == roll2);

        System.out.println("You rolled a " + roll1 + " and a " + roll2 + ". " + result);
        
    }
    
}
