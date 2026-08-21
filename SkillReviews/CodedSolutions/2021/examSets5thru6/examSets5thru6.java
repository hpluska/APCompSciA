import java.io.*;
import java.util.*;

public class examSets5thru6{

	public static void main(String args[]){

		/****************
		Number 1
		****************/
		//part a
		double b1 = 2.0, b2 = 3.0;
		b1 = Math.pow(b1, b2);

		//part b
		int c1 = 2, c2 = -3;
		int c3 = c1 * Math.abs(c2);

		//part c
		double d1 = Math.random()*100+100;

		//part d
		double e1 = 3.0;
		double e2 = Math.sqrt(e1);

		//part e
		double f2, f1 = 2;
		f2 = f1*Math.PI;
		
		/****************
		Number 2
		****************/
		//part a
		System.out.println(Math.ceil(-157.2));

		//part b
		System.out.println(Math.floor(-157.2));

		//part c
		System.out.println(Math.round(-157.2));

		/****************
		Number 3
		****************/

		//part a
		Scanner kbreader = new Scanner(System.in);
		
		//part b
		System.out.println("How old are you?");
		int age = kbreader.nextInt();

		//part c
		System.out.println("What is your name?");
		kbreader.next();
		String name = kbreader.nextLine();

		/****************
		Number 4
		****************/
		System.out.println("Type a negative number: ");
		int negNum = kbreader.nextInt();
		System.out.println("Type a positive number that is greater than " + Math.abs(negNum));
		int posNum = kbreader.nextInt();

		int range = posNum - negNum;
		int shift = Math.abs(negNum);

		int randNum1 = (int)(Math.random()*range-shift);
		int randNum2 = (int)(Math.random()*range-shift);

		System.out.println("You got a " + randNum1 + " and " + randNum2);	

		


	}

}
