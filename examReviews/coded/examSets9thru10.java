import java.io.*;
import java.util.*;

public class examSets9thru10{
	public static void main(String args[]){

	//Number 1
	int x = 2, p = 5, y = -8;
	switch(x){
		case 2:
			p++;
		case 3:
		case 4:
			y+=(p--);
			break;
		case 5:
			y+=(p++);
	}
	System.out.println(y);

	String s = "Red";
	int q = 0;
	switch(s){
		case "Red":
			q++;
		case "Green":
			q++;
		case "Blue":
			q++;
		case "Yellow":
			q++;
		default:
			q++;
	}
	System.out.println(q);

	//Number 2
	Scanner sc = new Scanner(System.in);
	System.out.println("Ask me a 'yes' or 'no' question");
	String q2 = sc.nextLine();

	int die = (int)(Math.random()*20);
	String msg = "";
	switch(die){
		case 0:
			msg = "maybe";
			break;
		case 1:
			msg = "unlikely";
			break;
	
	}
	System.out.println(msg);

	System.out.println("Type a phrase");
	String word = sc.nextLine();
	String wordR = "";
	
	for(int w = word.length(); w > 0; w--){
		
		wordR += word.substring(w-1, w);

	}System.out.println(wordR);

	if(wordR.equals(word))
		System.out.println("Palindrome");
	else
		System.out.println("Not!");

//Number 4
	for(int row = 0; row < 10; row++){

		for(int col = 0; col < 10; col++){
			System.out.print("*");	
		}
	System.out.println();
	}


	for(int row = 0; row < 10; row++){

		for(int col = 10; col > row; col--){
			System.out.print("*");	
		}
	System.out.println();
	}
	for(int row = 0; row < 10; row++){

		for(int col = 0; col < row; col++){
			System.out.print("*");	
		}
	System.out.println();
	}
	




	

	}
}


