import java.util.Scanner;

public class arithmetic {
    public static void main(String args[]) {
        System.out.println("Make your arithmetic selection from the choices below:\n");

        System.out.println(" 1. Addition ");
        System.out.println(" 2. Substraction ");
        System.out.println(" 3. Multiplication ");
        System.out.println(" 4. Division ");

        System.out.println(" Your choice? ");

        Scanner kbReader = new Scanner(System.in);

        int choice = kbReader.nextInt();

        System.out.println("\nEnter first operand");
        double op1 = kbReader.nextDouble();
        System.out.println("\nEnter second operand");
        double op2 = kbReader.nextDouble();

        System.out.println("");

        switch (choice) {

            case 1:
                System.out.println(op1 + " plus " + op2 + "=" + (op1 + op2));
                break;

            case 2:
                System.out.println(op1 + " minus " + op2 + "=" + (op1 - op2));
                break;

            case 3:
                System.out.println(op1 + " times " + op2 + "=" + (op1 * op2));
                break;

            case 4:
                System.out.println(op1 + " divided by " + op2 + "=" + (op1 / op2));
                break;

            default:
                System.out.println("Hey dummy, enter only 1, 2, 3, or 4!");
        }
    }
}
