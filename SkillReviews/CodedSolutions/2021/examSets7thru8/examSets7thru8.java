import java.io.*;
import java.util.*;

public class examSets7thru8{

	public static void main(String args[]){


	/*******************************
	******Swap**********************
	*******************************/

	int a = 6; 
	int b = 3;
	int temp;
	if(a > b){
		temp = a;
		a = b;
		b = temp;
	}
	System.out.println(a + "," + b);

	/*******************************
	******Hang Man******************
	*******************************/
	String word = "cat";
	String letters = "_ _ _";
	String guess;

	Scanner s = new Scanner(System.in);

	System.out.println("Guess a letter");
	guess = s.next();
	guess = guess.toLowerCase();

	if(guess.equals(word.substring(0,1))){

		System.out.println(guess + " _ " + " _ ");

	}else if(guess.equals(word.substring(1, 2))){

		System.out.println(" _ " + guess + " _ ");

	}else if(guess.equals(word.substring(2))){

		System.out.println(" _ " + " _ " + guess);

	}else{
		System.out.println("Not in word");
	}
	


	}
}
