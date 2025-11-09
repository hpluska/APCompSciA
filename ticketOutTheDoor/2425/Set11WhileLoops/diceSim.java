import java.util.Scanner;

public class diceSim {
    public static void main(String args[]){
        String ans = "";
        do{
            System.out.println("Wanna roll some dice? Type y to roll, anything else to quit.");
            Scanner sc = new Scanner(System.in);
            ans = sc.next();
            int die1 = (int)(Math.random()*6+1);
            int die2 = (int)(Math.random()*6+1);
            if(die1 == die2){
                System.out.println("Match!");
            }
            System.out.println("You rolled a " + die1 + " and a " + die2);

        }while(ans.equals("y"));
    }
    
}
