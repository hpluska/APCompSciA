import java.util.Scanner;

public class arithmetic2 {
public static void main(String args[])
System.out.println("Make your arithmetic selection from the choices below:\n");

System.out.println(" A. Addition ");
System.out.println(" S. Substraction ");
System.out.println(" M. Multiplication ");
System.out.println(" D. Division ");

System.out.println(" Your choice? ");

Scanner kbReader = new Scanner(System.in);

String choice = kbReader.nextLine();

System.out.println("\nEnter first operand");
double op1 = kbReader.nextDouble();
System.out.println("\nEnter second operand");
double op2 = kbReader.nextDouble();

System.out.println("");

switch(choice) {

case "A":
System.out.println(op1 + " plus " + op2 + "=" + (op1+op2));
break;

case "S":
System.out.println(op1 + " minus " + op2 + "=" + (op1-op2));
break;

case "M":
System.out.println(op1 + " times " + op2 + "=" + (op1*op2));
break;

case "D":
System.out.println(op1 + " divided by " + op2 + "=" + (op1/op2));
break;

default:
System.out.println("Hey dummy, enter only A, S, M, or D!");
}
}
